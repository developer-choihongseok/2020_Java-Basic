package OOP1;

//호출 흐름 생각.
public class CallStackTest {

	public static void main(String[] args) {
		
		System.out.println("main 시작");		// 1
		first();
		System.out.println("main 끝");		// 6
	}
			
	static void first() {
		System.out.println("first 시작");		// 2
		second();
		System.out.println("first 끝");		// 5
	}
	
	static void second() {
		System.out.println("second 시작");	// 3
		System.out.println("second 끝");		// 4
	}
	
}
