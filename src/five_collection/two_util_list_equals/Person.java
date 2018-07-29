package five_collection.two_util_list_equals;

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

    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (o instanceof Person) {
            Person p = (Person) o;
            //return (p.name == this.name ||  p.name != null && p.name.equals(this.name)) && p.age == this.age;

        }
        return false;
    }
}
