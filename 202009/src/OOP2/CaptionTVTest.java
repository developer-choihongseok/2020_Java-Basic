package OOP2;
/*
  상속
  	- 기존의 클래스를 재사용해서 새로운 클래스 작성
  	- 두 클래스를 부모와 자식으로 관계를 맺어주는 것(중요!!)
  	- 자식 클래스는 부모 클래스의 모든 멤버를 상속(단,생성자와 초기화 블럭 X)
  	- 자식의 멤버 개수는 부모보다 적을 수 없다.
  	
  	class 자식 클래스 extends 부모 클래스{
  		
  	}
*/
class p{
	
	int x;
	int y;
}

//class p3d{
//	
//	int x;
//	int y;
//	int z;
//}

class p_3d extends p{
	int z;
}

class TV2{
	
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
}

class CaptionTv extends TV2{
	
	boolean caption;
	
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}

/*
 자바의 상속 특징
   - 단일 상속만 허용
   - 다중 상속 사용시, 여러 복합적인 기능을 가진 클래스로 구현이 가능하지만
   - 서로 다른 클래스로부터 상속 받은 멤버간의 이름이 같은 경우 구별 불가.
   - 대신 클래스 간의 관계가 보다 명확, 코드를 더욱 신뢰 가능
   - 비중이 높은 클래스 하나만 상속 관계로, 나머지는 포함 관게.
*/

/*
 Object class <- '다형성'에서 중요!!
 	- 모든 클래스의 최고 부모
 	- 부모가 없는 클래스는 자동적으로 Object 클래스 상속
 	- 상속 계층에서 최상위에 위치
 	- 모든 클래스 Object 클래스에 정의된 11개의 메서드를 상속
*/

public class CaptionTVTest {
	public static void main(String[] args) {
		
		CaptionTv ctv = new CaptionTv();
		
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		
//		ctv.displayCaption("Hello world");	// 실행 X (이유: caption = false로 되어있기 때문)
		
		ctv.caption = true;
		ctv.displayCaption("Hello world");
	}
}
