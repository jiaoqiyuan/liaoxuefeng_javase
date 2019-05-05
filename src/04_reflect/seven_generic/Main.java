package four_reflect.seven_generic;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var strList = new ArrayList<String>();
        strList.add("adc");
        strList.add("xyz");
        String first = strList.get(0);
        System.out.println(first);
    }
}
