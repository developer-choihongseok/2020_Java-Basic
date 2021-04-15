package API;

import java.util.Arrays;

// ★ 문자열 API를  많이 쓴다!!
public class API_StringClass {
	public static void main(String[] args) {
		
		char ch;
		int n1,n2,n3,n4,n5;
		String s1,s2,s3;
		
		System.out.println("------------charAt");
		s1 = "abcdef";
		ch = s1.charAt(2);
		
		System.out.println("ch = " + ch);
		
		System.out.println("------------length");
		s1 = "abcdef";
		
		System.out.println("length = " + s1.length());
		
		// 두 개 이상의 문자열을 하나로 합친다.
		System.out.println("------------concat");
		s1 = "AAAA";
		s2 = s1.concat("BBBB");
		s3 = s1 + "CCCC";
		
		System.out.println("s2 = " + s2 + ", s3 = " + s3);
		
		// 특정한 내용을 자를 때 사용
		System.out.println("------------SubString");
		s1 = "0123456789";
		s2 = s1.substring(3);	// 3번 인덱스부터 문자열 끝까지 뽑아달라는 말.
		s3 = s1.substring(3,7);	// 끝 인덱스는 포함하지 않는다.
		
		System.out.println("s2 = " + s2 + ", s3 = " + s3);
		
		System.out.println("------------indexOf");
		s1 = "01ab456ab9";
		n1 = s1.indexOf('a');
//		n2 = s1.indexOf('a', 5);
		n2 = s1.lastIndexOf('a');
		n3 = s1.indexOf("ab");
		n4 = s1.indexOf("ab", 5);
		n5 = s1.indexOf("xx");
		
		System.out.println("n1 = " + n1);	// 문자 'a'의 위치 반환
		System.out.println("n2 = " + n2);	// 5번째 문자 이후 검색
		System.out.println("n3 = " + n3);	// 문자열 "ab"의 위치 반환
		System.out.println("n4 = " + n4);	// 앞에 ab의 인덱스는 무시하고, 5번째 문자 이후 검색
		System.out.println("n5 = " + n5);	// 발견되지 않으면 -1
		
//		if(s1.indexOf('x') != -1) {
//			System.out.println(s1.charAt(s1.indexOf('a')));
//		}
		
		System.out.println("------------equals");
		System.out.println("equals는 문자열의 실체 비교, ==은 문자열의 주소값을 비교");
		
		s1 = "dd";
		s2 = "dddd";
		s3 = s1 + s1;
		
		sscmp(s2, s3);
		
		System.out.println("------------hashcode");
		s1 = "AAAAA";
		s2 = "AAAAB";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println("------------replace");	// 문자열도 가능!!
		s1 = "ABABAB";
		s2 = s1.replace('B', 'C');
		
		System.out.println("s1 = " + s1 + ", s2 = " + s2);
		
		System.out.println("------------toLowerCase, toUpperCase");
		s1 = "aBcDeF";
		s2 = s1.toLowerCase();
		s3 = s1.toUpperCase();
		
		System.out.println("s1 = " + s1 + " s2 = " + s2 + ", s3 = " + s3);
		
		System.out.println(s1.equalsIgnoreCase(s2));	// 대소문자 구분없이 비교
		
		System.out.println("------------toString, trim");
		s1 = "abcde";
		s2 = s1.toString();
		System.out.println("s2 = " + s2);
		
		s1 = "     ABC     ";
//		s1 = "     A B C     ";
		s2 = s1.trim();	// 양끝에 공백만 지워진다. 가운데 공백은 지워지지 않는다.
		System.out.println("s1 = " + s1 + " s2 = " + s2);
		
		System.out.println("------------split");
		String str1 = "일과 놀이 사이에는 경계가 없다.";
		String[] words = str1.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		System.out.println(Arrays.toString(words));
		System.out.println();
		
		String str2 = "JAVA/PYTHON/C++";
		String[] Lec = str2.split("/");
		
		// 향상된 for문 -> 배열에서 주로 쓴다!!
		for(String word : Lec) {
			System.out.println(word);
		}
		System.out.println();
		
		String url = "http://www.naver.com";
		System.out.println(url.startsWith("http"));	// http로 시작을 하는지 물어본다.
		System.out.println(url.endsWith(".net"));	// .net로 끝나는지 물어본다.
	}
	
	private static void sscmp(String a, String b) {
		System.out.println("a = " + a + " b = " + b);
		
		if(a == b) {
			System.out.println("양자의 참조는 같다.");
		}else {
			System.out.println("양자의 참조는 같지 않다.");
		}
		
		if(a.equals(b)) {
			System.out.println("양자의 문자열의 실체는 같다.");
		}else {
			System.out.println("양자의 문자열의 실체는 같지 않다.");
		}
	}
}