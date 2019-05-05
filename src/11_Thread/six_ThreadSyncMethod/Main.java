package eleven_Thread.six_ThreadSyncMethod;

class Counter {
    int count = 0;
    public synchronized void add(int n) {
        count += n;
    }

    public synchronized void dec(int n) {
        count -= n;
    }

    public int get() {
        return count;
    }
}

class AddThread extends Thread {
    Counter counter;

    public AddThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < Main.LOOP; i++) {
            counter.add(1);
        }
    }
}

class DecThread extends Thread {
    Counter counter;

    public DecThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < Main.LOOP; i++) {
            counter.dec(1);
        }
    }
}

public class Main {
    final static int LOOP = 10000;
    public static void main(String[] args) throws Exception{
        Counter counter = new Counter();
        Thread t1 = new AddThread(counter);
        Thread t2 = new DecThread(counter);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.get());
    }
}
