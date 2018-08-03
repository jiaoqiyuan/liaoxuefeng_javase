package seven_Date.two_DTCalendar;

import java.util.Calendar;

public class SetTime {

	public static void main(String[] args) throws Exception {
		// 获取当前时间表示的Calendar:
		Calendar c = Calendar.getInstance();
		// 转换为Date打印：
		System.out.println(c.getTime());
		// 设置为指定时间:
		c.clear();
		c.set(Calendar.YEAR, 1999);
		c.set(Calendar.MONTH, 10); // 11月
		c.set(Calendar.DAY_OF_MONTH, 30);
		c.set(Calendar.HOUR_OF_DAY, 21);
		System.out.println(c.getTime());
	}

}
