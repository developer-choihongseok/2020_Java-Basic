
public class Ex3 {
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		int temp;
		
		System.out.println("현재 num1에는 : " + num1);
		System.out.println("현재 num2에는 : " + num2);
		System.out.println();
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("바뀐값 num1에는 : " + num1);
		System.out.println("바뀐값 num2에는 : " + num2);
	}
}