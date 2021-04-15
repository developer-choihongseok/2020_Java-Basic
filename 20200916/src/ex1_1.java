import java.util.Scanner;

public class ex1_1 {
	public static void main(String[] args) {
		
		System.out.println("-----------------");
		System.out.println("홀짝 판단 프로그램 v1.0");
		System.out.println("-----------------");
		System.out.print("1개의 숫자를 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		
		if(number % 2 != 0) {
			System.out.println("입력한 숫자는 홀수입니다.");
		} else {
			System.out.println("입력한 숫자는 짝수입니다.");
		}
		
		scanner.close();
	}
}