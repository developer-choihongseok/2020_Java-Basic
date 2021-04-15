package InnerClass;
/*
 내부클래스의 접근제어자
 	- 변수에 사용가능한 접근 제어자와 동일
 	- static 클래스만 static 멤버 정의 가능
 	- 내부 클래스도 외부 클래스의 멤버로 간주, 동일한 접근성
 	- 단, 외부 클래스의 지역변수는 final이 붙은 상수만 접근 가능(jdk 1.8)
*/
public class InnerEx3 {
	
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner{
		int iiv = outerIv;	// 외부 클래스의 private 멤버도 접근 가능
		int iiv2 = outerCv;
	}
	
	static class StaticInner{
//		int siv = outerIv;	// static 클래스는 외부클래스의 인스턴스 멤버에 접근 X
		static int scv = outerCv;
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0;
		
		class LocalInner {
			int liv = outerIv;
			int liv2 = outerCv;
			
			int liv3 = lv;	// 외부 클래스의 지역변수는 final 붙은 상수만 접근 가능 했었음(하지만, 현재 에러 X)
			int liv4 = LV;
		}
	}
	
	public static void main(String[] args) {
		
	}
}