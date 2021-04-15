package OOP2;
/*
 오버라이딩(Overriding)
   - 부모 클래스로부터 상속 받은 메서드의 내용을, 상속 받는 클래스에 맞게 변형하는 것
   
      차이점) 오버로딩
   			- 기존에 없는 새로운 메서드를 정의
   			
   		  오버라이딩(= 재정의)
   			- 상속 받은 메서드의 내용을 변경
   			
   	조건 
   		- 선언부가 같아야 한다.	ex) 이름, 매개변수, 리턴타입...
   		- 접근제어자를 좁은 범위로 변경할 수 있다.
   		- 부모클래스의 메소드보다 많은 수의 예외 선언 X
   	
   	class Parent{
   		void parentMethod(){
   		
   		}
   	}
   	
   	class Child extends Parent{
   		void parentMethod(){		// 오버라이딩
   		
   		}
   		
   		void parentMethod(int x){	// 오버로딩
   		
   		}
   		
   		void childMethod(){
   		
   		}
   		
   		void childMethod(int i){	// 오버로딩
   		
   		}
   		
   		void childMethod(){			// 오류!! 이유 : 중복
   		
   		}
   	}
*/
class Point_XY{
	int x;
	int y;
	
	String getLocation() {
		return "x : " + x + " y : " + y;
	}
}

class Point_XY_3D extends Point_XY{
	int z;
	
	String getLocation() {
		return "x : " + x + " y : " + y + " z : " + z;
	}
}

public class Override_Test {
	public static void main(String[] args) {
		
		Point_XY pp = new Point_XY();
		System.out.println(pp.getLocation());
		
		Point_XY_3D ppp = new Point_XY_3D();
		System.out.println(ppp.getLocation());
	}
}
