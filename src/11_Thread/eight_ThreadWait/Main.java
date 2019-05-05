package eleven_Thread.eight_ThreadWait;

import java.util.LinkedList;
import java.util.Queue;

class TaskQueue {
    final Queue<String> queue = new LinkedList<>();
    public synchronized String getTask() throws InterruptedException {
        while (this.queue.isEmpty()) {
            this.wait();
        }
        return queue.remove();
    }

    public synchronized void addTask(String name) {
        this.queue.add(name);
        this.notifyAll();
    }
}

class WorkThread extends Thread {
    TaskQueue taskQueue;

    public WorkThread(TaskQueue taskQueue) {
        this.taskQueue = taskQueue;
    }

    public void run() {
        while(!isInterrupted()) {
            String name;
            try {
                name = taskQueue.getTask();

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
        TaskQueue taskQueue = new TaskQueue();
        WorkThread worker = new WorkThread(taskQueue);
        worker.start();
        //add task
        taskQueue.addTask("Bob");
        Thread.sleep(1000);
        taskQueue.addTask("Alice");
        Thread.sleep(1000);
        taskQueue.addTask("Tim");
        Thread.sleep(1000);
        worker.interrupt();
        worker.join();
        System.out.println("END");
    }
}
