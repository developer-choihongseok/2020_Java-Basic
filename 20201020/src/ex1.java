import java.util.Calendar;
import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		
		int year;
		int month;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도 입력하세요: ");
		year = sc.nextInt();
		System.out.print("월을 입력하세요: ");
		month = sc.nextInt();
	    System.out.println();
	    
		CalendarPrint cal = null;
		
		try {
			cal = new CalendarPrint(year, month);
			cal.printCal();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
}

class CalendarPrint{
	// Calendar 인스턴스 생성
	Calendar cal = Calendar.getInstance();
	
	// 요일 표시 -> 하는 이유: 월을 입력했을 때, 1일이 언제인지 알기 위해서.
	String[] calHeader = {"일", "월", "화", "수", "목", "금", "토"};
	// 날짜 데이터 배열
	String[][] calDate = new String[6][7];
	
	int startDay;		// 해당 월 시작 요일
	int lastDay;		// 해당 월 마지막 요일
	int inputDate = 1; 	// 입력 날짜
	int width = calHeader.length;	// 배열 가로 넓이: 7
	
	public CalendarPrint(int year, int month) throws Exception{
		
		if(month < 1 || month > 12) {
			System.out.println("월은 1~12사이의 숫자입니다.");
			throw new Exception();
		}else {
			cal.set(Calendar.YEAR, year);		// 현재 년도
			cal.set(Calendar.MONTH, month-1);	// 현재 월, 0(1월)~11(12월)까지의 값을 가지므로 1을 빼주어야 한다.
			cal.set(Calendar.DATE, 1);			// 현재 월의 날짜
			
			startDay = cal.get(Calendar.DAY_OF_WEEK);		// 월의 시작 요일(1~7, 1:일요일)
			lastDay = cal.getActualMaximum(Calendar.DATE);	// 월의 마지막 날짜

			// 출력하기 위해 2차원 배열에 날짜를 입력.
			int row = 0;	// 행 관리
			
			// for문을 하나만 사용한 이유?
			// => 달력이 매번 같은 모양이 아니고, 시작 요일이 늘 다르기에 프로그램이 유동적으로 만들어지기 위함!!
			// 조건이 마지막날인 것도 달이 30,31,28 또는 29일로 끝나는데 그 때마다 30일 때 반복문 따로, 28일 때 따로 만들면
			// 코드가 길어지니 조건식 자체를 달의 마지막날로 잡으면 한번에 여러 달 처리가 가능하기 때문!!
			for (int i = 1; inputDate <= lastDay; i++) {
				// 시작 요일이 오기 전에는 빈칸으로 설정
				if(i < startDay) {
					calDate[row][i-1] = "";
				}else {
					// 날짜 배열에 입력
					// 숫자 -> 스트링 설정
					calDate[row][(i-1)%width] = Integer.toString(inputDate);
					inputDate++;
					
					// 1주일이 지나면 줄바꿈해서 다음 배열에 입력. 즉, 가로 마지막 열에 오면 행 바꿈.
					if(i%width == 0) {
						row++;
					}
				}
			}
		}
	}
	
	// 달력 출력
	public void printCal() {
		// 달력 헤더 출력 "일월화수목금토"
		for (int i = 0; i < width; i++) {	// width : 열의 갯수
			System.out.print(calHeader[i] + "\t");
		}
		System.out.println();
		
		// 날짜 배열 출력
		int row = 0;
		
		for (int j = 1; j < lastDay + startDay; j++) {
			// 2차원 배열 달력에 데이터를 하나씩 출력.
			System.out.print(calDate[row][(j-1)%width] + "\t");
			
			// 1주일이 지나면 다음 배열을 출력.
			if((j-1)%width == width-1) {
				System.out.println();
				row++;
			}
		}
	}
}