package two_oop.sample;

public class Person {
    private String name;
    private int age;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public void setName(String firstName, String lastName) {
        this.name = firstName + " " + lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void run() {
        System.out.println(name + " is running!");
    }

    public String toString() {
        return "Person " + name;
    }

    public String hello() {
        return "Hello, " + name;
    }
}
