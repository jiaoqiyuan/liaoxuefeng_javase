package four_reflect.one_class;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        Class cls;
        try {
            if (true) {
                cls = Class.forName("four_reflect.one_class.Student");
            } else {
                cls = Class.forName("four_reflect.one_class.Doctor");
            }
            System.out.println("class name: " + cls.getName());
            System.out.println("class simple name: " + cls.getSimpleName());
            System.out.println("package name: " + cls.getPackageName());
            System.out.println("is interface? " + cls.isInterface());

//            Student s = (Student) cls.getDeclaredConstructor().newInstance();
            Hello s = (Hello) cls.getDeclaredConstructor().newInstance();
            s.hello();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        Class hcls = Hello.class;
        System.out.println("hcls is interface? " + hcls.isInterface());



    }
}
