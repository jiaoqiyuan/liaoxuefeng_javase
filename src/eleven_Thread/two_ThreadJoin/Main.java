package eleven_Thread.two_ThreadJoin;

class HelloThread extends Thread {
    String name;
    public HelloThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Hello, " + name + "!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception{
        Thread t1 = new HelloThread("Bob");
        System.out.println("START");
        t1.start();
        t1.join();
        System.out.println("END");
    }
}
