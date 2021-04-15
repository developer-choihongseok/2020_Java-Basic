package API;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateFormatEx4 {
	public static void main(String[] args) {
		
		String pattern = "yyyy/mm/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		
		Scanner sc = new Scanner(System.in);
		
		Date inDate = null;
		
		System.out.println("날짜를 " + pattern + "의 형태로 입력(예:2020/10/20)");
		
		while(sc.hasNextLine()){	// hasNext~() : 해당 입력 값이 나올 때까지 반복!!
			try {
				inDate = df.parse(sc.nextLine());
				break;
			} catch (ParseException e) {
				System.out.println("날짜를 " + pattern + " 의 형태로 다시 입력해주세요.");
			}
		}
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(inDate);
		
		Calendar today = Calendar.getInstance();
		
		long day = (cal.getTimeInMillis() - today.getTimeInMillis()) / (60*60*1000);
		System.out.println("입력하신 날짜는 현재와 " + day + "시간 차이가 있습니다.");
		
		sc.close();
	}
}