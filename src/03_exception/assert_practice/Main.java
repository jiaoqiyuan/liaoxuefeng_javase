package three_exception.assert_practice;



public class Main {
    public static void main(String[] args) {
        double x = abs(-123.45);
        assert x >= 0 : "x must >= 0 but x = " + x;
        System.out.println(x);
    }

    static double abs(double d) {
        return d > 0 ? d : -d;
    }
}
