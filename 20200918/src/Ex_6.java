
public class Ex_6 {
	public static void main(String[] args) {
		
		System.out.println("-----------------");
		System.out.println(" 구구단 프로그램 v1.0");
		System.out.println("-----------------");
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + " X " + i + " = "+ i * j + "\t");
			}
			System.out.println();
		}
	}
}
