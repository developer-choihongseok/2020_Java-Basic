import java.util.Scanner;

public class Ex3_3 {
	public static void main(String[] args) {
		
		int Alphabet_ja = 0, Alphabet_mo = 0;
			
		System.out.print("알파벳을 입력하세요(26개): ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			String str2 = str.substring(i, i+1);	// i와 i+1에 해당되는 문자열을 잘라내서 추출
//			System.out.println(str2);
			char ch = str.charAt(i);	// i번째 위치에 해당되는 문자 추출
			
			if(str2.equalsIgnoreCase("a") || str2.equalsIgnoreCase("e") || str2.equalsIgnoreCase("i") || str2.equalsIgnoreCase("o") || str2.equalsIgnoreCase("u")) {
				Alphabet_mo++;
			} else if(('a'<= ch && ch <= 'z' ) || ('A' <= ch && ch <= 'Z')) {
				Alphabet_ja++;
			}		
		}
		System.out.println("자음 갯수: " + Alphabet_ja + "개");
		System.out.println("모음 갯수: " + Alphabet_mo + "개");
		
		sc.close();
	}
}