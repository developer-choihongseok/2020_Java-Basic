package API;

import java.util.Random;
/*
 Random 클래스 -> 난수 생성
 	Random() : 현재 시간을 종자값으로 이용하는 Random 인스턴스를 생성
	Random(long seed) : seed를 종자값으로 하는 인스턴스 생성 
*/
public class RandomTest {
	public static void main(String[] args) {
	
		Random random = new Random();
		
		for (int i = 0; i < 5; i++) {
			// nextInt() : 무작위 int값 반환
			// nextInt(int n) : 0보다 크고, n보다는 작은 int값 반환
			System.out.println("기본 생성자 : " + random.nextInt(100));
		}
		System.out.println();
		
		// seed값을 똑같이 주면, 서로 같은 결과가 나온다.
		Random random1 = new Random(2);
		Random random2 = new Random(2);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("random1 : " + random1.nextInt());
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("random2 : " + random2.nextInt());
		}
	}
}