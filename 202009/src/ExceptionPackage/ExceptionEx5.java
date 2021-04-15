package ExceptionPackage;

public class ExceptionEx5 {
	
	static void method1() throws Exception {
		method2();
	}
	
	static void method2() throws Exception {
		method3();
	}
	
	static void method3() throws Exception{
		throw new Exception("고의로 발생");
	}
	
	public static void main(String[] args) {
		
		try {
			method1();
		} catch (Exception e) {
			System.out.println("예외 발생");
			e.printStackTrace();
		} finally {
			System.out.println("무조건 실행");
		}
	}
}