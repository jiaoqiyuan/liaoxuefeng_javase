package two_oop.javabean;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        BeanInfo bi = Introspector.getBeanInfo(Person.class);
        for (PropertyDescriptor pd : bi.getPropertyDescriptors()) {
            printPropertyDescriptor(pd);
        }

    }
    static void printPropertyDescriptor(PropertyDescriptor pd) {
        String name = pd.getName();
        Class<?> clazz = pd.getPropertyType();
        if (clazz == null || name.equals("class")) {
            return;
        }
        Method read = pd.getReadMethod();
        Method write = pd.getWriteMethod();
        System.out.println("============ PropetyDescriptor ==============");
        System.out.println("Name: " + name);
        System.out.println("Type: " + clazz.getName());
        System.out.println("Read method: " + (read == null ? "null" : read.getName()));
        System.out.println("Write method: " + (write == null ? "null" : write.getName()));

    }
}
