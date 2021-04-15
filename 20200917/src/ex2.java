import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		
		System.out.print("값을 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
		
		int cnt = 0;
		
		while(true) {
			int number = scanner.nextInt();
			
			if(number == 0) {
				break;
			}
			if((number % 5 != 0) && (number % 7 != 0)) {
				cnt++;
			}
		}
		System.out.println();
		System.out.println("5, 7의 배수를 제외한 갯수는 : " + cnt);
		
		scanner.close();
	}
}