package five_collection.one_util_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("pear");
        list.add("Orage");
        String[] ss = list.toArray(new String[list.size()]);
        for (String s : ss){
            System.out.println(s);
        }
    }
}
