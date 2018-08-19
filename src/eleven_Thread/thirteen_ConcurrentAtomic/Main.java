package eleven_Thread.thirteen_ConcurrentAtomic;

import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    private AtomicInteger value = new AtomicInteger(0);

    public int add(int m) {
        return this.value.addAndGet(m);
    }

    public int dec(int m) {
        return this.value.addAndGet(-m);
    }

    public int get() {
        return this.value.get();
    }
}

public class Main {
    final static int LOOP = 100;

    public static void main(String[] args) throws Exception{
        Counter counter = new Counter();
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < LOOP; i++) {
                    counter.add(1);
                }
            }
        };

        Thread t2 = new Thread() {
            public void  run() {
                for (int i = 0; i < LOOP; i++) {
                    counter.dec(1);
                }
            }
        };
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("END");
    }
}
