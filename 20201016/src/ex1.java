import java.util.Scanner;

// 앞에 글자 떼서, 뒤로 계속 보내서 결국에 처음 문자열이 나온다.
public class ex1 {
	public static void main(String[] args) {
		
		System.out.println("문자열을 입력하세요. 빈 칸이 있어도 되고 영어 한글 모두 됩니다.");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		// 문자열 길이만큼 반복
		for(int i = 0; i < str.length(); i++) {
			String first = str.substring(0, 1);	// 인덱스 0~1까지 1개의 문자
			String last = str.substring(1);		// 인덱스 1부터 문자열 끝까지 뽑는다.
			
			str = last + first;
			System.out.println(str);
		}
		sc.close();
	}
}