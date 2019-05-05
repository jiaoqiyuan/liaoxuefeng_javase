package two_oop.static_methord;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("xiao ming");
        System.out.println(Person.getNumber());
        Person p2 = new Person("xiao hong");
        System.out.println(Person.getNumber());
        Person p3 = new Person("xiao jun");
        System.out.println(Person.getNumber());
    }
}
