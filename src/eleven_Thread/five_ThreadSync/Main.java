package eleven_Thread.five_ThreadSync;

class AddThread extends Thread {
    public void run(){
        for (int i = 0; i < Main.LOOP; i++) {
            synchronized (Main.LOCK) {
                Main.count += 1;
            }
        }
    }
}

class DecThread extends Thread {
    public void run() {
        for (int i = 0; i < Main.LOOP; i++) {
            synchronized (Main.LOCK) {
                Main.count -= 1;
            }
        }
    }
}

public class Main {
    final static int LOOP = 10000;
    public static int count = 0;
    public static final Object LOCK = new Object();

    public static void main(String[] args) throws Exception{
        Thread t1 = new AddThread();
        Thread t2 = new DecThread();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count);
    }
}
