package API;

import java.util.Calendar;

public class CalendarEx3 {
	public static void main(String[] args) {
		
		final int[] TIME_UNIT = {3600,60,1};	// 큰 단위를 앞에 쓴다.
		final String[] TIME_UNIT_NAME = {"시간 ","분 ","초"};
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		time1.set(Calendar.HOUR_OF_DAY, 10);
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);
		
		time2.set(Calendar.HOUR_OF_DAY, 20);
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);
		
		System.out.println("time1: " + toString(time1));
		System.out.println("time2: " + toString(time2));
		
		// 두 날짜간의 차이를 얻으려면, getTimeInMills() 천 분의 일 초 단위로 값을 반환해야 하기 때문에
		// 초단위로 얻기 위해서는 1000으로 나눠 줘야한다.
		long difference = (time2.getTimeInMillis() - time1.getTimeInMillis()) / 1000;
		System.out.println("time1과 time2의 차이는 " + difference + "초입니다.");
		
		String tmp = "";
		
		// 가장 큰 단위인 시간 단위(3600초)로 나누고, 남은 나머지를 다시 분 단위(60초)로 나누면, 그 나머지는 초 단위의 값이 된다.
		for (int i = 0; i < TIME_UNIT.length; i++) {
			tmp += difference / TIME_UNIT[i] + TIME_UNIT_NAME[i];
			difference %= TIME_UNIT[i];
		}
		
		System.out.println("시분초 변환 : " + tmp + "입니다.");
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.HOUR_OF_DAY) + "시 " + date.get(Calendar.MINUTE) + "분 " + date.get(Calendar.SECOND) + "초";
	}
}