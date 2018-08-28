package sixteen_FunctionalProgramming.six_Reduce;

import java.util.Arrays;

public class ReduceSample2 {
    public static void main(String[] args) {
        String[] array = "Stream API supports functional-style operation".split(" ");
        String result = Arrays.stream(array).map(String::toLowerCase).reduce((acc, s) -> acc + " ~ " + s).get();
        System.out.println(result);
    }
}
