package API;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatEx2 {
	public static void main(String[] args) {
		// Calendar -> Date
		// 1번째 방법
		Calendar cal = Calendar.getInstance();
		cal.set(2005, 9, 3);
		
		Date today = cal.getTime();
		System.out.println(today + "\n");
		
		// date 인스턴스만 format() 메서드 사용 가능!!
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
		
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("''yy년 MM월 dd일 E요일''");
		sdf3 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		sdf4 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS a");
		
		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		
		/*
		 Calendar -> Date
		 2번째 방법
		 Calendar cal = Calendar.getInstance();
		 Date today = new Date(cal.getTimeInMillis()); 
		*/
		
		/*
		 Date -> Calendar
		 
		 Date d = new Date();
		 Calendar cal = Calendar.getInstance();
		 cal.setTime(d);
		*/
	}
}