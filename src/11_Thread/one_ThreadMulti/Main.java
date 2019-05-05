package eleven_Thread.one_ThreadMulti;

class HelloThread extends Thread {
    String name;
    public HelloThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello, " + name + "!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception{
        Thread t1 = new HelloThread("Bob");
        Thread t2 = new HelloThread("Alice");
        t1.start();
        t2.start();
        for (int i = 0; i < 3; i++) {
            System.out.println("Main!");
            Thread.sleep(100);
        }
    }
}
