
public class Ex_3 {
	public static void main(String[] args) {
		// 1. for문
//		System.out.println("-------------------");
//		System.out.println("간단한 로또 프로그램 v1.0");
//		System.out.println("-------------------");
//		
//		for(int i = 1; i <= 6; i++) {
//			int number = (int)(Math.random() * 45) + 1;
//			System.out.print(number + " ");
//		}
//		System.out.println();
		
		// 2. while문
//		System.out.println("-------------------");
//		System.out.println("간단한 로또 프로그램 v1.0");
//		System.out.println("-------------------");
//		
//		int i = 1;
//		
//		while(i <= 6) {
//			int number = (int)(Math.random() * 45) + 1;
//			System.out.print(number + " ");
//			i++;
//		}
//		System.out.println();
		
		// 3. do-while문
		System.out.println("-------------------");
		System.out.println("간단한 로또 프로그램 v1.0");
		System.out.println("-------------------");
		
		int i = 1;
		
		do {
			int number = (int)(Math.random() * 45) + 1;
			System.out.print(number + " ");
			i++;
		}while(i <= 6);
	}
}