package API;

public class Wrapper_String_Change {
	public static void main(String[] args) {
		
		String str = "10";
		
		Integer wi = new Integer(str);	// 박싱(String -> Integer)
		int i1 = wi.intValue();			// 언박싱 Integer -> int형 값을 뽑아내는 메서드
		int i2 = wi;					// 오토언박싱 Integer -> int
		int i3 = Integer.parseInt(str);	// String -> int형 값을 뽑아내는 메서드 (= 해당하는 내용에서 숫자만 뽑아낸다)
		
		System.out.println(i1 + i2 + i3);
		
		String str2 = "3.14";
		
		Double wd = new Double(str2);			// 박싱(String -> Double)
		double d1 = wd.doubleValue();			// 언박싱 Double -> double형 값을 뽑아내는 메서드
		double d2 = wd;							// 오토언박싱 Double -> double
		double d3 = Double.parseDouble(str2);	// String -> double형 값을 뽑아내는 메서드
	}
}