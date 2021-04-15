import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		
		System.out.print("정수 3개 입력>> ");
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		/*
		int max = (num1 > num2 && num1 > num3) ? num1 : (num2 > num3) ? num2 : num3;
		int min = (num1 < num2 && num1 < num3) ? num1 : (num2 < num3) ? num2 : num3;
		int midian_value = (num1 + num2 + num3) - max - min;
		
		System.out.println("중간 값은 " + midian_value);
		*/
		
		int median = num1;	// num1이 중간값이라고 가정!!
		
		// num1이 중간값이 되는 경우
		if((num1 >= num2 && num1 <= num3) || (num1 >= num3 && num1 <= num2)) {
			median = num1;
		  // num2가 중간값이 되는 경우
		} else if((num2 >= num1 && num2 <= num3) || (num2 >= num3 && num2 <= num1)) {
			median = num2;
		  // num3이 중간값이 되는 경우
		} else {
			median = num3;
		}
		System.out.println("중간 값은 " + median);
		
		scanner.close();
	}
}