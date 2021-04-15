package ExceptionPackage;

import java.util.InputMismatchException;

public class ExceptionEx2 {
	public static void main(String[] args) {
		
		int number = 100;
		int result = 0;
		
		for (int i = 0; i < 10; i++) {
			try {
				result = number / (int)(Math.random() * 10);
				System.out.println(result);
				
			} catch (ArithmeticException e) {
				System.out.println("0으로는 나눌 수 없습니다.");
			} catch(ArrayIndexOutOfBoundsException ae) {
				
			} catch(InputMismatchException ie) {
				
			} catch(Exception ee) {
				
			}
		}
	}
}
