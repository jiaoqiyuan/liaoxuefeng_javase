package sixteen_FunctionalProgramming.five_Filter;

import java.util.function.Supplier;
import java.util.stream.Stream;

class NaturalSupplier implements Supplier<Long> {
    long x = 0;

    public Long get() {
        x++;
        return x;
    }
}

public class StreamFilterSample {
    public static void main(String[] args) throws Exception{
        Stream<Long> natural = Stream.generate(new NaturalSupplier());
        Stream<Long> ood = natural.filter(n -> n % 2 == 1);
        ood.limit(20).forEach(System.out::println);
    }
}
