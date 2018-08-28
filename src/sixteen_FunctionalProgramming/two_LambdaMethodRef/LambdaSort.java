package sixteen_FunctionalProgramming.two_LambdaMethodRef;

import java.util.Arrays;

class SortedBy {
    static int name(String s1, String s2) {
        return s1.compareTo(s2);
    }

    static int nameIgnoreCase(String s1, String s2) {
        return s1.toLowerCase().compareTo(s2.toLowerCase());
    }

    static int length(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1 == n2) {
            return s1.compareTo(s2);
        }
        return n1 < n2 ? -1 : 1;
    }
}

public class LambdaSort {
    public static void main(String[] args) throws Exception{
        String[] array = "Java Apple lambda functional OOP".split(" ");
//        Arrays.sort(array, SortedBy::length);
        Arrays.sort(array, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(array));
    }
}
