package five_collection.six_utilPriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
//        Queue<Person> queue = new PriorityQueue<>();
        Queue<Person> queue = new PriorityQueue<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
//                return - o1.getName().compareTo(o2.getName());
                return o2.getAge() - o1.getAge();
            }
        });
        queue.offer(new Person("Ming", 12));
        queue.offer(new Person("Hong", 15));
        queue.offer(new Person("Jun", 17));
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
