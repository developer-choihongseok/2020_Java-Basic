
public class sawonMain {
	public static void main(String[] args) {
		
		Temporary temporary = new Temporary("박치기", 21, 20, 90000);
		temporary.print();
		
		Regular regular = new Regular("홍길동", 23, 1234000);
		regular.print();
		
		SalesMan salesman = new SalesMan("한송이", 25, 2345000, 3000, 0.25);
		salesman.print();
		
		Manager manager = new Manager("한국인", 27, 2555000);
		manager.print();
	}
}