package two_oop.stringbuilder;

public class Main {
    public static void main(String[] args) {
        String name = "World";
        StringBuilder sb = new StringBuilder();
        sb.append("Hello, ").append(name).append("!");
        String s = sb.toString();
        System.out.println(s);
    }
}
