package CollectionFrameWorks;
/*
 제네릭(Generic)
 	- 컬렉션을 특정 타입에 맞게 형식화 해놓은 개념
 	
 	제네릭 선언
 		1. 클래스 선언부의 클래스명 뒤에 전달 받은 타입의 수만큼 ,로 구분
 		2. Generic Type은 <> 사이에 컴파일 할 당시 사용될 객체를 적어놓으면, 저장 시 제네릭 타입으로 저장
 		
 		[접근제한 class 클래스명<유형1, 유형2, 유형3, ...>]
 		
 		API에서 T,E,K,V 권장
 			T : 전달되는 객체가 현 객체 내에서 자료형(Type)으로 쓰일 때
 			E : 전달되는 객체가 현 객체 내에서 요소(Element)로 자리 잡을 때
 			K : 전달되는 객체가 현 객체 내에서 키(Key)로 사용될 때
 			V : 전달되는 객체가 현 객체 내에서 값(value)으로 사용될 때
*/
class Box{
	private Integer i;
	
	public void set(Integer i) {
		this.i = i;
	}
	
	public Integer get() {
		return i;
	}
}

class BoxAll<T>{
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
}

public class GenericTest {
	public static void main(String[] args) {
		
		Box box = new Box();
		box.set(new Integer(10));	// box.set(10);
		
		System.out.println("정수: " + box.get());
		
		BoxAll<Integer> ba = new BoxAll<Integer>();
		ba.set(new Integer(100));	// ba.set(100);
		
		System.out.println("정수: " + ba.get());
		
		BoxAll<String> ba2 = new BoxAll<String>();
		ba2.set("제네릭 클래스");
		
		System.out.println("문자열: " + ba2.get());
	}
}