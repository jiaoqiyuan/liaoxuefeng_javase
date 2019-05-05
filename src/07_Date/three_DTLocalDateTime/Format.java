package seven_Date.three_DTLocalDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Format {
    public static void main(String[] args) {
        //格式化
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(dtf.format(LocalDateTime.now()));

        //按ISO格式解析
        LocalDateTime dt1 = LocalDateTime.parse("2016-11-30T15:15:17");
        System.out.println(dt1);
        //按指定格式解析
        LocalDateTime dt2 = LocalDateTime.parse("2016-11-30 15:16:17", dtf);
        System.out.println(dt2);
    }
}
