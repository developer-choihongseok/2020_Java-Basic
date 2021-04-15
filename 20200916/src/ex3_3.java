import java.util.Scanner;

public class ex3_3 {
	public static void main(String[] args) {
		
		System.out.println("-----------------");
		System.out.println("간단한 계산기 프로그램 v1.0");
		System.out.println("-----------------");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1) Num1 입력 => ");
		int Num1 = scanner.nextInt();
		System.out.print("2) Num2 입력 => ");
		int Num2 = scanner.nextInt();
		System.out.println();
		
		int sum = Num1 + Num2;
		int minus = Num1 - Num2;
		int multi = Num1 * Num2;
		int divide = Num1 / Num2;
		
		System.out.println(Num1 + " + " + Num2 + " = " + sum);
		System.out.println(Num1 + " - " + Num2 + " = " + minus);
		System.out.println(Num1 + " * " + Num2 + " = " + multi);
		System.out.println(Num1 + " / " + Num2 + " = " + divide);
	
		scanner.close();
	}
}