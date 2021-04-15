package OOP1;

class DataReturn{
	
	int x;
}

public class ReferenceReturnEx {
	public static void main(String[] args) {
		// 참조형 반환 타입
		// 객체의 주소값 반환
		DataReturn d = new DataReturn();
		d.x = 10;
	
		DataReturn d2 = copy(d);
	}
	
	static DataReturn copy(DataReturn d) {
		DataReturn tmp = new DataReturn();
		tmp.x = d.x;
		
		return tmp;
	}
}
