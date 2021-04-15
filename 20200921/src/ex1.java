
public class ex1 {
	public static void main(String[] args) {
		
		int[][] martix = new int[5][7];
		int number = 1;
		
//		for(int i = 0; i < martix.length; i++) {
//			for(int j = 0; j < martix[0].length; j++) {
//				martix[i][j] = number;
//				System.out.print(martix[i][j] + "\t");
//				number++;
//			}
//			System.out.println();
//		}

		for(int i = 0; i < martix.length; i++) {
			for(int j = 0; j < martix[i].length; j++) {
				martix[i][j] = number++;
				System.out.print(martix[i][j] + "\t");
			}
			System.out.println();
		}
	}
}