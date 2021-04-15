import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
		double rate = 1183.00;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>> ");
		int won = sc.nextInt();
		
		double dollar = won / rate;
		
		System.out.println(won + "원은 $" + dollar + "입니다.");
		
		sc.close();
	}
}