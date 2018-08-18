package eleven_Thread.three_ThreadInterrupt;

class HelloThread extends Thread {
    volatile boolean running = true;
    public void run() {
        while (running) {
            System.out.println("Hello!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
                break;
            }
        }
        System.out.println("Thread end");
    }
}

public class Main {

    public static void main(String[] args) throws Exception{
        HelloThread t1 = new HelloThread();
        t1.start();
        Thread.sleep(1000);
        t1.running = false;
//        t1.interrupt();
        System.out.println("Main end");
    }
}
