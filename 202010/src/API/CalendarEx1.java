package API;

import java.util.Calendar;
/*
  Date / Calendar
  
  Date
  	- 날짜와 시간을 다룰 목적으로 만들어진 클래스(jdk 1.0)
  	
  Calendar
  	- Date 클래스를 개선한 클래스(jdk 1.1)
  	- 추상 클래스 -> 인스턴스화 X, 대신 싱글톤 getInstance() 메서드를 통해 구현된 객체 획득.
  
  Time
  	- Date와 Calendar 클래스 단점을 개선한 클래스(jdk 1.8)
*/
public class CalendarEx1 {
	public static void main(String[] args) {
		// 싱글톤 패턴
		Calendar today = Calendar.getInstance();
//		System.out.println(today);
		
		// get() - Calendar에 정의된 static 상수.
		System.out.println("이 해의 년도: " + today.get(Calendar.YEAR));
		System.out.println("월(0(= 1월)~11(= 12월)): " + (today.get(Calendar.MONTH)+1));	// ★ 중요!!
		System.out.println("이 해의 몇 째 주: " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇 째 주: " + today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("이 달의 몇 일: " + today.get(Calendar.DATE));	// DATE = DAY_OF_MONTH
		System.out.println("이 해의 몇 일: " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일(1~7, 1:일요일): " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("시간(0시~11시): " + today.get(Calendar.HOUR));
		System.out.println("시간(0시~23시): " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0분~59분): " + today.get(Calendar.MINUTE));
		System.out.println("초(0분~59초): " + today.get(Calendar.SECOND));
		System.out.println("1000분의 1초(0~999): " + today.get(Calendar.MILLISECOND));
		System.out.println("이 달의 마지막 날 : " + today.getActualMaximum(Calendar.DATE));
	}
}