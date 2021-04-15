import java.util.Scanner;

public class Ex_1 {
	public static void main(String[] args) {
		
		// 1. for문
		System.out.println("-------------------");
		System.out.println("짝수,홀수 구분 프로그램 v1.0");
		System.out.println("-------------------");
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 1; i <= 5; i++) {
			System.out.print(i + ". Num" + i + "=> ");
			int number = scanner.nextInt();
			
			if(number % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
		}
		System.out.println();
		
		// 2. while문
//		System.out.println("-------------------");
//		System.out.println("짝수,홀수 구분 프로그램 v1.0");
//		System.out.println("-------------------");
//		
//		int i = 1;
//		
//		while(i <= 5) {
//			System.out.print(i + ". Num" + i + "=> ");
//			
//			int number = scanner.nextInt();
//			
//			if(number % 2 == 0) {
//				System.out.println("짝수입니다.");
//			} else {
//				System.out.println("홀수입니다.");
//			}
//			i++;
//		}
//		System.out.println();
		
		// 3. do-while문
//		System.out.println("-------------------");
//		System.out.println("짝수,홀수 구분 프로그램 v1.0");
//		System.out.println("-------------------");
//		
//		i = 1;
//		
//		do {
//			System.out.print(i + ". Num" + i + "=> ");
//			
//			int number = scanner.nextInt();
//			
//			if(number % 2 == 0) {
//				System.out.println("짝수입니다.");
//			} else {
//				System.out.println("홀수입니다.");
//			}
//			i++;
//			
//		}while(i <= 5);
//		
		scanner.close();
	}
}