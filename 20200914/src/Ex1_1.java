import java.util.Scanner;

public class Ex1_1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력받으세요: ");
		int num = scanner.nextInt();
		
		String result = (num % 2 == 0) ? "짝수" : "홀수";
		
		System.out.println(num + "은(는) " + result + "입니다.");
		
		scanner.close();
	}
}