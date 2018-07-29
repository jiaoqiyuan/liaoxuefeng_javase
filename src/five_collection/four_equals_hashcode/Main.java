package five_collection.four_equals_hashcode;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(new Person("ming", 12),
                new Person("hong", 14), new Person("jun", 17));
        Map<Person, String> map = new HashMap<>();
        for (Person p :
                list) {
            map.put(p, p.getName());
        }
        System.out.println(map.get(new Person("jun", 17)));
    }
}
