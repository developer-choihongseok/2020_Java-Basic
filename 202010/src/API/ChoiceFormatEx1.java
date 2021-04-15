package API;

import java.text.ChoiceFormat;
/*
ChoiceFormat - 범위의 형식화
	- 특정 범위에 속하는 값을 문자열로 변환
	- if문, switch문으로 처리하기 복잡한 경우 사용!!
	- 패턴 구분자
		# : 경계값 포함
		< : 경계값 포함하지 X
*/
public class ChoiceFormatEx1 {
	public static void main(String[] args) {
		// 서로 범위와의 갯수를 맞춰줘야 한다.
//		double[] limits = {60,70,80,90};	// 낮은 값부터 큰 값의 순서로 적어줘야 한다.
//		String[] grades = {"D","C","B","A"};
		
		String pattern = "60#D|70#C|80<B|90#A";
		
		int[] scores = {100,95,88,70,52,60,70,80};
		
//		ChoiceFormat form = new ChoiceFormat(limits, grades);
		ChoiceFormat form = new ChoiceFormat(pattern);
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i] + ": " + form.format(scores[i]));
		}
	}
}