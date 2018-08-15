package nine_Regex.three_RegexComplex;

public class QQ {
    public static boolean isValidQQ(String s) {
        return s.matches("^[1-9]\\d{4,9}$");
    }
}
