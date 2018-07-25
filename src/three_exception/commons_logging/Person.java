package three_exception.commons_logging;

public class Person {
    private String name;
    private int age;

    public Person(String name){
        if (name == null) {
            throw new IllegalArgumentException("name is null.");
        }
        this.name = name;
    }

    public String hello() {
        return "Hello, " + name;
    }

}
