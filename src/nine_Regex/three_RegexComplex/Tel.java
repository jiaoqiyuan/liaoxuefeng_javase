package nine_Regex.three_RegexComplex;

public class Tel {
    public static boolean isValidTel(String s) {
        return s.matches("^0\\d{2,3}-[1-9]\\d{5,7}");
    }
}
