package nine_Regex.five_RegexGreedy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ZeroCount {
    public static int zeros(String s) {
        Pattern p = Pattern.compile("^\\d+?(0*)$");
        Matcher m = p.matcher(s);
        if (m.matches()) {
            String zeroStr = m.group(1);
            return zeroStr.length();
        }
        throw new IllegalArgumentException("Not a number");
    }
}
