package two_oop.javabean;

public class Person {
    private String name;
    private int age;
    private boolean genger;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGenger() {
        return genger;
    }

    public void setGenger(boolean genger) {
        this.genger = genger;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
