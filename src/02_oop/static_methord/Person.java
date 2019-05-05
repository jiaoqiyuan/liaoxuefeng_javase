package two_oop.static_methord;

public class Person {

    private static int number;

    private String name;

    public Person(String name){
        this.name = name;
        number ++;
    }

    public String getName() {
        return name;
    }

    public static int getNumber() {
        return number;
    }
}
