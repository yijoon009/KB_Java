package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class DateTimeParsingTest {
	public static void main(String[] args) {
		DateTimeFormatter formatter;
		LocalDate localDate;
		
//		localDate = LocalDate.parse("2024-04-21");
//		System.out.println(localDate);
//		
//		formatter = DateTimeFormatter.ISO_LOCAL_DATE;
//		localDate = LocalDate.parse("2020-03-22",formatter);
//		System.out.println(localDate);
		
//		formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//		localDate = LocalDate.parse("2020/03/22",formatter);
//		System.out.println(localDate);
		
		 String id = "5Angel1004";

	      String regExp = "[a-zA-Z][a-zA-Z0-9]{7,11}";

	      boolean isMatch = Pattern.matches(regExp, id);

	      if(isMatch) {
	    	  System.out.println("사용할수 없음");
	      } else {
	    	  System.out.println("사용할 수 있음");
	    
	     } 
		
	}
}
