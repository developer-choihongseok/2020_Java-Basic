package API;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class NewTimeEx3 {
	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.of(2014, 1, 1);
		LocalDate date2 = LocalDate.of(2015, 12, 31);
		
		Period pe = Period.between(date1, date2);
		
		System.out.println("date1= " + date1);
		System.out.println("date2= " + date2);
		System.out.println("pe= " + pe);
		System.out.println("YEAR= " + pe.get(ChronoUnit.YEARS));
//		System.out.println("YEAR= " + pe.getYears());
		System.out.println("MONTS= " + pe.get(ChronoUnit.MONTHS));
//		System.out.println("MONTS= " + pe.getMonths());
		System.out.println("DAYS= " + pe.get(ChronoUnit.DAYS));
//		System.out.println("DAYS= " + pe.getDays());
		System.out.println();
		
		LocalTime time1 = LocalTime.of(0, 0, 0);
		LocalTime time2 = LocalTime.of(12, 34, 56);
		
		Duration du = Duration.between(time1, time2);
		LocalTime tmpTime = LocalTime.of(0, 0).plusSeconds(du.getSeconds());
		
		System.out.println("du= " + du);
		System.out.println("HOUR= " + tmpTime.getHour());
		System.out.println("MINUTE= " + tmpTime.getMinute());
		System.out.println("SECOND= " + tmpTime.getSecond());
	}
}