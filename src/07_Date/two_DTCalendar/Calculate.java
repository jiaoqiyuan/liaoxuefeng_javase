package seven_Date.two_DTCalendar;

import java.util.Calendar;

public class Calculate {

	public static void main(String[] args) throws Exception {
		// 获取当前时间表示的Calendar:
		Calendar c = Calendar.getInstance();
		// 转换为Date打印：
		System.out.println(c.getTime());
		// + 5 days:
		c.add(Calendar.DAY_OF_MONTH, 5);
		// - 2 hours:
		c.add(Calendar.HOUR_OF_DAY, -2);
		// 转换为Date打印：
		System.out.println(c.getTime());
	}

}
