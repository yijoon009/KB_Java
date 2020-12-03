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
		
		//���� �����
		ZonedDateTime utc = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(utc);
		
		Instant ins = Instant.now();
		Thread.sleep(100);
		Instant ins2 = Instant.now();
		if(ins.isBefore(ins2)) {
			System.out.println("ins1�� �� ������");
		}else if(ins.isAfter(ins2)) {
			System.out.println("ins�� �� ������");
		}else {
			System.out.println("������ �ð�");
			
		}
		
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println("���� ��¥ : "+now);
		String strDateTime = now.getYear()+"��";
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy,MM,dd");
		LocalDate localDate = LocalDate.parse("2020.05.03",formatter);
		System.out.println(localDate);
		
		
		
		
	}
}
