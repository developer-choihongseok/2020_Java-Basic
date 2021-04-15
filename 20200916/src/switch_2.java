import java.util.Scanner;

public class switch_2 {
	public static void main(String[] args) {
		
		System.out.println("-----------------");
		System.out.println("간단한 계산기 프로그램 v1.0");
		System.out.println("-----------------");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1) Num1 입력 => ");
		int Num1 = scanner.nextInt();
		System.out.print("2) Num2 입력 => ");
		int Num2 = scanner.nextInt();
		System.out.print("3) 연산자 입력 => ");
		String operator = scanner.next();
		System.out.println();
		
		int sum = Num1 + Num2;
		int cha = Num1 - Num2;
		int mul = Num1 * Num2;
		int div = Num1 / Num2;
		
		switch(operator) {
		case "+":
			System.out.println(Num1 + " + " + Num2 + " = " + sum);
			break;
		case "-":
			System.out.println(Num1 + " - " + Num2 + " = " + cha);
			break;
		case "X":
			System.out.println(Num1 + " X " + Num2 + " = " + mul);
			break;
		case "/":
			System.out.println(Num1 + " / " + Num2 + " = " + div);
			break;
		default:
			System.out.println("연산자를 다시 입력해주세요!!");
		}
		
		scanner.close();
	}
}