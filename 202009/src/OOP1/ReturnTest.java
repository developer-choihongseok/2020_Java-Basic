package OOP1;

public class ReturnTest {
	
	public static void main(String[] args) {
		// return은 오로지 하나만 존재 가능
		// 참조변수를 활용하면, 여러개의 값 반환 효과 가능!!
		int result = add(3,5);
		
		System.out.println(result);
		System.out.println();
		
		int[] result2 = {0,0,0};
		
		add(3,4,result2);
		
		System.out.println(result2[0]);
		System.out.println(result2[1]);
		System.out.println(result2[2]);
		
	}
	
	static int add(int a, int b) {
		return a + b;
	}
	
	static void add(int a, int b, int[] result) {
		result[0] = a + b;
		result[1] = a + b;
		result[2] = a + b;
	}
}
