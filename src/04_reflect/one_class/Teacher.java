package four_reflect.one_class;

public class Teacher implements Hello {

    private String name;

    public Teacher() {
        this("unnanmed");
    }

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void hello() {
        System.out.println("Hello, " + name);
    }
}
