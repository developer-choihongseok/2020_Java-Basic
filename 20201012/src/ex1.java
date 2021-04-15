import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("곱하고자 하는 두 수 입력>> ");
			
			try {
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				
				System.out.println(num1 + "X" + num2 + "=" + num1 * num2);
				break;
			} catch (Exception e) {
				System.out.println("실수 입력 X");
				
				sc.nextLine();	// ★ 이 부분 중요!!

				continue;
			}
		}while(true);
		
		sc.close();
	}
}