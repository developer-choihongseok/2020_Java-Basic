package OOP2;

class Product1{
	
	int price;		// 제품 가격
	int bonusPoint;	// 제품 구매 시 제공하는 보너스 점수
	
	Product1(int price) {
		super();
		this.price = price;
		bonusPoint = (int)(price / 10.0);	// 보너스 점수는 제품 가격의 10%
	}
}

class TV3 extends Product1{

	TV3() {
		super(100);
	}
	
	@Override
	public String toString() {
		return "TV";
	}
}

class Computer extends Product1{

	Computer() {
		super(200);
	}
	
	@Override
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product1{

	Audio() {
		super(50);
	}
	
	@Override
	public String toString() {
		return "Audio";
	}
}

class Buyer{
	
	int money = 1000;	// 소유 금액
	int bonusPoint = 0;	// 보너스 점수
	
	Product1[] item = new Product1[10];	// 구입한 제품을 저장하기 위한 배열
	int i = 0;	// Product1 배열에서 사용될 카운터
	
	void buy(Product1 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;	// 프로그램 종료 = System.exit(0);
		}
		
		money -= p.price;			// 가진 돈에서 구입한 제품의 가격 뺀다.
		bonusPoint += p.bonusPoint;	// 제품의 보너스 점수를 추가
		
		item[i++] = p;	// 제품을 Product1[] item에 저장한다. item[0] ~ item[9] = new TV3();
		
		System.out.println(p + "을(를) 구입하셨습니다.");
	}
	
	// 구매한 물품에 대한 정보 요약 메서드
	void summary() {
		int sum = 0;			// 물품의 가격 합
		String itemList = "";	// 구입한 물품 목록
		
		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		for(int i = 0; i < item.length; i++) {
			if(item[i] == null) {
				break;
			}
			sum += item[i].price;
			itemList += item[i] + " ";
		}
		System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}

public class PolyArgumentTest {
	public static void main(String[] args) {
		
//		TV3 tv = new TV3();
//		
//		System.out.println(tv.price);
//		System.out.println(tv.bonusPoint);
//		
//		System.out.println(tv);
//		System.out.println(new Computer());
//		
//		Buyer b = new Buyer();
//		
//		b.buy(new TV3());
//		b.buy(new Computer());
//		
//		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
//		System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점입니다.");
		
		Buyer b = new Buyer();
		
		b.buy(new TV3());	// TV3 t = new TV3(); b.buy(t);를 합친 것.
		b.buy(new Computer());
		b.buy(new Audio());
		System.out.println();
		
		b.summary();
	}
}
