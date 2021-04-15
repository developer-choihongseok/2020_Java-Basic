//import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class ex3 {
	public static void main(String[] args) {
		
		// 풀이 1
		Scanner sc = new Scanner(System.in);
		
		Vector<Integer> v = new Vector<Integer>();
		
		do {
			System.out.print("강수량 입력 (0 입력시 종료)>> ");
			int num = sc.nextInt();
			
			if(num == 0) {
				break;
			}
			v.add(new Integer(num));
			
			int avg = 0;
			
			for (int i = 0; i < v.size(); i++) {
				System.out.print(v.get(i) + " ");
				avg += v.get(i);
			}
			System.out.println();
			
			avg /= v.size();
			System.out.println("현재 평균 " + avg);
		}while(true);
		
		sc.close();
		
		// 풀이 2
//		Scanner sc = new Scanner(System.in);
//		
//		Vector<Integer> v = new Vector<Integer>();
//		
//		while(true) {
//			System.out.print("강수량 입력 (0 입력시 종료)>> ");
//			int n = sc.nextInt();
//			
//			if(n == 0) {
//				break;
//			}
//			v.add(n);
//			
//			print(v);
//		}
//		
//		sc.close();
//	}
//	
////	static void print(Vector<Integer> v) {
////		
////		int sum = 0;
////		
////		for (int i = 0; i < v.size(); i++) {
////			System.out.println(v.get(i) + " ");
////			
////			sum += v.get(i);
////		}
////		System.out.println();
////		
////		System.out.println("현재 평균 " + sum/v.size());
////	}
//	
//	static void print(Vector<Integer> v) {
//	
//		int sum = 0;
//	
//		Iterator<Integer> it = v.iterator();
//		
//		while(it.hasNext()) {
//			int n = it.next();
//			System.out.print(n + " ");
//			sum += n;
//		}
//		System.out.println();
//
//		System.out.println("현재 평균 " + sum / v.size());
	}
}
