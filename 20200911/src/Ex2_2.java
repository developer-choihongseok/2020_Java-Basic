import java.util.Scanner;

public class Ex2_2 {
	public static void main(String[] args) {
		
//		int korea = 90;
//		int english = 80;
//		int math = 70;
//		int science = 60;
//		int sum;
//		double avg;
//		
//		sum = korea + english + math + science;
//		avg = sum / 4;
//		
//		System.out.println("모든 과목의 총점: " + sum);
//		System.out.println("모든 과목의 평균값: " + avg);
		
		int sum;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요: ");
		int korea = sc.nextInt();
		
		System.out.print("영어 점수를 입력하세요: ");
		int english = sc.nextInt();
		
		System.out.print("수학 점수를 입력하세요: ");
		int math = sc.nextInt();
		
		System.out.print("과학 점수를 입력하세요: ");
		int science = sc.nextInt();
		
		sum = korea + english + math + science;
		avg = sum / 4;
		
		System.out.println("모든 과목의 총점: " + sum);
		System.out.println("모든 과목의 평균값: " + avg);
		
		sc.close();
	}
}