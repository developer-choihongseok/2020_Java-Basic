package OOP1;
/*
메서드 
	- 특정 작업을 수행하는 일련의 문장들을 하나로 묶은 것
	
       장점) 
	1. 높은 재사용성
		- 한 번 만들면 몇 번이고 호출 가능.
		- 다른 프로그램에서도 사용 가능.
	2. 중복된 코드 제거
		- 같은 내용의 반복되는 문장을 묶어서 하나의 메서드로 작성
	3. 프로그램의 구조화
		- 프로그램의 기능별로 단위를 나눌 수 있다.
		
 메서드 선언과 생성

 반환타입 메서드이름(타입 변수명, 타입 변수명, ..... 매개변수){	// 선언부
	return 0;	// 구현부(메서드 호출 시 수행할 코드) <- 반환값
}

메서드 이름
	- 변수의 명명규칙과 동일
	- 의미있는 이름

반환 타입
	- 메서드의 작업 수행 결과물을 반환하는 형태(ex : 정수형 int)
	- 반환값이 없는 경우 void 쓰기
	
매개변수
	- 메서드를 호출하면서 넘겨주는 인자
	- 메서드 내에서만 사용 가능(= 지역변수)
	
반환값
	- 필요 없으면 생략 가능(컴파일러 자동 추가)
	- 메서드의 실행 결과를 호출한 메서드로 반환시 사용
	- 반환타입과 일치 또는 자동 형변환 가능한 것
	- 메서드 당 하나만 가능
	
메서드의 호출
	- 메서드는 정의만으로는 사용 X
	- 호출 시에는 메서드에 정의된 매개변수의 수와 인자의 갯수가 일치해야 함
*/
class MyMath{
	
	int add(int a, int b) {
		int result = a + b;
		return result;
	}
	
	int sub(int a, int b) {
		return a - b;
	}
	
	int mul(int a, int b) {
		return a * b;
	}
	
	double div(double a, double b) {
		return a / b;
	}
}

public class methodEx {
	
	static void printArr(int[] numArr) {
		
		for(int i = 0; i < numArr.length; i++) {
			System.out.printf("%d", numArr[i]);
		}
	}
	
	public static void main(String[] args) {
		// example
		int[] numArr = new int[10];
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = (int)(Math.random() * 10);
			
			printArr(numArr);
			System.out.println();
		}
		System.out.println();
		
		// 계산기 프로그램_example
		MyMath mm = new MyMath();
		
		int result = mm.add(5, 3);
		
		System.out.println("mm.add(5,3) : " + result);
		System.out.println("mm.sub(5,3) : " + mm.sub(5,3));
		System.out.println("mm.mul(5,3) : " + mm.mul(5,3));
		System.out.println("mm.div(5.0,3.0) : " + mm.div(5.0,3.0));
	}
}
