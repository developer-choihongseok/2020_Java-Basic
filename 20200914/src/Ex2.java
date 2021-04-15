import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("화씨를 입력하세요 : ");
		int c = scanner.nextInt();
		System.out.println("현재 화씨는 : " + c);
		
		double celcius = 5.0 / 9.0 * (c - 32.0);
		System.out.println("입력한 화씨를 섭씨로 바꾼 결과 : " + (int)celcius);
		
		scanner.close();
	}
}