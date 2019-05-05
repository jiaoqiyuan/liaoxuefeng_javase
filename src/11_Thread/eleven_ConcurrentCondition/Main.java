package eleven_Thread.eleven_ConcurrentCondition;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class TaskQueue {
    final Queue<String> queue = new LinkedList<>();
    final Lock lock = new ReentrantLock();
    final Condition notEmpty = lock.newCondition();

    public String getTask() throws InterruptedException {
        lock.lock();
        try {
            while (this.queue.isEmpty()) {
                notEmpty.await();
            }
            return queue.remove();
        } finally {
            lock.unlock();
        }
    }

    public void addTask(String name) {
        lock.lock();
        try {
            this.queue.add(name);
            notEmpty.signalAll();
        } finally {
            lock.unlock();
        }
    }
}

class WorkThread extends Thread {
    TaskQueue taskQueue;
    public WorkThread(TaskQueue taskQueue) {
        this.taskQueue = taskQueue;
    }

    public void run() {
        while (!isInterrupted()) {
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
        // add task
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
