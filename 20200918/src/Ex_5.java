import java.util.Scanner;

public class Ex_5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------");
		System.out.println("간단 구구단 프로그램 v1.0");
		System.out.println("--------------------");
		System.out.print("1. 구구단 입력 => ");
		int dan = sc.nextInt();
		
		System.out.println();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " X " + i + " = " + dan * i);
		}
		
		sc.close();
	}
}
