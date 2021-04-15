package OOP1;

public class MemberCall {
	
	int iv = 10;		// 인스턴스 변수
	static int cv = 20;	// 클래스 변수
	
	int iv2 = cv;
//	static int cv2 = iv;	// 에러!!(클래스 변수는 인스턴스 변수를 사용할 수 없음)
	
	// 클래스 변수에 인스턴스 변수를 사용하고 싶으면,객체를 생성해서 접근!!
	static int cv2 = new MemberCall().iv;
	
	static void staticMethod() {
		System.out.println(cv);
//		System.out.println(iv);	// 에러!!
		
		MemberCall c = new MemberCall();
		System.out.println(c.iv);
	}
	
	void instanceMethod() {
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticMethod2() {
		staticMethod();
//		instanceMethod();	// 에러!!
		
		MemberCall c = new MemberCall();
		c.instanceMethod();
		
//		int result = new MemberCall().instanceMethod();		// 일회용
	}
}
