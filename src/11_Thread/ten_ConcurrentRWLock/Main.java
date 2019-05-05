package eleven_Thread.ten_ConcurrentRWLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class Counter {
    private ReadWriteLock lock = new ReentrantReadWriteLock();
    private Lock rlock = lock.readLock();
    private Lock wlock = lock.writeLock();

    private int value = 0;

    public void add(int m) {
        wlock.lock();
        try {
            this.value += m;
        } finally {
            wlock.unlock();
        }
    }

    public void dec(int m) {
        wlock.lock();
        try {
            this.value -= m;
        } finally {
            wlock.unlock();
        }
    }

    public int get() {
        rlock.lock();
        try {
            return this.value;
        } finally {
            rlock.unlock();
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
