package five_collection.two_util_list_equals;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Person> list = new ArrayList<>();
        list.add(new Person("xiaoming", 12));
        list.add(new Person("xiaohong", 13));
        list.add(new Person("xiaojun", 17));
        System.out.println(list);
        System.out.println(list.contains(new Person("xiaojun", 17)));
    }
}
