//import java.util.Scanner;

public class Operator {
	public static void main(String[] args) {
		/*
		 연산 - 주어진 식을 계산하여 결과를 얻어내는 과정
		 
		 연산자 - 특정한 연산을 수행하기 위한 기호
		     - 연산을 하는 연산자와 연산을 당하는 피연산자로 구성
		     
		 산술 연산자 - +, -, *, / , %  
		*/
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));
		System.out.println();
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("초 입력: ");
//		int time = sc.nextInt();
//		
//		int hour = (time / 60) / 60;
//		int minute = (time / 60) % 60;
//		int second = time % 60;
//		
//		System.out.println(time + "초는");
//		System.out.println(hour + "시간");
//		System.out.println(minute + "분은");
//		System.out.println(second + "초입니다.");
//		
//		sc.close();
		
		/*
		 단항 연산자 - 항이 하나인 연산자
		 
		 - : 부호 연산자(변수의 부호 변경)
		 ! : 부정 연산자(True -> False , False -> True)
		 ++ : 증가 연산자(변수에 1증가, i++ or ++i)
		 -- : 감소 연산자(변수에 1감소, i-- or --i)
		 
		 증감 연산자
		 	- 전위 : 명령문 실행 전 연산
		 	- 후위 : 명령문 실행 후 연산
		*/
		int a = -1;
		System.out.println("a = " + a);
		System.out.println("-a = " + (-a));
		System.out.println();
		
		boolean b = true;
		System.out.println("b = " + b);
		System.out.println("b = " + !b);
		System.out.println();
		
		int c = 10;
		System.out.println("현재 c의 값 : " + c);
		System.out.println("현재 c의 값 : " + (++c));
		System.out.println("현재 c의 값 : " + (c++));
		System.out.println("현재 c의 값 : " + (c));
		System.out.println();
		
		int d = ++c;
		System.out.println("c = " + c);
		System.out.println();
		
		d = c++;
		System.out.println("d = " + d);
		System.out.println("c = " + c);
		System.out.println();
		
		// Example
		int aa, bb, cc, dd;
		
		aa = 1;
		bb = ++aa;
		cc = aa++;
		dd = bb++ + ++cc;
		
		System.out.println("aa = " + aa);
		System.out.println("bb = " + bb);
		System.out.println("cc = " + cc);
		System.out.println("dd = " + dd);
		System.out.println();
		
		/*
		 대입 연산자(=) - 왼쪽의 피연산자에 오른쪽의 값을 대입
		 
		 복합 대입 연산자 
		 	ex) a += b; -> a = a + b;
		 		a *= b; -> a = a * b;
		 
		 비교 연산자 - 양변을 비교하여 같으면 True, 다르면 False 반환
		 	== : 같다
		 	> : 크다
		 	< : 작다
		 	>= : 크거나 같다
		 	<= : 작거나 같다
		 	!= : 같지 않다
		*/
		
		// 비교연산자 Example
		System.out.println('a' > 'b');
		System.out.println(3 >= 2);
		System.out.println(3 == 2);
		System.out.println(3 != 2);
		System.out.println(!(3 != 2));
		System.out.println();
		
		// 문자열 비교 Example -> 비교연산자 == 를 이용해서 비교하면 안된다. equals()를 사용!!
		String str = "Hello Java";
		
		System.out.println(str.equals("Hello Java"));
		System.out.println(str.equals("Hello JAVA"));
		System.out.println();
		
		/*
		 논리 연산자 - 여러가지 조건을 동시에 검사하는 경우 사용
		 		- 비교하는 두 값이 boolean 형태이어야 함.
		 		
		 	&&(AND) : 둘 다 True일때, True를 반환
		 	||(OR) : 둘 중 하나만 True여도 True를 반환
		 	NOT(!) : True -> False , False -> True
		*/
		
		int aaa = 10;
		// Example) 5 < x < 15
		System.out.println((5 < aaa) && (aaa < 15));
		System.out.println((5 < aaa) && (aaa < 15) || (a % 2 != 0));
		System.out.println();
		
		/*
 		 비트 연산자
 		 	
 		 	비트 AND(&) : 비트 단위의 AND 연산
 		 	비트 OR(|) : 비트 단위의 OR 연산
 		 	비트 XOR(^) : 비트 단위의 XOR 연산 -> 같으면 0, 다르면 1로 표현
 		 	비트 NOT(~) : 부호 반전
 		 	
 		 시프트 연산자 -> 장점: 속도가 빨라진다.
 		 	
 		 	>> : 오른쪽으로 비트 이동(비트 하나 이동 / 2)
 		 	<< : 왼쪽으로 비트 이동(비트 하나 이동 * 2)
		*/
		
		/*
		 삼항 연산자 - 항이 3개인 연산자
		 		- 조건식의 결과에 따라 결과를 반환
		 		- 조건 ? 항목 1(참) : 항목2(거짓)
		*/
		
		// 삼항 연산자 Example
		int age = 17;
		
		System.out.println(age > 19 ? "성인입니다." : "청소년입니다.");
		
	}
}
