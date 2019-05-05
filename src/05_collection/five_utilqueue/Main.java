package five_collection.five_utilqueue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        queue.offer(new Person("Ming", 12));
        queue.offer(new Person("Hong", 15));
        queue.offer(new Person("Jun", 17));
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        if (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
