package API;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;
/*
 java.time 패키지
 	- Date, Calendar의 단점 보완을 위해 추가된 패키지
 	
 	LocalDate - 날짜 표현
 	LocalTime - 시간 표현
 	LocalDate + LocalTime = LocalDateTime
 		- 날짜 & 시간 표현
 	LocalDateTime + 시간대 = ZonedDateTime
 	
 	Period - 날짜의 차이
 	Duration - 시간의 차이
 	
 	주요 메서드
 		get(), getXXX() : 특정 필드의 값 가져오기
 			Ex) getYear(), getHour()
 			주의) Calendar: 1월 -> 0, 일요일 -> 1
 			 	 getXXX()메서드: 월 1~12, 월요일 -> 1
 		
 		now() : 현재 시간과 날짜
 		of() : 특정 날짜 시간
 		with() : 직접 값 변경
 		plus(), minus() : 더하기, 빼기
 		isAfter()
 		isBefore()
 		isEqual()
*/
public class NewTimeEx1 {
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();	// 오늘의 날짜
		LocalTime time = LocalTime.now();	// 현재 시간
		
//		LocalDate birthDate = LocalDate.of(1999, 12, 31);
//		LocalTime birthTime = LocalTime.of(23, 59, 59);
		
//		LocalDate birthDate = LocalDate.ofYearDay(1999, 365);	// 1999년의 365번째 날(즉, 마지막 날 의미)
//		LocalTime birthTime = LocalTime.ofSecondOfDay(86399);	// 0시 0분 0초부터 86399초(하루는 86400초)가 지난 시간(즉, 23시 59분 59초)
		
		LocalDate birthDate = LocalDate.parse("1999-12-31");
		LocalTime birthTime = LocalTime.parse("23:59:59");
		
		System.out.println("today= " + today);
		System.out.println("time= " + time);
		System.out.println("birthDate= " + birthDate);
		System.out.println("birthTime= " + birthTime);
		System.out.println();
		
		// minus, plus
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalDate ld2 = ld.minusYears(2).plusMonths(3).minusDays(4);
		System.out.println(ld2);
		
		LocalDate ld3 = ld2.plusWeeks(3);
		System.out.println(ld3);
		System.out.println();
		
		// with()
		LocalDate new_ld = ld.withYear(1999).withMonth(8).withDayOfYear(23);
		System.out.println(new_ld);
		System.out.println();
		
		// 윤년 예제
		int count = 0;
		
		for (int i = 1900; i < 2100; i++) {
			new_ld = ld.withYear(i);
			
			// 윤년인지 아닌지 알려준다.
			if(new_ld.isLeapYear()) {
				System.out.println(new_ld.getYear() + "은(는) 윤년입니다.");
				count++;
			}
		}
		System.out.println("1900~2100년까지 윤년은 총 " + count + "번 있습니다.");
		System.out.println();
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		System.out.println();
		
		LocalDateTime new_ldt;
		
		// 자주 쓰일만한 날짜 계산들을 대신 해주는 메서드들을 정의해놓은 클래스.
		new_ldt = ldt.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("올 해의 첫번째 날: " + new_ldt);
		new_ldt = ldt.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("올 해의 마지막 날: " + new_ldt);
		new_ldt = ldt.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("이번달의 첫번째 날: " + new_ldt);
		new_ldt = ldt.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("이번달의 마지막 날: " + new_ldt);
		new_ldt = ldt.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("이번달의 첫 월요일: " + new_ldt);
		new_ldt = ldt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
		System.out.println("이번달의 마지막 일요일: " + new_ldt);
		new_ldt = ldt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
		System.out.println("돌아오는 금요일: " + new_ldt);
		new_ldt = ldt.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
		System.out.println("오늘을 포함한 다음 금요일: " + new_ldt);
		new_ldt = ldt.with(TemporalAdjusters.previous(DayOfWeek.WEDNESDAY));
		System.out.println("지난 수요일: " + new_ldt);
		new_ldt = ldt.with(TemporalAdjusters.previousOrSame(DayOfWeek.WEDNESDAY));
		System.out.println("오늘을 포함한 지난 수요일: " + new_ldt);
		System.out.println();
		
		// 날짜를 게산하는 프로그램
		LocalDateTime ldt1 = LocalDateTime.of(2010,1,1,12,23,23,444);
		System.out.println(ldt1);
		LocalDateTime ldt2 = LocalDateTime.of(2010,12,25,1,12,2,444);
		System.out.println(ldt2);
		
		System.out.println(ldt1.isAfter(ldt2));	// ldt1이 ldt2보다 이후?
		System.out.println(ldt1.isBefore(ldt2));
		System.out.println(ldt1.isEqual(ldt2));
		System.out.println();
		
		// 유통기한 체크하는 프로그램
		LocalDateTime idt = LocalDateTime.now();
		System.out.println(idt);
		LocalDateTime end_time = LocalDateTime.of(2017,6,24,12,00);
		System.out.println(end_time);
		
		if(idt.isAfter(end_time)) {
			System.out.println("유통기한이 지났습니다.");
		}else {
			System.out.println("유통기한이 안지났습니다.");
		}
	}
}