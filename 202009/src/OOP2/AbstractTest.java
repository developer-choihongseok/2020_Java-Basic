package OOP2;
/*
  추상 클래스
  	- 클래스가 설계도라면, 추상 클래스는 미완성 설계도
  	- 추상 메서드를 포함하고 있는 클래스
  	- 일반 메서드가 추상 메서드가 호출 가능(호출 시 필요한 건 선언부)
  	- 완성된 형태가 아니므로 인스턴스 생성 불가
  	- 다른 클래스 작성 시 도움 목적!!
  	- 추상 클래스에는 추상 메서드가 있으니, 상속을 통해서 구현해주어야 한다.
  	  	
  추상 메서드
 	- 선언부만 있고, 구현부가 없는 메서드
 	- 꼭 필요하지만, 자식마다 다르게 구현될 경우 사용(강제성 부여)
 	- 추상클래스를 상속받은 자식 클래스에서 추상메서드 구현부 완성
*/
abstract class Test1{
	
	int currentPos;
	
	Test1() {
		
	}
	
	abstract void play(int pos);	// 추상메서드
	abstract void stop();			// 추상메서드
	
	void test() {
		
	}
}

class Test2 extends Test1{

	@Override
	void play(int pos) {
		
	}

	@Override
	void stop() {
		
	}
}

public class AbstractTest {
	public static void main(String[] args) {
		
//		Test1 t = new Test1();	// 에러!! 이유: 미완성 클래스이므로..
		Test2 t = new Test2();
	}
}
