package five_collection.three_utilMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(new Person("ming", 12),
                new Person("hong", 14), new Person("jun", 17));
//        Map<String, Person> map = new HashMap<>();
        Map<String, Person> map = new TreeMap<>();
        for (Person p :
            list) {
            map.put(p.getName(), p);
        }

        System.out.println(map.get("jun"));
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
