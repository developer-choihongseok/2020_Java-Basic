import java.util.Scanner;

public class Ex_4 {
	public static void main(String[] args) {
		
		System.out.println("---------------------------");
		System.out.println("입력받는수의 합을 구하는 프로그램 v1.0");
		System.out.println("---------------------------");
		
		Scanner scanner = new Scanner(System.in);
		
		int i = 0, sum = 0;
		
		System.out.print("1. Num1 입력 => ");
		int num1 = scanner.nextInt();
		System.out.print("2. Num2 입력 => ");
		int num2 = scanner.nextInt();
		
		if(num2 <= num1) {
			System.out.println("에러!!");
			System.out.print("2. Num2 입력 => ");
			num2 = scanner.nextInt();
			
			for(i = num1; i <= num2; i++) {
				sum += i;
			}
		} else {
			for(i = num1; i <= num2; i++) {
				sum += i;
			}
		}
		System.out.println();
		System.out.println(num1 + " ~ " + num2 + "까지의 합: " + sum);
	}
}