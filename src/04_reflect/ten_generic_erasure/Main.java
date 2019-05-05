package four_reflect.ten_generic_erasure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Main {
    public static void main(String[] args) {
        Pair<String> p = new Pair<>("xiao", "ming");
        IntPair ip = new IntPair(1, 2);
        System.out.println(p instanceof Pair);
        System.out.println(ip instanceof Pair);
        System.out.println(ip instanceof IntPair);
        Type type = IntPair.class.getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) type;
        Type[] types = pt.getActualTypeArguments();
        Class<?> clazz = (Class<?>) types[0];
        System.out.println(clazz);
        System.out.println(GenericHelper.getParameterizedTypeOfSuperclass(IntPair.class));

    }
}
