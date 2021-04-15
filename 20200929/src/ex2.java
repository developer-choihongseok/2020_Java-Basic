class MyPoint{
	
	private int x;
	private int y;
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
	
	public boolean equals(MyPoint p) {
		MyPoint po = p;
		
		if(x == po.x && y == po.y) {
			return true;
		} else {
			return false;
		}
	}
}

class Circle{
	
	private int x, y, radius;
	
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Circle(" + x + "," + y + ")" + " 반지름 " + radius;
	}
	
	public boolean equals(Circle c) {
		Circle b = c;
		
		if(x == b.x && y == b.y) {
			return true;
		} else {
			return false;
		}
	}
}

public class ex2 {
	public static void main(String[] arg) {
		
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);
		System.out.println(p);	// = System.out.println(p.toString());
		
		if(p.equals(q)) {
			System.out.println("같은 점");
		} else {
			System.out.println("다른 점");
		}
		System.out.println();
		
		Circle a = new Circle(2,3,5);
		Circle b = new Circle(2,3,30);
		System.out.println("원 a : " + a.toString());
		System.out.println("원 b : " + b);
		
		if(a.equals(b)) {
			System.out.println("같은 원");
		} else {
			System.out.println("서로 다른 원");
		}
	}
}