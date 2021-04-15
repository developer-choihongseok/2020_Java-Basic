package OOP2;
/*
 포함 관계(상속 X)
 	- 클래스 간의 관계를 맺어주는 방법
 	- 클래스 정의 시, 멤버 변수에 다른 클래스 타입의 참조변수 선언
*/
class Shape{
	String color = "black";
	
	void draw() {
		System.out.printf("[color=%s]\n",color);
	}
}

class Point{
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	Point() {
		this(0,0);	// this() : 같은 클래스의 다른 생성자를 호출할 때 사용.
	}
	
	String getXY() {
		return "(" + x + "," + y + ")";
	}
}

class Circle extends Shape{
	
	Point center;	// 참조변수
//	Point center = new Point(0,0);
	int r;
	
	Circle(Point center, int r) {
		this.center = center;	// Point center = new Point(150,150);
		this.r = r;
	}
	
	Circle() {
		this(new Point(0,0),100);
	}
	
	void draw() {
		System.out.printf("[center=(%d,%d), r = %d, color = %s]\n", center.x, center.y, r, color);
	}
}

public class DrawShape {
	public static void main(String[] args) {
		
		Circle c = new Circle(new Point(150,150),50);
		c.draw();
	}
}
