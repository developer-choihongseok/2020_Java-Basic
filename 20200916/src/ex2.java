import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		
		System.out.print("달 입력 : ");
		Scanner scanner = new Scanner(System.in);
		
		int month = scanner.nextInt();
//		int day = 0;
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month + "월의 날 수는 31일 입니다.");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(month + "월의 날 수는 30일 입니다.");
			break;
		case 2:
			System.out.println(month + "월의 날 수는 28일 입니다.");
			break;
		}
		
//		switch(month) {
//		case 2:
//			day = 28;
//			break;
//		case 4: case 6: case 9: case 11:
//			day = 30;
//			break;
//		default:
//			day = 31;
//		}
//		
//		System.out.println(month + "월의 날 수는 " + day + "입니다.");
		
		scanner.close();
	}
}