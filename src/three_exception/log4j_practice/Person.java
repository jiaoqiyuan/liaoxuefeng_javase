package three_exception.log4j_practice;

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
