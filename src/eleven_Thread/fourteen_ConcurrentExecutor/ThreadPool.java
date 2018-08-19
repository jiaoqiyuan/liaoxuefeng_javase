package eleven_Thread.fourteen_ConcurrentExecutor;

import java.util.concurrent.*;

class PrintTask implements Runnable {
    String name;

    public PrintTask(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello, " + name + "!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}

public class ThreadPool {
    public static void main(String[] args) throws Exception{
        ExecutorService executor = new ThreadPoolExecutor(0, 10,
                60L, TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>());;
//        ExecutorService executor = Executors.newCachedThreadPool();
//        ExecutorService executor = Executors.newSingleThreadExecutor();
//        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.submit(new PrintTask("Bob"));
        executor.submit(new PrintTask("Alice"));
        executor.submit(new PrintTask("Tim"));
        executor.submit(new PrintTask("Robot"));
        Thread.sleep(10000);
        executor.shutdown();
    }
}
