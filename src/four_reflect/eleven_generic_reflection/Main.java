package four_reflect.eleven_generic_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<String> clazz = String.class;
        String s1 = clazz.getConstructor().newInstance();
//        String s1 = clazz.newInstance();
        System.out.println(s1);

        Constructor<String> cons = clazz.getConstructor(String.class);
        String s2 = cons.newInstance("hello");
        System.out.println(s2);

        Pair<String>[] ps = (Pair<String>[]) new Pair[2];
        ps[0] = new Pair<>("a", "b");
        ps[1] = new Pair<>("x", "y");
        System.out.println(Arrays.toString(ps));
    }

}
