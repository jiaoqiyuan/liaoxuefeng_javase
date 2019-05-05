package four_reflect.six_extends.five_constructor;


import java.lang.reflect.Constructor;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Class cls = Student.class;
        printSuperClass(cls);
    }

    static void printSuperClass(Class cls) {
        System.out.println(cls.getSimpleName());
        Class s = cls.getSuperclass();
        if (s == null) {
            System.out.println();
        } else {
            System.out.println(" : ");
            printSuperClass(s);
        }
    }

}
