package eleven_Thread.seven_ThreadDeadLock;

class ShareObject {
    final Object lockA = new Object();
    final Object lockB = new Object();

    int accountA = 1000;
    int accountB = 2000;

    public void a2b(int balance) {
        synchronized (lockA) {
            accountA -= balance;
            synchronized (lockB) {
                accountB += balance;
            }
        }
    }

    public void b2a(int balance) {
        synchronized (lockA) {
            accountA += balance;
            synchronized (lockB) {
            accountB -= balance;

            }
        }
    }
}

class AThread extends Thread {
    public void run() {
        for (int i = 0; i < Main.LOOP; i++) {
            Main.share.a2b(1);
            if (i % 100 == 0) {
                System.out.println(".");
            }
        }
    }
}

class BThread extends Thread {
    public void run() {
        for (int i = 0; i < Main.LOOP; i++) {
            Main.share.b2a(1);
            if (i % 100 == 0) {
                System.out.println(".");
            }
        }
    }
}

public class Main {
    final static int LOOP = 1000;
    public static ShareObject share = new ShareObject();

    public static void main(String[] args) throws Exception{
        Thread t1 = new AThread();
        Thread t2 = new BThread();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("END");
    }
}
