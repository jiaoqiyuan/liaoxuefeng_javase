package sixteen_FunctionalProgramming.six_Reduce;

import java.util.stream.Stream;

public class ReduceSample {
    public static void main(String[] args) {
        int r = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).reduce(100, (acc, x) -> acc * x);
        System.out.println(r);
    }
}
