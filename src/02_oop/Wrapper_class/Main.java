package two_oop.Wrapper_class;

public class Main {
    public static void main(String[] args) {
        Integer n = 5 + Integer.valueOf(10);
        Number m = n;
        System.out.println(n.floatValue());
    }
}
