import java.util.Scanner;

public class example_1 {
	public static void main(String[] args) {
		/*
		 년도를 입력받아서 윤년을 구분하는 프로그램
		 순서1) 입력한 년도를 4로 나누면 나머지가 0이고, 100으로 나누면 0이 아니여야 함.
		 순서2) 입력한 년도를 400으로 나누면 나머지가 0이어야 한다.
		 순서3) 조건1에서는 AND 논리연산자를 사용.
		 순서4) 조건1과 조건2는 OR 논리연산자를 사용.
		 
		 년도 입력: 2016
		 출력은 아래의 2개중에 하나를 출력바람.
		 1) 2016년은 윤년이 아닙니다.
		 2) 2016년은 윤년입니다.
		*/
		System.out.print("년도 입력: ");
		Scanner scanner = new Scanner(System.in);
		
		int year = scanner.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + "은 윤년입니다.");
		} else {
			System.out.println(year + "은 윤년이 아닙니다.");
		}
		
		scanner.close();
	}
}