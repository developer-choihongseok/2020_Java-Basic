import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		/*
		 자바에서 키 입력
		 
		 System.in
		 	- 키보드로부터 직접 읽는 자바의 표준 입력 스트림
		 	- 키 값을 byte(문자 아님)로 리턴
		 	
		 	바이트 단위의 데이터를 변환 필요
		 	Scanner 클래스
		 		- System.in에게 키를 읽게 하고, 읽은 내용을 정수,실수,문자열 등으로 변환하여 반환
		 		  import java.util.Scanner; 를 선언해주고 사용해야 한다.
		 	
		 	next() - 문자열로 반환(띄워쓰기 포함)
		 	nextLine() - 문자열을 반환(\n을 포함하는 한 라인을 읽고, \n 버린 문자열 반환)
		 	nextShort() - short 타입으로 반환
		 	nextInt() - int 타입으로 반환
		 	nextFloat() - float 타입으로 반환
		*/
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		System.out.println("이름은 " + name);
		
		String city = sc.next();
		System.out.println("도시는 " + city);
		
		int age = sc.nextInt();
		System.out.println("나이는 " + age);
		
		sc.close();
	}
	
}
