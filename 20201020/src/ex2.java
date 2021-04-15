import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		
		String pattern = "yyyy/MM/dd";
		String pattern2 = "입력하신 날짜는 E요일입니다.";	// E는 일~토 중에 하나
		
		DateFormat df = new SimpleDateFormat(pattern);
		DateFormat df2 = new SimpleDateFormat(pattern2);
		
		Scanner sc = new Scanner(System.in);
		
		Date inDate = null;
		
		do {
			System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요. (입력 예:2007/05/11)");
			System.out.print(">>");
			
			try {
				// DateFormat 객체를 생성하고, 패턴과 동일한 문자열을 parse() : String -> date 인자로 전달.
				inDate = df.parse(sc.nextLine()); 
				break;
			} catch (ParseException e) {
				continue;
			}
			
		}while(true);
		
		System.out.println(df2.format(inDate));
		
		sc.close();
	}
}