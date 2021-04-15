package OOP2;

class Animal{
	
	void breath() {
		System.out.println("숨쉬기");
	}
}

class Lion extends Animal{

	@Override
	public String toString() {
//		return super.toString();	// "주소값을 돌려줘라"라는 뜻!!
		return "사자";
	}
}

class Rabbit extends Animal{
	
	@Override
	public String toString() {
		return "토끼";
	}
}

class Monkey extends Animal{

	@Override
	public String toString() {
		return "원숭이";
	}
}

class ZooKeeper{	// 사육사
	
//	void feed(Lion lion) {		// 사자에게 먹이주는 클래스
//		System.out.println(lion + "에게 고기주기");
//	}
//	
//	void feed(Rabbit rabbit) {	// 토끼에게 먹이주는 클래스
//		System.out.println(rabbit + "에게 고기주기");
//	}
//	
//	void feed(Monkey monkey) {	// 원숭이에게 먹이주는 클래스
//		System.out.println(monkey + "에게 고기주기");
//	}
	
	void feed(Animal animal) {
		System.out.println(animal + "에게 먹이주기");
	}
}

public class PolyMorphism2 {
	public static void main(String[] args) {
		
		Lion lion = new Lion();
		System.out.println(lion);
		System.out.println();
		
		ZooKeeper james = new ZooKeeper();
//		james.feed(lion);
//		james.feed(new Rabbit());
//		james.feed(new Monkey());
		
		Animal lion2 = new Lion();
		james.feed(lion2);
		james.feed(new Rabbit());
		james.feed(new Monkey());
	}
}
