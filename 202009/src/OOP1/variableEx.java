package OOP1;
/*
선언위치에 따른 변수 종류
	 
	클래스 변수
	 	선언 위치 : 클래스 영역
	 	생성 시기 : 클래스가 메모리에 올라갈 때
	 		- 인스턴스 변수 앞에 static
	 		- 모든 인스턴스가 공통된 저장공간을 공유
	 		- 한 클래스의 모든 인스턴스들이 공통적인 값을 유지해야 하는 속성의 경우
	 			
	 인스턴스 변수
	 	선언 위치 : 클래스 영역
	 	생성 시기 : 인스턴스가 생성 되었을 때
	 		 - 인스턴스 생성 필수, 독립적인 저장공간을 가지므로 서로 다른 값을 가질 수 있다.
	 		 - 인스턴스마다 고유한 상태를 유지 해야 하는 속성의 경우
	 		 
	 지역변수
	 	선언 위치 : 클래스 영역 이외의 영역(메서드, 생성자, 초기화 블럭 등)
	 	생성 시기 : 변수의 선언문이 선언 되었을 때		-> ex) int a;
	 		- 메서드 내에 선언되어, 메서드 내에서만 사용 가능
	 		- 메서드가 종료되면, 소멸
*/
class Card{
	// 인스턴스 변수
	String kind;
	int number; 	
	
	// 클래스 변수 : 폭, 넓이
	static int width = 200;	
	static int height = 250;
}

public class variableEx {
	public static void main(String[] args) {
		
		// 클래스 변수는 객체 생성 없이,클래스 이름을 직접 사용 가능.
		System.out.println("Card.width : " + Card.width);
		System.out.println("Card.height : " + Card.height);
		System.out.println();
		
		Card c1 = new Card();
		
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.printf("c1.kind : %s, c1.number : %d, 크기(%d,%d)\n", c1.kind, c1.number, Card.width, Card.height);
		System.out.printf("c2.kind : %s, c2.number : %d, 크기(%d,%d)\n", c2.kind, c2.number, Card.width, Card.height);
		System.out.println();
		
		// 정리)
		// 인스턴스 변수는 인스턴스가 생성될 때마다 생성되므로, 각기 다른 값을 유지.
		// 클래스 변수는 모든 인스턴스가 하나의 저장 공간을 공유하므로, 항상 공통된 값.
		c1.width = 120;
		c2.height = 300;
		
		System.out.printf("c1.kind : %s, c1.number : %d, 크기(%d,%d)\n", c1.kind, c1.number, Card.width, Card.height);
		System.out.printf("c2.kind : %s, c2.number : %d, 크기(%d,%d)\n", c2.kind, c2.number, Card.width, Card.height);
	}
}
