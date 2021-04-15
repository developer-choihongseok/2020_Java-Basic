import java.util.Scanner;

class Calculator{
	
	int num1, num2;
	
	Calculator(int number1, int number2) {
		this.num1 = number1;
		this.num2 = number2;
	}
	
	int add() {
		return num1 + num2;
	}
	
	int sub() {
		return num1 - num2;
	}
	
	int mul() {
		return num1 * num2;
	}
	
	int div() {
		return num1 / num2;
	}
}

public class ex2 {
	public static void main(String[] args) {
		
		System.out.println("Calculator start");
		Scanner scanner = new Scanner(System.in);
		
		int a, b;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		Calculator calc = new Calculator(a,b);
		
		System.out.println(a + " + " + b + " = " + calc.add());
		System.out.println(a + " - " + b + " = " + calc.sub());
		System.out.println(a + " * " + b + " = " + calc.mul());
		System.out.println(a + " / " + b + " = " + calc.div());
		
		scanner.close();
	}
}