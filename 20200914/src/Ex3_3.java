import java.util.Scanner;

public class Ex3_3 {
	public static void main(String[] args) {
		
		int coin_500won = 0;
		int coin_100won = 0;
		int coin_50won = 0;
		int coin_10won = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("특정 금액의 지폐를 입력하세요: ");
		int money = scanner.nextInt();
		
		coin_500won = money / 500;	// 500원 동전 개수
		money = money - coin_500won * 500;
		
		coin_100won = money / 100;	// 100원 동전 개수
		money = money - coin_100won * 100;
		
		coin_50won = money / 50;	// 50원 동전 개수
		money = money - coin_50won * 50;
		
		coin_10won = money / 10;	// 10원 동전 개수
		money = money - coin_10won * 10;
		
		System.out.println("----------------------------------");
		System.out.println("\t동전 교환기 프로그램 1.0\t");
		System.out.println("----------------------------------");
		System.out.println("오백원 갯수 : " + coin_500won + "개");
		System.out.println("백원 갯수 : " + coin_100won + "개");
		System.out.println("오십원 갯수 : " + coin_50won + "개");
		System.out.println("십원 갯수 : " + coin_10won + "개");
		System.out.println("바꾸지 못한 잔돈 : " + money + "개");
		System.out.println("----------------------------------");
		
		scanner.close();
	}
}