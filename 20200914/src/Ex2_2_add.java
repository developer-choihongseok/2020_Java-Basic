import java.util.Scanner;

public class Ex2_2_add {
	public static void main(String[] args) {
		
		int max = 0;
		int min = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개를 입력하세요: ");
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		max = (num1 > num2 && num1 > num3) ? num1 : (num2 > num3) ? num2 : num3;
		min = (num1 < num2 && num1 < num3) ? num1 : (num2 < num3) ? num2 : num3;
		
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		
		scanner.close();
	}
}