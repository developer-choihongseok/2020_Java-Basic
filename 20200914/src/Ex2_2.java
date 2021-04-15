import java.util.Scanner;

public class Ex2_2 {
	public static void main(String[] args) {
		
		int max = 0;
		int min = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 2개를 입력하세요: ");
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		max = (num1 > num2)	? num1 : num2;
		min = (num1 < num2)	? num1 : num2;
		
		System.out.println("최대값: " + max + "입니다.");
		System.out.println("최소값: " + min + "입니다.");
		
		scanner.close();
	}
}