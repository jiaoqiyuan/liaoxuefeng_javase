package eleven_Thread.twelve_ConcurrentBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class WorkerThread extends Thread {
    BlockingQueue<String> taskQueue;

    public WorkerThread(BlockingQueue<String> taskQueue) {
        this.taskQueue = taskQueue;
    }

    public void run() {
        while (!isInterrupted()) {
            String name;
            try {
                name = taskQueue.take();
            } catch (InterruptedException e) {
                break;
            }
            String result = "Hello, " + name + "!";
            System.out.println(result);
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception{
        BlockingQueue<String> taskQueue = new ArrayBlockingQueue<>(100);
        WorkerThread worker = new WorkerThread(taskQueue);
        worker.start();
        //add task
        taskQueue.put("Bob");
        Thread.sleep(1000);
        taskQueue.put("Alice");
        Thread.sleep(1000);
        taskQueue.put("Tim");
        Thread.sleep(1000);
        worker.interrupt();
        worker.join();
        System.out.println("END");
    }
}
