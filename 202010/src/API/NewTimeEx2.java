package API;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class NewTimeEx2 {
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2015, 12, 31);
		LocalTime time = LocalTime.of(12, 34);
		
		LocalDateTime dt = LocalDateTime.of(date, time);
		
		ZoneId zid = ZoneId.of("Asia/Seoul");
		ZonedDateTime zdt = dt.atZone(zid);
		
		ZonedDateTime seoulTime = ZonedDateTime.now();
		
		ZoneId nyId = ZoneId.of("America/New_York");
		ZonedDateTime nyTime = ZonedDateTime.now().withZoneSameInstant(nyId);	// 해당 나라 시차 적용 가능!!
		
		System.out.println(dt);
		System.out.println(zid);
		System.out.println(zdt);
		System.out.println(seoulTime);
		System.out.println(nyTime);
	}
}