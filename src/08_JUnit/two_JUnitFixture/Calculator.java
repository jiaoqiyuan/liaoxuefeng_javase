package eight_JUnit.two_JUnitFixture;

import java.util.Arrays;

public class Calculator {

    public int calculate(String expression) {
        String[] str = expression.split("\\+");
        System.out.println(expression + " => " + Arrays.toString(str));
        int sum = 0;
        for (String s : str) {
            sum = sum + Integer.parseInt(s.trim());
        }

        return sum;
    }
}
