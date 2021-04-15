package ExceptionPackage;
/*
 프로그램 오류
  - 컴파일 에러 : 컴파일 시 발생하는 에러
  - 런타임 에러 : 실행 시 발생하는 에러
  		> 에러 : 프로그램 코드에 의해서 수습될 수 없는 심각한 오류
  		> 예외 : 프로그램 코드에 의해서 수습 될 수 있는 다소 미약한 오류
  		
  예외 처리
  	정의 : 프로그램 실행 시, 발생할 수 있는 예외의 상황에 대비한 코드 작성
  	목적 : 프로그램의 비정상 종료를 막고, 정상적인 실행 상태 유지
*/
public class ExceptionEx1 {
	public static void main(String[] args) {
		
		try {
			// 예외가 발생할 가능성이 있는 문장
		} catch(Exception e) {
			// Exception이 발생했을 경우, 이를 처리하기 위한 문장 작성
			// 한줄이라고 괄호 생략 X
		}
	}
}
