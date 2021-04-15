
public class ex1 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i < 100; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("1부터 99까지의 짝수 합은 : " + sum);
	}
}