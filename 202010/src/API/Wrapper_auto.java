package API;
/*
레퍼 클래스에 대입된 값은 ==, !=과 같은 연산자를 이용하여 값의 비교가 불가능!!
그 이유는 인스턴스를 생성하면서 heap 메모리에 값이 저장되고, 객체 변수는 참조 값을 가지기 때문.
따라서, equals() 메소드를 이용하거나 데이터를 언박싱하여 값을 비교!!
*/
public class Wrapper_auto {
	public static void main(String[] args) {
		
		int i1 = 10;	// 기본 자료형
//		Integer wi = i1; // 박싱(오토박싱)
		Integer wi = new Integer(i1);	// 박싱
		
//		int i2 = wi; // 오토 언박싱
		int i2 = wi.intValue();	// 언박싱(Integer -> int)
		
		double d1 = 3.14;
		Double wd = d1;	// 박싱
		
		// 오토 언박싱
//		double d2 = wd;
		double d2 = wd.doubleValue();	// 언박싱(Double -> double)
		
		int i = 10;
		Integer wii = new Integer(i);	// 박싱(int -> Integer)
		
		String str = "10";
		Integer wi2 = new Integer(str);	// 박싱(String -> Integer)
	}
}