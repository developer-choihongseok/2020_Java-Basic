import java.util.Scanner;

public class ex2_2 {
	public static void main(String[] args) {
		
		System.out.println("-----------------");
		System.out.println("대소 비교 프로그램 v1.0");
		System.out.println("-----------------");
		Scanner scanner = new Scanner(System.in);

		System.out.print("1) num1 입력 => ");
		int num1 = scanner.nextInt();
		System.out.print("2) num2 입력 => ");
		int num2 = scanner.nextInt();
		
		if(num1 == num2) {
			System.out.println(num1 + "과 " + num2 + "은(는) 같다.");
		} else {
			if(num1 > num2) {
				System.out.println(num1 + "이(가) " + num2 + "보다 크다.");
			} else {
				System.out.println(num1 + "이(가) " + num2 + "보다 작다.");
			} 
		}
		
		scanner.close();
	}
}