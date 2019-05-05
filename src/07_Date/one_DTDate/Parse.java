package seven_Date.one_DTDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Parse {
    public static void main(String[] args) throws ParseException {
        String s1 = "2017-08-11 15:04:05";
        Date date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(s1);
        System.out.println(date1);

        String s2 = "Nov/20/2016 12:15:59";
        Date date2 = new SimpleDateFormat("MMM/dd/yyyy HH:mm:ss", Locale.US).parse(s2);
        System.out.println(date2);

        String iso = "2016-11-20T12:15:58";
        Date date3 = (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")).parse(iso);
        System.out.println(date3);
    }
}
