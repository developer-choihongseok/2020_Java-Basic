package OOP1;
/*
메서드 오버로딩
	- 하나의 클래스에 같은 이름의 메서드를 여러 개 정의하는 것

오버로딩 조건
	- 메서드 이름이 같아야 한다.
	- 매개변수의 개수 또는 타입이 달라야 한다.
	- 매개변수는 같고 리턴타입이 다른 경우는 오버로딩 X

주의!!
	- 매개변수 이름이 다른 것은 오버로딩 X
	- 리턴 타입 오버로딩 성립 조건 X
	ex) long add(int a, int b)
		int add(int a, int b)
		
		// 이거 같은 경우는 성립O
		long add(long a, int b)
		long add(int a, long b)
*/
class MyMath3{
	
	int add(int a, int b) {
		System.out.println("int add(int a, int b)");
		return a + b;
	}
	
	long add(int a, long b) {
		System.out.println("long add(int a, long b)");
		return a + b;
	}
	
	long add(long a, int b) {
		System.out.println("long add(long a, int b)");
		return a + b;
	}
	
	long add(long a, long b) {
		System.out.println("long add(long a, long b)");
		return a + b;
	}
	
	int add(int[] a) {
		System.out.println("int add(int[] a)");
		
		int result = 0;
		
		for(int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}
}

public class OverloadingTest {
	public static void main(String[] args) {
		
		MyMath3 mm = new MyMath3();
		
		System.out.println("mm.add(3,3) 결과 : " + mm.add(3,3));
		System.out.println("mm.add(3,3L) 결과 : " + mm.add(3, 3L));
		System.out.println("mm.add(3L,3) 결과 : " + mm.add(3L, 3));
		System.out.println("mm.add(3L,3L) 결과 : " + mm.add(3L, 3L));
		
		int[] a = {100,200,300};
		
		System.out.println("mm.add(a) 결과 : " + mm.add(a));
	}
}	
