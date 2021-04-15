import java.util.ArrayList;
import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		
		// 풀이 1
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>> ");
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Character> list = new ArrayList<Character>();
		
		double score = 0, avg = 0;
		
		for (int i = 0; i < 6; i++) {
			char c = sc.next().charAt(0);
			
			list.add(c);
		}
		
		for (int i = 0; i < list.size(); i++) {
			char c = list.get(i);
			
			switch(c) {
			case 'A':
				score += 4.0;
				break;
			case 'B':
				score += 3.0;
				break;
			case 'C':
				score += 2.0;
				break;
			case 'D':
				score += 1.0;
				break;
			case 'F':
				score += 0;
				break;
			}
		}
		
		avg = score / list.size();
		System.out.println("평균: " + avg);
		
		sc.close();
		
		// 풀이 2
//		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>> ");
//		Scanner sc = new Scanner(System.in);
//		
//		ArrayList<Character> list = new ArrayList<Character>();
//		
//		for (int i = 0; i < 6; i++) {
//			String s = sc.next();
//			
//			if(s.length() > 1) {
//				System.out.println("Not Character!");
//				return;
//			}
//			
//			char ch = s.charAt(0);
//			
//			if((ch >= 'A' && ch <= 'D') || ch == 'F') {
//				list.add(ch);
//			}else {
//				System.out.println("Invalid");
//				return;
//			}
//		}
//
//		double score = 0.0;
//		
//		for (int i = 0; i < list.size(); i++) {
//			char ch = list.get(i);
//			
//			switch(ch) {
//			case 'A':
//				score += 4.0;
//				break;
//			case 'B':
//				score += 3.0;
//				break;
//			case 'C':
//				score += 2.0;
//				break;
//			case 'D':
//				score += 1.0;
//				break;
//			default:
//				score += 0.0;
//				break;
//			}
//		}
//		
//		System.out.println((double)score / list.size());
//		
//		sc.close();
	}
}
