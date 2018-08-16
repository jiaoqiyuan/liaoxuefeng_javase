package nine_Regex.four_RegexGroup;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tel {
    public static Tel parse(String s) {
        Pattern p = Pattern.compile("^(0\\d{2,3})\\-([1-9]\\d{5,7})$");
        Matcher m = p.matcher(s);
        if (m.matches()) {
            String s1 = m.group(1);
            String s2 = m.group(2);
            return new Tel(s1, s2);
        }
        return null;
    }

    private final String areaCode;
    private final String phone;

    public Tel(String areaCode, String phone) {
        this.areaCode = areaCode;
        this.phone = phone;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }

        if (o instanceof Tel) {
            Tel t = (Tel) o;
            return Objects.equals(t.areaCode, this.areaCode) && Objects.equals(t.phone, this.phone);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.areaCode, this.phone);
    }

    @Override
    public String toString() {
        return this.areaCode + "-" + this.phone;
    }
}
