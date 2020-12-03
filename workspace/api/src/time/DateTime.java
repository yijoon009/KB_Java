package time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
	public static void main(String[] args) throws InterruptedException {
		
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println(currDateTime);
		
		//협전 세계시
		ZonedDateTime utc = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(utc);
		
		Instant ins = Instant.now();
		Thread.sleep(100);
		Instant ins2 = Instant.now();
		if(ins.isBefore(ins2)) {
			System.out.println("ins1이 더 빠르다");
		}else if(ins.isAfter(ins2)) {
			System.out.println("ins이 더 느리다");
		}else {
			System.out.println("동일한 시간");
			
		}
		
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재 날짜 : "+now);
		String strDateTime = now.getYear()+"년";
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy,MM,dd");
		LocalDate localDate = LocalDate.parse("2020.05.03",formatter);
		System.out.println(localDate);
		
		
		
		
	}
}
