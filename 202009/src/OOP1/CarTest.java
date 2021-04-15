package OOP1;

class Car{
	
	String color;	
	String gearType;	// 변속기 종류
	int door;
	
	Car(){
		
	}
	
	Car(String c, String g, int d){
		color = c;
		gearType = g;
		door = d;
	}
	
}

public class CarTest {
	public static void main(String[] args) {
		
		Car c1 = new Car();
		
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car();
		
		c2.color = "black";
		c2.gearType = "manual";
		c2.door = 4;
		
		Car c3 = new Car("red", "auto", 2);
		
		System.out.printf("c1의 color = %s, gearType = %s, door = %d\n", c1.color, c1.gearType, c1.door);
		System.out.printf("c2의 color = %s, gearType = %s, door = %d\n", c2.color, c2.gearType, c2.door);
		System.out.printf("c3의 color = %s, gearType = %s, door = %d\n", c3.color, c3.gearType, c3.door);
	}
}
