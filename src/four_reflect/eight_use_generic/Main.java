package four_reflect.eight_use_generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Test");
        String first = list.get(0);
        System.out.println(first);

        String[] strs = {"Apple", "Pear", "Orange"};
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));

        Student[] ss = {new Student("xiao ming", 59),
                        new Student("xiao hong", 80)};
        Arrays.sort(ss);
        System.out.println(Arrays.toString(ss));
    }
}
