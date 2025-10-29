package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		// Date
		// Calendar
		//

		LocalDate date = LocalDate.now();
		System.out.println(date);

		LocalDate after28Days = date.plusDays(28);
//		date.plusMonths(1);
//		date.plusWeeks(1);
//		date.plusYears(1);
		System.out.println(after28Days);
//		date.minusMonths(1);
//		date.minusWeeks(1);
//		date.minusYears(1);

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);

		dateTime.plusHours(12); //
		dateTime.plusNanos(10000);// nano second

		
		

	}
}
