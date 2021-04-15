import java.util.Scanner;
import java.util.Vector;

public class ex1 {
	public static void main(String[] args) {
		
		// 풀이 1
		System.out.print("정수(-1이 입력될 때까지)>> ");
		Scanner sc = new Scanner(System.in);
		
		Vector v = new Vector();
		
		for (int i = 0; i < v.capacity(); i++) {
			int num = sc.nextInt();
			
			if(num == -1) {
				break;
			}
			v.add(new Integer(num));
		}
		
		int max = (int) v.get(0);
		
		for (int i = 0; i < v.size(); i++) {
			if(max < (int)v.get(i)) {
				max = (int) v.get(i);
			}
		}
		System.out.print("가장 큰 수는 " + max);
		
		sc.close();
		
		// 풀이 2
//		int num;
//		
//		System.out.print("정수(-1이 입력될 때까지)>> ");
//		Scanner sc = new Scanner(System.in);
//		
//		Vector v = new Vector();
//		
//		while(true) {
//			num = sc.nextInt();
//			
//			if(num == -1) {
//				break;
//			}
//			
//			v.add(num);
//			
//		}
////		System.out.println(v);
//		
//		// 안에 있는 값이 없다면..
//		if(v.size() == 0) {	
//			System.out.println("수가 하나도 없음");
//			return;	// main에 리턴이기 때문에 그냥 종료 된다.
//		}
//		
//		printBig(v);
//		
//		sc.close();
//	}
//	
//	static void printBig(Vector v) {
//		int big  = (int) v.get(0);
//		
//		for (int i = 0; i < v.size(); i++) {
//			if(big < (int)v.get(i)) {
//				big = (int) v.get(i);
//			}
//		}
//		System.out.println("가장 큰 수는 " + big);
	}
}