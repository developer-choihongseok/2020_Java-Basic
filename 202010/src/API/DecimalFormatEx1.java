package API;

import java.text.DecimalFormat;
/*
형식화 클래스(DecimalFormat)
	- 숫자를 다양한 형식(패턴)으로 출력 가능하게 함.
*/
public class DecimalFormatEx1 {
	public static void main(String[] args) {
		
		double number = 1234567.89;
		
		String[] pattern = {
				"0",					// 10진수(값이 없을 때: 0)
				"#",					// 10진수
				"0.0",
				"#.#",					// 소수점
				"00000000.0000",
				"########.####",
				"#.#-",
				"-#.#",
				"#,###.##",
				"#E0",					// 지수 표현
				"#,###.##+;#,###.##-",	// ; 패턴 구분자(두 개 중 하나)
				"#.#%",
				"\u00A4 #,###"			// 통화 표시 \
		};
		
		for (int i = 0; i < pattern.length; i++) {
			DecimalFormat df = new DecimalFormat(pattern[i]);
			System.out.printf("%19s: %s\n", pattern[i], df.format(number));	// 자동으로 반올림해서 보여준다.
		}
	}
}