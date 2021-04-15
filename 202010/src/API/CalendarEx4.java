package API;

import java.util.Calendar;
/*
 add() : 지정한 필드의 값을 원하는 만큼 증감
 roll() : 지정한 필드의 값을 원하는 만큼 증감(★ add() 차이점: 다른 필드에 영향 X)
*/
public class CalendarEx4 {
	public static void main(String[] args) {
		
		Calendar date = Calendar.getInstance();
		date.set(2005, 7, 31);
		System.out.println(toString(date));
		System.out.println();
		
		System.out.println("= 1일 후 =");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		
		System.out.println("= 6달 전 =");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));
		
		System.out.println("= 6달 후 =");
		date.add(Calendar.MONTH, +6);
		System.out.println(toString(date));
				
		System.out.println("= 31일 후(roll) =");
		date.roll(Calendar.DATE, 31);
		System.out.println(toString(date));
		
		System.out.println("= 31일 후(add) =");
		date.add(Calendar.DATE, 31);
		System.out.println(toString(date));
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH)+1) + "월 " + date.get(Calendar.DATE) + "일";
	}
}