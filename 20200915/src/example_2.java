import java.util.Scanner;

public class example_2 {
	public static void main(String[] args) {
		
		System.out.print("점수 입력: ");
		Scanner scanner = new Scanner(System.in);
		
		int grade = scanner.nextInt();
		
		if(grade >= 90) {
			System.out.println("A학점");
		} 
		if(80 <= grade && grade < 90) {
			System.out.println("B학점");
		}
		if(70 <= grade && grade < 80) {
			System.out.println("C학점");
		}
		if(60 <= grade && grade < 70) {
			System.out.println("D학점");
		}
		if(grade < 60) {
			System.out.println("F학점");
		}
			
		scanner.close();		
	}
}