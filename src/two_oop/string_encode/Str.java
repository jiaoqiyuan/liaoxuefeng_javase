package two_oop.string_encode;

import java.nio.charset.StandardCharsets;

public class Str {
    public static void main(String[] args) {
        String s = "Hello, world!";
        System.out.println(s);
        String sub = s.substring(7);
        System.out.println(sub);
        System.out.println("  中文".trim());
        byte[] data = "中文ABC".getBytes(StandardCharsets.UTF_8);
        System.out.println(data);
        String s2 = new String(data, StandardCharsets.UTF_8);
        System.out.println(s2);
    }
}
