import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		
		System.out.print("두 수를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);

		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		System.out.println();
		
//		if(num1 > num2) {
//			for(int i = 1; i < 10; i++) {
//				for(int j = num2; j <= num1; j++) {
//					System.out.printf("%d * %d = %d ", j, i, j * i);
//				}
//				System.out.println();
//			}
//		} else {
//			for(int i = 1; i < 10; i++) {
//				for(int j = num2; j >= num1; j--) {
//					System.out.printf("%d * %d = %d ", j, i, j * i);
//				}
//				System.out.println();
//			}
//		}
		
		if(num1 > num2) {
			
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
			
			for(int i = 1; i < 10; i++) {
				for(int j = num1; j <= num2; j++) {	// 단 
					System.out.printf("%d  *%3d  =%3d\t",j,i,j*i);
				}
				System.out.println();
			}
		} else {
			
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
			
			for(int i = 1; i < 10; i++) {
				for(int j = num1; j >= num2; j--) {
					System.out.printf("%d  *%3d = %3d\t", j,i, j*i);
				}
				System.out.println();
			}	
		}
		
		scanner.close();
	}
}