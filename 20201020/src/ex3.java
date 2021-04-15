// 구구단 -> 2단~9단
public class ex3 {
	public static void main(String[] args) {
	
		for (int i = 9; i < 81; i++) {
			int dan = i / 9 + 1;	// 9의 배수마다 +1
			int gob = i % 9 + 1;	// 0~8 +1
			
			System.out.printf("%d * %d = %d\n", dan, gob, dan * gob);
		}
		
		// 구구단 1단 ~ 9단까지 for문
//		for(int i = 1; i < 90; i++) {
//			if(i % 10 == 0) {
//				i++;
//				System.out.println();
//			}
//			System.out.printf("%d * %d = %d\n", (i/10)+1, i%10, ((i/10) + 1)*(i%10));
//		}
	}
}
