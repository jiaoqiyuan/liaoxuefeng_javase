package nine_Regex.one_RegexIntro;

public class Is1990s {
    public static boolean is19xx(String s) {
        if (s == null){
            return false;
        }
        return s.matches("19\\d\\d");
    }
}
