package API;
/*
String(문자형) -> 기본자료형

 1) 래퍼 클래스 객체 생성(생성자의 매개변수에 문자열 또는 정수 전달) 후 언박싱/오토언박싱
 	ex. Integer wi = new Integer(10);
 		int i = wi.intValue();
 		int i = wi;
 		
 2) 래퍼 클래스의 static 메소드로 변환
 	ex. int i = Integer.parseInt("10");
 	
 기본 자료형 -> String(문자형)
 
 1) 기본 자료형 박싱(래퍼 클래스 객체 생성) 후 래퍼 클래스의 toString() 메서드 이용 변환
 	ex. Integer wi = new Integer(10);
 		String str = wi.toString();	// Object클래스의 toString()
 2) 래퍼 클래스의 정적 메서드인 toString(기본 자료형) 이용 변환
 	ex. String str = Integer.toString(10);
 3) String 클래스의 정적메서드인 valueOf(기본 자료형) 이용 변환
   ex. String str = String.valueOf(10);
 4) 기본 자료형 "" 더하기 연산
 	ex. String str = 10 + "";
*/
public class Wrapper_String_Change2 {
	public static void main(String[] args) {
		
		int i = 10;
//		Integer wi = new Integer(i);	// 박싱 int -> Integer
		Integer wi = i;					// 오토박싱 int -> Integer
		
		String str1 = wi.toString();		// 10을 문자형 형태로 반환해준다. 즉, Integer -> String
		String str2 = Integer.toString(i);	// int -> String
		String str3 = String.valueOf(i);	// int -> String
		String str4 = i + "";				// int -> String (즉, 숫자 + 문자 = 문자)
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str1 + str2 + str3 + str4 + "\n");
		
		// compareTo() 메서드
		// 두 개의 Integer 객체를 비교해서 크거나 작거나 같거나에 대한 결과 반환
		// (크면)1, (작으면)-1, (같으면)0
		Integer wi1 = 10;
		Integer wi2 = 10;
		
		System.out.println(wi1.compareTo(wi2));
		
		String sss = Integer.toBinaryString(10);	// 2진수
		String ssss = Integer.toHexString(10);		// 16진수
		
		System.out.println("sss= " + sss + " ssss= " + ssss);
		
		System.out.println("int형 최대치: " + Integer.MAX_VALUE);
		System.out.println("int형 최소치: " +Integer.MIN_VALUE);
	}
}