package ExceptionPackage;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
try 블럭 내에서 예외 발생 시
	1. 발생한 예외와 일치하는 catch 블럭이 있는지 확인.
	2. 일치한 catch 블럭 존재 시, 해당 catch 블럭 내의 문장 수행.
	      전체 try-catch문을 빠져나가 다음 문장 실행
	발생하지 않을 시
		- catch 블럭을 거치지 않고, try-catch문을 빠져나가서 수행 계속.
*/
public class ExceptionEx3 {
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
		int number[] = new int[2];
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
//			num = sc.nextInt();
			System.out.println(number[2]);
			System.out.println(0/0); // 고의 발생!!
			System.out.println(4);
		} catch (ArithmeticException ae) {
			System.out.println(5);
			// 예외 발생 당시, 호출 스택에 있었던 메서드의 정보와 예외 메세지를 화면에 출력.
			System.out.println("예외 메시지 : " + ae.getMessage());
		} catch(ArrayIndexOutOfBoundsException aoe) {
			System.out.println("배열 인덱스 초과");
			aoe.printStackTrace();
			System.out.println("예외 메시지 : " + aoe.getMessage());
		} catch(InputMismatchException ie) {
			System.out.println("입력값 잘못 입력");
		} catch(Exception e) {
			System.out.println("다른 오류");
			e.printStackTrace();
		} 
		System.out.println(6);
//		sc.close();
	}
}