package datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeUserInput {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(1947, 1, 1);
		System.out.println(date);
		
		
		DateTimeFormatter format1  = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter format2  = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		String s1 = date.format(format1);
		String s2= date.format(format2);
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		String str = "1947-01-01";
		String str2 = "01-01-1947";
		
		LocalDate l1 =  LocalDate.parse(str);//yyyy-MM-dd
		System.out.println(l1);
		
		
		
		DateTimeFormatter format3  = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		LocalDate l2 =  LocalDate.parse(str2,format3);
		System.out.println(l2);
		
		
		
		
		
			
		
	}
}
