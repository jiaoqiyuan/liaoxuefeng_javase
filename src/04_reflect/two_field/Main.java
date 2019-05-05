package four_reflect.two_field;


import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
        Student s = new Student();
        Class cls = s.getClass();
//        Field f = cls.getField("address");
        Field f = cls.getDeclaredField("address");
        printFieldInfo(f);
        s.hello();
    }

    static void printFieldInfo(Field f) {
        System.out.println("filed name: " + f.getName());
        System.out.println("filed type: " + f.getType());
        System.out.println("filed modifier: " + f.getModifiers());
        System.out.println("is public? " + Modifier.isPublic(f.getModifiers()));
        System.out.println("is protected? " + Modifier.isProtected(f.getModifiers()));
        System.out.println("is static? " + Modifier.isStatic(f.getModifiers()));
        System.out.println("is final? " + Modifier.isFinal(f.getModifiers()));
    }
}
