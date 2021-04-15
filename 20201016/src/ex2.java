import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {

		System.out.print(">>");
		
		Scanner sc = new Scanner(System.in);
		String text =  sc.nextLine();
		
		// 입력한 것을 StringBuffer로 옮길 수 있다.
		StringBuffer sb = new StringBuffer(text);
		
		while(true) {
			System.out.print("명령: ");
			String str = sc.nextLine();
			
			if(str.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			}
			
			// !를 기준으로 명령어를 배열에 넣는다.
			String[] tokens = str.split("!");
			
			// 배열이 2개가 아니면, 아래 문장을 실행해라. 그 말은, !가 없다라고 해석!!
			// !가 없으면 split이 정상적으로 하나도 배열을 나누지 않을테니, 배열을 2개 이상이 될 수 없을테니 정상적인 명령어의 형태가 아니라는 뜻.
			if(tokens.length != 2) {
				System.out.println("잘못된 명령입니다.");
			 // 각 배열에 0이라는 것은 느낌표 때문에 배열이 만들어졌는데, 둘 중 하나에 값이 없어서 바꾸질 못하면..
			}else {
				if(tokens[0].length() == 0 || tokens[1].length() == 0) {
					System.out.println("잘못된 명령입니다!");
					continue;
				}
			}
			
			// indexOf() : 문자열 중 입력받은 문자가 있으면 해당 문자의 위치(= index) 값을 리턴하고 문자가 없으면 -1을 리턴한다.
			// 문자열 조회는 index 값 0부터 시작한다(왼쪽부터 읽기 시작함을 의미!!)
			
			// ex) love!LOVE라고 했을 시, 기존 문장인 '우리는 love java programming'이였으니까 인덱스 번호 4를 반환.
			// 굳이 풀이하자면, int index = sb.indexOf("love");
			// split에 의해서 ! 기준으로 배열에 나누어서 넣었기 때문.
			// 따라서, tokens[0] = "love", tokens[1] = "LOVE"가 된다.
			int index = sb.indexOf(tokens[0]);
			
			if(index == -1) {
				System.out.println("찾을 수 없습니다!");
				continue;
			}
			
			// 그럼 위에 문장은 sb.replace(4,4+4,"LOVE");이 된다.
			// 바꿔야 되는 love라는 글자가 4번 인덱스부터 시작해서 바꿀 문자열의 길이 만큼을 지정해줘야 그 위치만 바뀔꺼니까,
			// 시작 인덱스는 4번부터 시작해서 인덱스에 바꿀 문자열의 길이 만큼을 구해서 더해주게 되면 끝 인덱스가 완성된다.
			sb.replace(index, index + tokens[0].length(), tokens[1]);
			System.out.println(sb.toString());
		}
		sc.close();
	}
}