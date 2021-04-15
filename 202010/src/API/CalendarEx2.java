package API;

import java.util.Calendar;

public class CalendarEx2 {
	public static void main(String[] args) {
		// 요일은 1부터 시작하기 때문에, Day_OF_WEEK[0]은 비워둠.
		final String[] Day_OF_WEEK = {"","일","월","화","수","목","금","토"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		// set() 메서드 : 날짜와 시간을 원하는 값으로 변경
		date1.set(2019, Calendar.OCTOBER, 19);	// date1.set(2019, 9, 19);
		System.out.println("date1은 " + toString(date1) + " " + Day_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일이고,");
		System.out.println("date2는 " + toString(date2) + " " + Day_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일입니다.");
		
		// 두 날짜간의 차이를 얻으려면, getTimeInMills() 천 분의 일 초 단위로 변경
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
		System.out.println("두 날짜간의 차이: " + difference/(24*60*60) + "일");	// 1일 = 24*60*60
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH)+1) + "월 " + date.get(Calendar.DATE) + "일";
	}
}