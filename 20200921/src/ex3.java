import java.util.Arrays;
import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		
		System.out.println("총 10개의 숫자 입력 ");
		Scanner scanner = new Scanner(System.in);
		
		int[] array = new int[10];
		int front = 0, back = 9;
		int input;
		
		for(int i = 0; i < array.length; i++) {
			System.out.print("? : ");
			
			input = scanner.nextInt();
			
			if(input % 2 != 0) {
				array[front++] = input;	// 입력 받은 숫자가 홀수면, 배열의 앞부터 저장
			} else {
				array[back--] = input;	// 입력 받은 숫자가 짝수면, 배열의 뒤부터 저장
			}
		}
		System.out.println("배열 요소 출력 : " + Arrays.toString(array));
		
		scanner.close();
	}
}