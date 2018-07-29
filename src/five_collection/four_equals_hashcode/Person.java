package five_collection.four_equals_hashcode;

import java.util.Objects;

public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "(Person: " + name + ", " + age + ")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (o instanceof Person) {
            Person p = (Person) o;
            //return (p.name == this.name ||  p.name != null && p.name.equals(this.name)) && p.age == this.age;
            return Objects.equals(this.name, p.name) && this.age == p.age;
        }
        return false;
    }



}
