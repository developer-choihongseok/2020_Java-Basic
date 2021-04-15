class Car{
	
	final String agency;
	
	String manufacturer;
	String color;
	String price;
	String name;
	
	Car(){
		agency = "동대구 영업소";
		manufacturer = "기아";
		color = "블랙";
		price = "사천만원";
		name = "K7";	
	}
	
	Car(String agency, String manufacturer, String color, String price, String name){
		this.agency = agency;
		this.manufacturer = manufacturer;
		this.color = color;
		this.price = price;
		this.name = name;
	}
	
	void show() {
		System.out.println(agency + "," + manufacturer + ","  + color + "," + price + "," + name);
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class MakeCar {
	public static void main(String[] args) {
		
		Car c1 = new Car();
		
		System.out.println(c1.manufacturer);
		System.out.println(c1.color);
		System.out.println(c1.name);
		System.out.println(c1.price);
		System.out.println(c1.agency);
		System.out.println();
		
		Car c3 = new Car("동대구 영업소","기아","블랙","K7","사천만원");
		
		c1.show();
		c3.show();
	}
}