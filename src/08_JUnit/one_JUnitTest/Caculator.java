package eight_JUnit.one_JUnitTest;

import java.util.Arrays;

public class Caculator {
    public int caculate(String expression) {
        String[] ss = expression.split("\\+");
        System.out.println(expression + " => " + Arrays.toString(ss));
        int sum = 0;
        for (String s : ss) {
            sum = sum + Integer.parseInt(s.trim());
        }

        return sum;
    }

    public static void main(String[] args) {
        Caculator c = new Caculator();
        int r = c.caculate("1+2+3");
        System.out.println(r);
    }
}
