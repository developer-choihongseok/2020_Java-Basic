import java.util.Scanner;

public class Ex1_1 {
	public static void main(String[] args) {
		
//		final double PI = 3.14;
//		double radius = 5;
//		double area = 0;
//		
//		area = radius * radius * PI;
//		
//		System.out.println("원의 면적: " + area);
		
		double area = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원주율을 입력하세요: ");
		double PI = sc.nextDouble();
		
		System.out.print("반지름을 입력하세요: ");
		int radius = sc.nextInt();
		
		area = PI * radius * radius;
		
		System.out.println("원의 면적: " + area);
		
		sc.close();
	}
}