import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("2개의 정수와 연산자를 입력 : ");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		char operator = scanner.next().charAt(0);	// String operator = scanner.next();
		Calc exp;	// 부모 클래스의 참조변수 선언.
		
//		switch(operator) {
//		case "+":
//			exp = new Add();
//			exp.setValue(a, b);
//			System.out.println(exp.calculate());
//			break;
//		case "-":
//			exp = new Sub();
//			exp.setValue(a, b);
//			System.out.println(exp.calculate());
//			break;
//		case "*":
//			exp = new Mul();
//			exp.setValue(a, b);
//			System.out.println(exp.calculate());
//			break;
//		case "/":
//			exp = new Div();
//			exp.setValue(a, b);
//			System.out.println(exp.calculate());
//			break;
//		default:
//			System.out.println("잘못된 연산자입니다.");
//		}
		
		switch(operator) {
		case '+':
			exp = new Add();	// 다형성
			exp.setValue(a, b);
			System.out.println(exp.calculate());
			break;
		case '-':
			exp = new Sub();
			exp.setValue(a, b);
			System.out.println(exp.calculate());
			break;
		case '*':
			exp = new Mul();
			exp.setValue(a, b);
			System.out.println(exp.calculate());
			break;
		case '/':
			exp = new Div();
			exp.setValue(a, b);
			System.out.println(exp.calculate());
			break;
		default:
			System.out.println("잘못된 연산자입니다.");
		}
		
		scanner.close();
	}
}