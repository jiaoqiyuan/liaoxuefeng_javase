package seven_Date.two_DTCalendar;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) throws Exception {
		// 获取当前时间表示的Calendar:
		Calendar c = Calendar.getInstance();
		// 转换为Date打印：
		System.out.println(c.getTime());
		// 转换为long打印：
		System.out.println(c.getTimeInMillis());
		// 获取年月日时分秒:
		System.out.println("    Year = " + c.get(Calendar.YEAR));
		// 注意月份从0开始：1月＝0，2月＝1，...，12月＝11:
		System.out.println("   Month = " + c.get(Calendar.MONTH));
		System.out.println("     Day = " + c.get(Calendar.DAY_OF_MONTH));
		// 注意星期从1开始：星期日＝1，星期一＝2，...，星期六＝7：
		System.out.println(" Weekday = " + c.get(Calendar.DAY_OF_WEEK));
		System.out.println("    Hour = " + c.get(Calendar.HOUR_OF_DAY));
		System.out.println("  Minute = " + c.get(Calendar.MINUTE));
		System.out.println("  Second = " + c.get(Calendar.SECOND));
		System.out.println("  Millis = " + c.get(Calendar.MILLISECOND));
		// 默认时区:
		System.out.println("TimeZone = " + c.getTimeZone());
	}

}
