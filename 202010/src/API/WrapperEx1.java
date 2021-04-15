package API;
/*
래퍼 클래스(Wrapper Class)
  - 8개의 기본 자료형의 객체 표현
  
  boolean - Boolean
  char	- Character
  byte	- Byte
  short	- Short
  int	- Integer
  long	- Long
  float	- Float
  double - Double
*/
public class WrapperEx1 {
	public static void main(String[] args) {
		
		int i = 10;
		
		Integer ii = new Integer(100);
		Integer ii2 = new Integer(100);
		
		System.out.println(ii == ii2);
		System.out.println(ii.equals(ii2));
	}
}