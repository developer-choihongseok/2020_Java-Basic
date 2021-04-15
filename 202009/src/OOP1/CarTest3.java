package OOP1;
/*
 생성자에 다른 생성자 호출하기
 
 	- this() - 생성자 호출 	c.f) this - 참조변수, 인스턴스 자신을 가리킨다.
 	- 생성자의 이름으로 클래스 이름 대신 this를 사용한다.
 	- 한 생성자에 다른 생성자를 호출할 때 첫번째 줄에서만 가능!!
 		-> 초기화 작업 도중 다른 생성자를 호출 시, 호출된 다른 생성자 내에서도 멤버변수들의 값이 초기활 될 수 있음.
*/
class Car1{
	
	String color;
	String geartype;
	int door;
	
	Car1(){
//		this.color = "test";	// 에러!! 이유: color를 test로 초기화하고, 밑에서 또 color를 Black으로 초기화하므로 중복이 일어날 수 있기 때문!!
		this("Black", "manual", 4);
	}
	
	Car1(String color, String geartype, int door){
		this.color = color;
		this.geartype = geartype;
		this.door = door;
	}
	
	Car1(Car1 c){
		this.color = c.color;
		this.geartype = c.geartype;
		this.door = c.door;
	}
}

public class CarTest3 {
	public static void main(String[] args) {
		
		Car1 c1 = new Car1("white", "auto", 4);
		Car1 c2 = new Car1();
		System.out.printf("c1의 color = %s, gearType = %s, door = %d\n", c1.color, c1.geartype, c1.door);
		System.out.printf("c2의 color = %s, gearType = %s, door = %d\n", c2.color, c2.geartype, c2.door);
		
		Car1 c3 = new Car1(c2);
		System.out.printf("c3의 color = %s, gearType = %s, door = %d\n", c3.color, c3.geartype, c3.door);
	}
}
