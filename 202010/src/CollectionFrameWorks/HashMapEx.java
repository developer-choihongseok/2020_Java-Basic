package CollectionFrameWorks;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashMap hm = new HashMap();
		
		hm.put("apple", "사과");
		hm.put("paper", "종이");
		hm.put("flower", "꽃");
		
		System.out.print("알고 싶은 단어 입력: ");
		String voca = sc.nextLine();
		
		if(hm.containsKey(voca)) {
			System.out.println("해당하는 뜻: " + hm.get(voca));
		}else {
			System.out.println("해당 단어에 대한 뜻은 없습니다.");
		}
		System.out.println();
		
		HashMap map = new HashMap();
		
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");	// 두번째 key와 value값은 세 번째 key와 value값에 의해 없어진다.
		
		// 항상 빠져 나가는 부분을 먼저 만들기!! 
		while(true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.print("id: ");
			String id = sc.nextLine().trim();	// ★ 아이디를 입력하다가 공백을 입력 했을 때, 앞뒤로 공백을 지워준다!!
			System.out.print("pwd: ");
			String pw = sc.nextLine().trim();
			
			if(!(map.containsKey(id))) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력" + "\n");
				continue;
			}else {
				if(!(map.get(id)).equals(pw)) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력" + "\n");
					continue;
				}else {
					System.out.println("id와 pw가 일치합니다.");
					break;
				}
			}
		}
		sc.close();
	}
}