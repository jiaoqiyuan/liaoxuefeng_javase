package two_oop.string_encode;

public class CharType {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = '中';
        int n1 = c1;    //65
        int n2 = c2;    //20013
        System.out.println(n1);
        System.out.println(n2);
        char c3 = '\u0041';
        char c4 = '\u4e2d';
        System.out.println(c3);
        System.out.println(c4);
    }
}
