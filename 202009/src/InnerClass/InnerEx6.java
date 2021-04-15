package InnerClass;

// 단순한 익명 클래스의 사용 예
public class InnerEx6 {
	
	Object iv = new Object() {
		void method() {
			
		}
	};	// 익명 클래스	-> 일회성으로 사용!!
	
	static Object cv = new Object() {
		void method() {
			
		}
	};	// 익명 클래스
	
	void myMethod() {
		Object value = new Object() {
			void method() {
				
			}
		};	// 익명 클래스
	}
}
