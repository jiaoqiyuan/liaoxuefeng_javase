package seven_Date.one_DTDate;

import java.util.Date;

public class Date2String {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now.toString());
        System.out.println(now.toGMTString());
        System.out.println(now.toLocaleString());
    }
}
