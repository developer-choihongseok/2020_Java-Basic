package OOP1;

public class jvm {
	
	public static void main(String[] args) {
		
		/*
		 JVM 메모리 구조
		 
		 	메서드 영역(Method Area)
		 		- 클래스 정보와 클래스 변수가 저장되는 곳
		 		
		 	호출 스택(Call Stack)
		 		- 메서드의 작업 공간
		 		- 메서드가 호출되면, 메서드 수행에 필요한 메모리 공간을 할당
		 		- 종료되면 사용하던 메모리 반환
		 	
		 	힙(Heap)
		 		- 인스턴스가 생성되는 공간
		 		- new 연산자에 의해 배열과 객체
		 		
		 	호출 스택의 특징
		 		- 메소드가 호출되면 수행에 필요한 메모리를 스택에 할당
		 		- 메소드가 수행을 마치면 사용했던 메모리 반환
		 		- 호출 스택의 제일 위에 있는 메서드가 현재 실행 중인 메서드
		 		- 아래에 있는 메서드가 방금 전 호출한 메서드
		*/
	}
}