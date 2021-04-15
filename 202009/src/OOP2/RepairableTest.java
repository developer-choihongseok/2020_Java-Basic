package OOP2;

// 수리가 되는 애들만 묶어서 사용할려고 인터페이스 생성.
// 관계를 부여하는 용도!!
interface Repairable{
	
}

class Unit{
	
	int hitPoint;
	final int MAX_HP;
	
	Unit(int hp){
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit{

	GroundUnit(int hp) {
		super(hp);
	}
}

class Marine extends GroundUnit{

	Marine() {
		super(40);
	}
	
	public String toString() {
		return "Marine";
	}
}

// 수리할 수  있는 것만 implements Repairable을 붙임.
class Tank extends GroundUnit implements Repairable{

	Tank() {
		super(150);
	}
	
	public String toString() {
		return "Tank";
	}
}

// 일 꾼
class SCV extends GroundUnit implements Repairable{

	SCV() {
		super(60);
	}
	
	public String toString() {
		return "SCV";
	}
	
	// 매개변수로 넘겨받은 유닛을 수리
	void repair(Repairable r) {
		// 참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위해, "instanceof" 연산자를 사용.
		if(r instanceof Unit) {
			Unit u = (Unit) r;
			
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다.");
		}
	}
}

class AirUnit extends Unit{

	AirUnit(int hp) {
		super(hp);
	}
}

class Dropship extends AirUnit implements Repairable{

	Dropship() {
		super(125);
	}
	
	public String toString() {
		return "Dropship";
	}
}

public class RepairableTest {
	public static void main(String[] args) {
		
		Marine m = new Marine();
		Tank t = new Tank();
		Dropship d = new Dropship();
		
		SCV scv = new SCV();
//		scv.repair(m);
		scv.repair(t);
		scv.repair(d);
	}
}
