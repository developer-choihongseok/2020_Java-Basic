package OOP2;
/*
 다형성
  - 여러가지 형태를 가질 수 있는 능력
  - 하나의 참조변수로, 여러 타입의 객체를 참조할 수 있는 것
  - 부모타입의 참조변수로, 자식의 객체를 다룰 수 있다.
*/
class A{
	
	void methodA() {
		System.out.println("MethodA");
	}
}

class B extends A{
	
	void methodB() {
		System.out.println("MethodB");
	}
}

public class PolyMorphism1 {
	public static void main(String[] args) {
		
		A a = new A();
		a.methodA();
		
		B b = new B();
		b.methodB();
		
		a = new B();
		a.methodA();
	}
}
