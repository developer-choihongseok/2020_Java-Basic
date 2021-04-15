class Point{
	
	private int x, y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class ColorPoint extends Point{
	
	private String color;
	
	ColorPoint() {
		this(0, 0);
	}
	
	ColorPoint(int x, int y) {
		super(x, y);
		this.color = "BLACK";
	}

	void setXY(int x, int y) {
		move(x,y);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return color + "색의 " + "(" + getX() + "," + getY() + ")" + "의 점";
	}
}

class Point3D extends Point{
	
	private int z;
	
	Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	void moveUp() {
		z++;
	}
	
	void moveDown() {
		z--;
	}
	
	void move(int x, int y, int z) {
		move(x, y);
		this.z = z;
	}
	
	@Override
	public String toString() {
		return "(" + getX() + "," + getY() + "," + z + ")" + "의 점";
	}
}

public class ex1 {
	public static void main(String[] args) {
		
		ColorPoint zeroPoint = new ColorPoint();	// (0,0) 위치의 BLACK 색 점
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPoint cp = new ColorPoint(10,10);
		cp.setXY(5,5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다." + "\n");
		
		Point3D p = new Point3D(1,2,3);	// 1,2,3은 각각 x,y,z 축의 값.
		System.out.println(p.toString() + "입니다.");
		
		p.moveUp();	// z축으로 위로 이동
		System.out.println(p.toString() + "입니다.");
		
		p.moveDown();	// z축으로 아래로 이동
		p.move(10, 10);	// x,y축으로 이동
		System.out.println(p.toString() + "입니다.");
		
		p.move(100,200,300);	// x,y,z축으로 이동
		System.out.println(p.toString() + "입니다.");
	}
}