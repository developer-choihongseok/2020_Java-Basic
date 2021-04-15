import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		
		System.out.print("값을 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		
		int[] array = new int[10];
		int max = array[0], min = array[0], sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
			
			if(max < array[i]) {
				max = array[i];	
			} else if(min > array[i]) {
				min = array[i];	
			}
			
			sum += array[i];
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("합 : " + sum);
		System.out.println("평균 : " + Double.parseDouble(String.format("%.13f", sum / 3.0))); 
		
		scanner.close();
	}
}