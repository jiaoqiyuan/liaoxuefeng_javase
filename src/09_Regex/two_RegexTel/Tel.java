package nine_Regex.two_RegexTel;

public class Tel {
    public static boolean isValidTel(String s) {
        return s.matches("\\d{3,4}\\-\\d{6,8}");
    }
}
