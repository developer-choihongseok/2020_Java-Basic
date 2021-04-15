import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Country_Captial_Game {
	
	HashMap<String, String> hm = new HashMap<String, String>();
	
	Scanner sc = new Scanner(System.in);
	
	public Country_Captial_Game() {
		
		hm.put("멕시코", "멕시코시티");
		hm.put("스페인", "마드리드");
		hm.put("프랑스", "파리");
		hm.put("영국", "런던");
		hm.put("그리스", "아테네");
		hm.put("독일", "베를린");
		hm.put("일본", "동경");
		hm.put("중국", "베이징");
		hm.put("러시아", "모스크바");
	}
	
	public void start() {
		
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		
		while(true) {
			System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
			int list = sc.nextInt();
			
			switch(list) {
			case 1:
				input();
				break;
			case 2:
				quiz();
				break;
			case 3:
				finish();
				return;
			}
		}
	}
	
	public void input() {
		
		int cnt = hm.size();
		System.out.println("현재 " + cnt + "개 나라와 수도가 입력되어 있습니다.");
		cnt++;
		
		while(true) {
			System.out.print("나라와 수도 입력 " + cnt + ">> ");
			String country = sc.next();
			
			if(country.equals("그만")) {
				break;
			}
			
			String capital = sc.next();
			
			// 키 값이 중복인 경우
			if(hm.containsKey(country)) {
				System.out.println(country + "는 이미 있습니다");
				continue;
			}
			
			hm.put(country, capital);
			cnt++;
		}
	}
	
	public void quiz() {
		
		Set<String> keys = hm.keySet();
//		System.out.println(keys);
		
		Object[] array = keys.toArray();	// toArray() : 저장된 객체들을 객체배열의 형태로 반환.
		
		while(true) {
			// +1은 필요 없다. 인덱스 번호가 0부터 시작하기 때문.
			int index = (int)(Math.random() * array.length);
		
			String question = (String) array[index];
			String answer = hm.get(question);	// key의 값을 반환.
			
			System.out.print(question + "의 수도는? ");
			String capitalFromUser = sc.next();
			
			if(capitalFromUser.equals("그만")) {
				break;
			}
			
			if(capitalFromUser.equals(answer)) {
				System.out.println("정답!!");
			}else {
				System.out.println("아닙니다!!");
			}
		}
	}
	
	public void finish() {
		System.out.println("게임을 종료합니다.");
	}
	
	public static void main(String[] args) {
		
		Country_Captial_Game ccg = new Country_Captial_Game();
		ccg.start();
	}
}
