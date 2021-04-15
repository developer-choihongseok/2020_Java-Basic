import java.util.Scanner;

public class switch_3 {
	public static void main(String[] args) {
		
		System.out.println("--------------------");
		System.out.println("담배 자판기 프로그램 v1.0");
		System.out.println("--------------------");
		System.out.println("원하는 담배를 메뉴에서 선택하세요." + "\n");
		System.out.println("1. 에쎄 골든 리프\t\t6,000원");
		System.out.println("2. 에쎄 스페셜 골드\t	5,000원");
		System.out.println("3. 더원 블루\t	4,500원");
		System.out.println("4. 더원 오렌지\t	4,500원");
		System.out.println("5. 더원 화이트\t	4,500원");
		System.out.println("------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.print("담배를 선택하세요 => ");
		
		int cigarette = scanner.nextInt();
		
		switch(cigarette) {
		case 1:
			System.out.println("에쎄 골든 리프를 선택하셨습니다.");
			break;
		case 2:
			System.out.println("에쎄 스페셜 골드를 선택하셨습니다.");
			break;
		case 3:
			System.out.println("더원 블루를 선택하셨습니다.");
			break;
		case 4:
			System.out.println("더원 오렌지를 선택하셨습니다.");
			break;
		case 5:
			System.out.println("더원 화이트를 선택하셨습니다.");
			break;
		default:
			System.out.println("잘못 선택하셨습니다.\n다시 선택해주세요.");
		}
		
		System.out.println("------------------");
		System.out.print("담배 금액을 입금하세요 => ");
		
		int money = scanner.nextInt();
		
		if(cigarette == 1 && money == 6000) {
			System.out.println("정상적으로 담배를 구매하셨습니다.");
		}else if(cigarette == 2 && money == 5000) {
			System.out.println("정상적으로 담배를 구매하셨습니다.");
		}else if((cigarette == 3 || cigarette == 4 || cigarette == 5) && money == 4500) {
			System.out.println("정상적으로 담배를 구매했습니다.");
		}else {
			System.out.println("비정상적으로 담배를 구매했습니다.");
		}
		
		scanner.close();
	}
}