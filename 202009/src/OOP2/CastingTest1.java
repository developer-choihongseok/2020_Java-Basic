package OOP2;
/*
 참조변수의 형변환
  - 서로 상속관계에 있는 타입간의 형 변환만 가능
  - 자식타입에서 부모타입으로 형 변환 시 생략 가능!!
  - 부모타입에서 자식타입으로 형 변환 시 생략 불가!!
*/
class Car2{
	
	String color;
	int door;
	
	void drive() {
		System.out.println("Drive, Brrrr");
	}
	
	void stop() {
		System.out.println("Stop!!!");
	}
}

class FireEngine extends Car2{
	
	void water() {
		System.out.println("Water~~~");
	}
}

public class CastingTest1 {
	public static void main(String[] args) {
		
		Car2 car = null;
		
		FireEngine fe = new FireEngine();
		fe.water();
		
		FireEngine fe2 = null;
		
		car = fe; 	// car = (Car2) fe, Car2 car = new FireEngine();
		fe2 = (FireEngine) car;
		fe2.water();
		System.out.println();
		
		// 참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위해, "instanceof" 연산자를 사용.
		// 형 변환이 가능하면 true, 가능하지 못하면 false로 반환.
		if(fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance");
		}
		
		if(fe instanceof Car2) {
			System.out.println("This is a Car2 instance");
		}
		
		if(fe instanceof Object) {
			System.out.println("This is a Object instance");
		}
		System.out.println();
		
		System.out.println(fe.getClass());
		System.out.println(fe.getClass().getName());	// 참조변수가 가리키고 있는 인스턴스의 클래스 이름을 문자열(String)으로 반환.
	}
}
