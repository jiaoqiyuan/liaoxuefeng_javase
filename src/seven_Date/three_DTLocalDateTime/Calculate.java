package seven_Date.three_DTLocalDateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Calculate {
    public static void main(String[] args) {
        //获取当前日期和时间
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        // +5 days
        LocalDateTime ldt1 = ldt.plusDays(5);
        System.out.println(ldt1);

        // -2 hours
        LocalDateTime ldt2 = ldt.minusHours(2);
        System.out.println(ldt2);

        //获取当月的第一天
        LocalDate firstDay = LocalDate.now().withDayOfMonth(1);
        LocalDate firstDay2 = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(firstDay);
        System.out.println(firstDay2);
        System.out.println(firstDay.equals(firstDay2));

        //获取当月最后一天
        LocalDate lastDay = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(lastDay);

        //获取当月第一个星期日
        LocalDate firSun = LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));
        System.out.println(firSun);

        //哪个日期在前
        System.out.println(firSun.isBefore(LocalDate.now()));

        //两个日期相差？天？月？年：
        Period p = LocalDate.now().until(LocalDate.of(2050, 1,1));
        System.out.println(p);

        //两个日期一共差多少天
        System.out.println(LocalDate.of(2050, 1, 1).toEpochDay() - LocalDate.now().toEpochDay());
    }
}
