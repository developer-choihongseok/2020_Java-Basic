package OOP1;

public class TestClassCall {
	
	int iv;			// 인스턴스 변수
	static int cv;	// 클래스 변수
		
	void instanceMethod() {	// 인스턴스 메서드
			
	}
		
	static void staticMethod() {	// 클래스 메서드
			
	}
		
	void instanceMethod2() {	// 인스턴스 메서드
		instanceMethod();		// 인스턴스 메서드 호출 가능
		staticMethod();			// 클래스 메서드 호출 가능
			
		System.out.println(iv);
		System.out.println(cv);
	}
		
	static void staticMethod2() {	// 클래스 메서드
		
		staticMethod();				// 클래스 메서드 호출 가능
//		instatnceMethod();			// 에러!!(인스턴스 메서드 호출 불가)
			
		System.out.println(cv);
//		System.out.println(iv);		// 에러!!(인스턴스 변수 실행 불가)
	}
}
