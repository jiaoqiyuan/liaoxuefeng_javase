package four_reflect.two_field;

public class Student extends Person implements Hello {

    public static int number = 0;

    public String name;
    private String address = "beijing";

    public Student() {
        this("unnamed");
    }

    public Student(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.println("Hello, " + name);
    }
}
