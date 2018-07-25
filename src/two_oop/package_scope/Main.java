package two_oop.package_scope;

public class Main {
    public static void main(String[] args) {
        Hello h = new Hello("World");
        System.out.println(h.hello());
    }
}

class Hello {
    private final String name;

    public Hello(String name) {
        this.name = name;
    }

    public String hello() {
        return "Hello, " + name;
    }
}
