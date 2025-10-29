package datetime;

import java.util.Calendar;

public class CalDemo {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();

		System.out.println(c);
		// java.util.GregorianCalendar[time=1751978744951,areFieldsSet=true,
		// areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo
		// [id="Asia/Calcutta",offset=19800000,dstSavings=0,useDaylight=false,transitions=7,lastRule=null],
		// firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=6,WEEK_OF_YEAR=28,WEEK_OF_MONTH=2,
		// DAY_OF_MONTH=8,DAY_OF_YEAR=189,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,
		// MINUTE=15,SECOND=44,MILLISECOND=951,ZONE_OFFSET=19800000,DST_OFFSET=0]

		System.out.println(c.get(Calendar.MONTH));// month starts with 0
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.HOUR));

		
		//bYear => age 
		
		//date - date => days 
		//time - time => duration 
		
		
		
	}
}
