/*
	 2020-09-10
	  자바 수업 2일차
	  출력문, 변수
*/
public class first {
	public static void main(String[] args) {
		/* 여러줄 주석
			주석 
		  		- 소스코드 설명을 추가하는 것.
		  		- 프로그램 수행에 영향이 없다.
		  		- 한 줄 주석: // 뒤부터 주석
		*/
		
		// 자바의 출력문
		System.out.println("Hello World!!");	// 자동 줄바꿈
		System.out.print("Hello World!!\n");	// 세미콜론(;) : 문장의 끝을 알리는 기호
		System.out.printf("Hello World!!\n");	// 서식을 이용한 출력
		
		System.out.printf("Hello %s\n", "홍석");
		System.out.printf("\"나이는 %d\"\n", 26);
		System.out.println();
		
		/*
		  서식문자 
		 %d : 10진수, %o : 8진수, %x : 16진수
		 %c : 문자, %s : 문자열
		 %b : boolean형
		 %f : 실수형
		 
		 이스케이프 문자
		 \n : 개행(엔터키)
		 \t : 수평탭
		 \r : 줄의 처음 커서 이동
		 \\ : 역슬래쉬 출력
		 \" : 큰 따옴표 출력
		 \' : 작은 따옴표 출력
		*/
		
		/*
		 변수	- 변하는 수(프로그램이 진행되는 동안 변경가능한 공간)
		   	- 프로그램 처리 과정에서 데이터를 담아둘 수 있는 메모리의 공간
		   	
		 변수의 선언
		 	int a;	-> int - 데이터 타입(= 종류), a - 변수명 
		 		
		 초기화
		 	int a = 1;
		 	
	 	 초기값 - 변수를 선언한 후 최초의 값
		*/
		
		int a = 1;
		System.out.println(a);
		System.out.println();
		
//		int b;
//		System.out.println(b);	// 초기화 하지 않을 시에 에러, 쓰레기 값 존재.
		
		/*
		 변수 생성 규칙(식별자 생성 규칙자)
		 - 변수의 이름은 영어 대소문자, 숫자, 특수문자($,_)만 가능	-> ex) int name2;(O) int 2name;(X) 
		 												   int $temp;(O) int #temp;(X)		
		 - 영어 대소문자 구별	-> ex) int apple; 
		 					   Apple = a;(X)
		 - 변수 시작은 숫자 X
		 - 예약어, 키워드 사용 X	-> ex) throws, class, try...
		 - 의미 있는 명명
		*/
		
		/*
		 데이터 타입(자료형)
		 
		 정수형 - 정수(= 소수점이 아닌 자연수)를 저장할 때 사용하는 데이터 타입
		 byte : 1byte
         short : 2byte
         int : 4byte
         long : 8byte
         
		 실수형 - 실수(= 소수점)를 저장
		  소수점 자리에 따라 정밀도 차이가 있음!!
		 float : 4byte	- float는 소수점 이하 6자리
		 double : 8byte	- double은 소수점 이하 15자리
		
		 문자형 - 문자를 담을 수 있는 타입('')
		 char : 2byte(유니코드 사용)
		 
		 논리형 - True(참)/False(거짓)
		     - 0은 거짓, 그 외에는 참
	
		 문자열형
		 String : 문자가 나열된 형태
		 ex) String a = "Hello";	-> 원래는 String a = new String("Hello");
		*/
		
		// 정수형 예제
		int number = 10;	// 정수형 int인 number 선언.
		
		System.out.println("number: " + number);
		System.out.printf("number: %d\n", number);
		System.out.println();
		
		number = 20;
		System.out.println("number: " + number);
		System.out.println("number + number: " + number + number);
		System.out.println("number: " + (number + number));
		System.out.printf("number: %d\n ", number+number);
		System.out.println();
		
		/*
		 byte 범위 : -127 ~ 128
		 1byte -> 8bit(-2의 7승 ~ 2의 7승 -1)
		 2byte -> 16bit(-2의 15승 ~ 2의 15승 -1)
		 
		  형변환 - 변수나 상수의 데이터 타입을 다른 타입으로 변환
		  자동 형변환(묵시적 형변환) : 크기에 맞춰서 알맞은 타입으로 형변환
		  명시적 형변환(casting, 강제 형변환) : 프로그래머가 변수의 자료를 강제로 변환
		*/
		
		byte number1 = 127;
		byte number2 = (byte)128;
		
		System.out.println("number1 = " + number1);
		System.out.println("number2 = " + number2);
		System.out.println();
		
		// 실수형 예제
		float f = 0.123456789f;	// 명시적 표현
		System.out.println("f = " + f);
		System.out.printf("%.2f\n", f);
		System.out.println();
		
		double d = 0.12345678901234567;
		System.out.println("d = " + d);
		System.out.println();
		
		// 문자형 예제
		char ch = 'a';
		System.out.println("ch: " + ch);
		System.out.printf("ch: %c\n", ch);
		System.out.println();
		
		ch = 97 + 1;	// 아스키코드
		System.out.println("ch + 1 : " + (ch+1));
		System.out.printf("ch: %c\n", ch+1);
		System.out.println();
		
		ch = '\u0061';	// 유니코드
		System.out.println("ch: " + ch);
		System.out.printf("ch: %c\n", ch);
		System.out.println();
		
		/*
		 상수 - 프로그램 실행 중 변경할 수 없는 고정된 값
		    - final 데이터타입 상수명 = 값;
		*/
		
		int t = 3;
		t = 4;
		System.out.println(t);
		
		final double PI = 3.14;
//		PI = 3.15;
		
	}
}
