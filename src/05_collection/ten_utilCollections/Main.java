package five_collection.ten_utilCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
        List<String> readOnlyList = Collections.unmodifiableList(new ArrayList<>(Arrays.asList("A", "B", "C")));
        System.out.println(readOnlyList);
    }
}
