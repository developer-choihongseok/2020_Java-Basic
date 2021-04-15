package ExceptionPackage;

class AgeException extends Exception{
	
	public AgeException(String message) {
		super(message);
	}
}

public class NewExceptionTest {
	public static void main(String[] args) {
		
		try {
			System.out.println("외부 try...");
			
			try {
				System.out.println("내부 try...");
				throw new Exception();	
			} catch (Exception e) {
				System.out.println("내부 try-catch Exception : " + e);
				System.out.println("에외 던지기 발생");
				throw e;
			} finally {
				System.out.println("finally 구문 출력");
			}
			
		} catch (Exception e) {
			System.out.println("외부 try-catch문 Exception : " + e);
		}
		System.out.println("종료");
		
		int age = -19;
		
		try {
			ticketing(age);
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	static void ticketing(int age) throws Exception {
		if(age < 0) {
			throw new Exception("나이 입력이 잘못 되었습니다.");
		}
	}
}