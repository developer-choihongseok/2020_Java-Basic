import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 숫자를 입력하세요: ");
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		int num3 = (num1 > num2) ? num1 : num2;
		
		System.out.println("두 숫자 중 큰 값은 " + num3 + "입니다.");
		
		scanner.close();
	}
}