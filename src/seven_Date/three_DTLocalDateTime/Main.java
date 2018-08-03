package seven_Date.three_DTLocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now();
        System.out.println(d1);
        System.out.println("Week = " + d1.getDayOfWeek().getValue());

        LocalDate d2 = LocalDate.of(2016, 11, 30);
        System.out.println(d2);

        //获取当前本地时间
        LocalTime t1 = LocalTime.now();
        System.out.println(t1);
        LocalTime t2 = LocalTime.of(12, 16, 17);
        System.out.println(t2);

        //获取当前日期和时间
        LocalDateTime dt1 = LocalDateTime.now();
        System.out.println(dt1);
        LocalDateTime dt2 = LocalDateTime.of(d2, t2);
        System.out.println(dt2);
    }
}
