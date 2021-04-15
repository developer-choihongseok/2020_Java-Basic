package OOP1;
/*
 변수의 초기화
 	- 변수를 선언하고 처음으로 값을 저장
 	- 멤버변수(인스턴스, 클래스 변수)와 배열은 각 타입의 기본 값으로 자동 초기화
 	- 지역변수는 사용 전 반드시 초기화
 	
 	  boolean : false
 	  char : '\u0000'
 	  byte : 0
 	  short : 0
 	  int : 0 
 	  long : 0L
 	  float : 0.0f
 	  double : 0.0d 또는 0.0
 	    참조형 변수 : null
 	
 	멤버변수의 초기화
 		1. 명시적 초기화
 			Ex) int door = 4;
 		2. 생성자
 		3. 초기화 블럭
 			- 인스턴스 초기화 블럭 : {}
 				> 생성자에 공통적으로 수행되는 작업에 사용
 				인스턴스 생성될 때마다 수행(순서: 생성자보다 먼저)
 				
 			- 클래스 초기화 블럭 : static {}
 				> 클래스 변수의 복잡한 초기화 사용
 				클래스 로딩시에 실행
*/
public class BlockTest {
	
	static {
		System.out.println("static { }");
	}
	
	{
		System.out.println("{ }");
	}
	
	public BlockTest() {
		System.out.println("생성자");
	}
	
	public static void main(String[] args) {
		
		System.out.println("BlockTest bt = new BlockTest();");
		BlockTest bt = new BlockTest();
	}

}
