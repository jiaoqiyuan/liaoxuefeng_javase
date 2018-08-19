package eleven_Thread.nine_ConcurrentLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter {
    private Lock lock = new ReentrantLock();
    private int value = 0;

    public void add(int m) {
        lock.lock();
        try {
            this.value += m;
        } finally {
            lock.unlock();
        }
    }

    public void dec(int m) {
        lock.lock();
        try {
            this.value -= m;
        } finally {
            lock.unlock();
        }
    }

    public int get() {
        lock.lock();
        try {
            return this.value;
        } finally {
            lock.unlock();
        }
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
            public void run() {
                for (int i = 0; i < LOOP; i++) {
                    counter.dec(1);
                }
            }
        };

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.get());
    }
}
