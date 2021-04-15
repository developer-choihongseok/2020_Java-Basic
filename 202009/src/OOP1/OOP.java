package OOP1;

// TV 클래스 만들기
// 속성 : 크기,길이,색상,볼륨,채널..
// 기능 : 켜기,끄기,볼륨 높이기,채널 변경..
class Tv{
	// TV의 속성(멤버 변수)
	String color;	// 색상
	boolean power;	// 전원 상태
	int channel;	// 채널
	
	// TV의 기능(메서드)
	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
}

public class OOP {
	public static void main(String[] args) {
		/*
		 객체지향 이론
		 	- 실제 세계는 사물(객체)로 이루어져 있으며, 발생하는 모든 사건들은 사물(객체)간의 상호작용이다.
		 	
		 	이 개념을 토대로 프로그래밍 언어 접목 -> "객체지향 프로그래밍"
		 	
		 	- 특징(장점)
		 		1. 코드의 재사용성 높다.
		 		2. 코드를 관리하기 좋다.
		 		3. 프로그램의 신뢰성이 높아진다.
		 		
		 	- '클래스'와 '객체'
		 	
		 		1. 클래스는 일종의 설계도(또는 틀)이며, 객체는 그 설계도를 통해 만들어진 실제 사물을 뜻한다.
		 			ex) 아이폰11 설계도 -> 아이폰11(Serial Number : 1)
		 					   	    -> 아이폰11(Serial Number : 2)
		 					   
		 		2. 클래스 
		 			- 정의 : 객체(사물)를 정의해 놓은것(= 어떠한 객체를 만들 것인지)
		 			- 용도 : 객체를 생성.
		 		
		 		3. 객체 
		 			- 정의 : 실제로 존재하는 것.
		 			- 용도 : 클래스에서 정의된 대로 사용한다.
		 		
		 		※ 객체/인스턴스의 차이
		 			인스턴스 : 사례, 경우, 실체
		 				- 기본적으로는 객체와 같은 의미
		 				- 문장의 쓰임에 따라 구분한다.
		 					* 클래스(= 설계도)를 통해 실제로 만들어진 객체를 '인스턴스'라고 한다.
		 					ex) 아이폰 11은 객체이고, 아이폰 11의 설계도(= 클래스)로 객체를 만들 수 있다.
		 						내가 가지고 있는 아이폰11은 인스턴스이다.
		 						
		 			객체의 구성 요소 : 속성과 기능
		 				속성 : 아이폰의 색상,크기,버튼의 유무...
		 				기능 : 사진을 찍다,전화를 건다,문자를 보낸다...
		 				
		 				1. 객체는 클래스에서 정의한 다수의 속성과 기능을 가질 수 있다.
		 				2. 속성 = 변수(멤버변수)
		 				3. 기능 = 함수(메서드)
		 				
		 인스턴스의 생성과 사용
		 
		 클래스명 변수명;	-> 클래스의 객체를 참조하기 위해서 참조변수를 선언.
		 변수명 = new 클래스명();	-> 클래스의 객체를 생성 후, 객체의 주소를 참조변수에 저장.	
		*/
		
		Tv t ;	// Tv클래스 타입의 참조변수를 t를 선언.
		t = new Tv();	// Tv 인스턴스를 생성한 후, 생성된 Tv 인스턴스의 주소를 t에 저장.
		
		t.channel = 7;
		
		// 인스턴스는 참조변수를 통해서만 받을 수 있으며, 참조변수의 타입은 인스턴스의 타입과 일치해야 한다.
		System.out.println("현재 t의 채널은 : " + t.channel + "\n");	
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1의 채널은 " + t1.channel + "입니다.");
		System.out.println("t2의 채널은 " + t2.channel + "입니다." + "\n");
		
		t1.channel = 10;
		
		System.out.println("t1의 채널은 " + t1.channel + "입니다.");
		System.out.println("t2의 채널은 " + t2.channel + "입니다." + "\n");
		
		t2 = t1;
		
		System.out.println("t1의 채널은 " + t1.channel + "입니다.");
		System.out.println("t2의 채널은 " + t2.channel + "입니다." + "\n");
		
		// 객체 배열 
		Tv[] tvArr = new Tv[3];
		
//		tvArr[0] = new TV();
//		tvArr[1] = new TV();
//		tvArr[2] = new TV();
		
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i + 10;
			
			System.out.print(tvArr[i].channel + " ");
		}
	}
}