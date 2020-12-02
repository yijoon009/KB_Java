package calendar;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.DATE));
		
		int am_pm = c.get(Calendar.AM_PM);
		System.out.println(c.get(Calendar.HOUR_OF_DAY)+"Ω√ "
				+c.get(Calendar.MINUTE)+"∫– "+ c.get(Calendar.SECOND)+"√ ");
		
		
		
		
	}
}
