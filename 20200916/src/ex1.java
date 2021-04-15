import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		
		System.out.print("숫자를 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		if(num >= 0 && num < 10) {
			System.out.println("0이상 10미만");
		} else if(num >= 10 && num < 20) {
			System.out.println("10이상 20미만");
		} else
			System.out.println("20이상~~");
		
		scanner.close();
	}
}