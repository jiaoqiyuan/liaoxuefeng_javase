package four_reflect.one_class;

public class Student implements Hello{
    private String name;

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
