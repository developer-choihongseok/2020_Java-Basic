package ExceptionPackage;
/*
 예외를 고의로 발생
  	- throw 발생
  		1. 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체 생성
  		2. 키워드 throw로 예외 발생
*/
public class ExceptionEx4 {
	public static void main(String[] args) {
		
		try {
//			Exception e = new Exception("고의로 발생시켰음");
//			throw e;
			throw new Exception("고의로 발생시켰음");
			
		} catch (Exception e) {
			System.out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 종료");
	}
}