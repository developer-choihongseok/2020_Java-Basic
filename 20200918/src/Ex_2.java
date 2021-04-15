
public class Ex_2 {
	public static void main(String[] args) {
		
		// 1. for문
//		System.out.println("-------------------");
//		System.out.println("5의 배수 출력 프로그램 v1.0");
//		System.out.println("-------------------");
//		
//		for(int i = 5; i <= 100; i++) {
//			if(i % 5 == 0) {
//				System.out.print(i + " ");
//			}
//		}
//		System.out.println();
		
		// 2. while문
		System.out.println("-------------------");
		System.out.println("5의 배수 출력 프로그램 v1.0");
		System.out.println("-------------------");
		
		int i = 5;
		
		while(i <= 100) {
			if(i % 5 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();
		
		// 3. do-while문
//		System.out.println("-------------------");
//		System.out.println("5의 배수 출력 프로그램 v1.0");
//		System.out.println("-------------------");
//		
//		i = 5;
//		
//		do {
//			if(i % 5 == 0) {
//				System.out.print(i + " ");
//			}
//			i++;
//		}while(i <= 100);
	}
}