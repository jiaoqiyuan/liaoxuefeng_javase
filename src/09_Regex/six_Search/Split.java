package nine_Regex.six_Search;

import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
        String tags = "java, php ;; python";
        String[] arr = tags.split("[\\s\\,\\;]+");
        System.out.println(Arrays.toString(arr));
    }
}
