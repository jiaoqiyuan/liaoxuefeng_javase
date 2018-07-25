package three_exception.error;

import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) {
        //test("UTF-8");
        test("ABC");
    }

    static void test(String encoding) {
        System.out.println("Test encoding " + encoding + "...");
        try {
            "test".getBytes(encoding);
            System.out.println(" ok.");
        } catch (UnsupportedEncodingException e) {
            System.out.println(" failed.");
            System.out.println(e);
        }
    }
}
