import java.util.Scanner;

// 시 : 시간 / 3600, 분 : 시간 % 3600 / 60, 초 : 시간 % 3600 % 60
public class ex4 {
	public static void main(String[] args) {
		
		int hour = 0, second = 0, minute = 0;
		
		System.out.print("초를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		
		int time = scanner.nextInt();
		
		for(int i = 1; i <= time; i++) {
			if(i % 60 == 0) {
				minute++;
			}
			if(minute == 60) {
				hour++;
				minute = 0;
			}
//			second = time - 3600 * hour - 60 * minute;
			second = time % 3600 % 60;
		}
		System.out.println("시: " + hour + " 분: " + minute + " 초: " + second);
		
		scanner.close();
	}
}