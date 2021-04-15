import java.util.Scanner;

public class conditional {
	public static void main(String[] args) {
		/*
		 조건문 - 특정한 조건을 만족하면 명령문을 실행
		 
		 if문 - 기본적인 조건문
		     - 조건이 참일때 실행
		     - 만약 ~ 라면
		     - '만약' 조건에 만족하면 수행하라!!
		     	만족한다 : True
		     	만족하지 않다 : False
		 
		 	if(조건식)
		 		명령문
		 	// 여러 명령문 실행{}
		 	else
		 		- 조건식이 만족하지 않으면 '무조건' 여기를 수행
		 		- if문  종속
		 		- if문 하나당 하나만 사용가능	
		 	else if
		 		- if문 조건식이 만족하지 않으면 수행
		 		- if문 조건식이 만족하지 않을 때 다른 조건 검사
		 		- if문 종속(하나의 if에 여러개의 else if 가능)
		 		
		 switch ~ case문
		 	- 하나의 조건식으로 많은 경우의 수 처리할 때 사용
		 	- 조건식의 결과는 정수 또는 문자(문자열 jdk 1.8부터)
		 	
		 switch(조건식){
		 	case 값 1:
		 		// 조건식의 결과가 값 1과 같은 경우 실행
		 		break;
		 	case 값 2:
		 		// 조건식의 결과가 값 2와 같은 경우 실행
		 		break;
		 	default:
		 		// 조건식의 결과와 일치하는 값이 없을 때 실행(if문의 else와 동일)
		 }
		*/
	
		// If문 Example
		int a = 5;
		
		if(a < 3) {
			System.out.println("a는 3보다 큽니다.");
		}
		System.out.println("검사 끝");
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		int input = scanner.nextInt();
		
		if(input == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}
		
		if(input != 0) {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
			System.out.println("입력하신 숫자는 " + input + "입니다.");
		}
		
//		else {
//			System.out.println("입력하신 숫자는 0이 아닙니다.");
//			System.out.println("입력하신 숫자는 " + input + "입니다.");
//		}
		System.out.println();
		
		// else if문 Example
		System.out.print("점수 입력: ");
		int grade = scanner.nextInt();
		
		if(grade >= 90) {
			System.out.println("A학점");
		} else if(grade >= 80) {
			System.out.println("B학점");
		} else if(grade >= 70) {
			System.out.println("C학점");
		} else if(grade >= 60) {
			System.out.println("D학점");
		} else{
			System.out.println("F학점");
		}
		
		System.out.println();
		
		/*
		 중첩 조건문 - 조건문 내에 다시 조건문을 작성
		 
		 문제) 짝수 & 홀수 판별기
		  
		 [출력결과]
		  숫자 입력 : 2
		  짝수입니다.
		  숫자 입력 : 1
		  홀수입니다.
		  숫자 입력 : 0
		 0은 좀 애매하네요~
		*/
		
		// 중첩 조건문 Example1
		System.out.print("숫자 입력: ");
		int number = scanner.nextInt();
		
		if(number == 0) {
			System.out.println("0은 좀 애매하네요~");
		} else {
			if(number % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
		}
		System.out.println();
		
		// 중첩 조건문 Example2
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 입력: ");
		String id = sc.nextLine();
		
		if(id.equals("java")) {
			System.out.println("Id 일치");
			System.out.print("비밀번호 입력: ");
			String passwd = sc.nextLine();
			
			if(passwd.equals("abc123")) {
				System.out.println("password 일치");
				System.out.println("로그인 성공");
			} else 
				System.out.println("passwd 불일치");
		} else
			System.out.println("Id 불일치");
		
		System.out.println();
		
		/*
		 Example) 점수 입력 받아서 학점계산기
		 
		 100 ~ 90 : A학점(~8점이상 A+, ~4점미만 A-, 나머지는 A0)
		 89 ~ 80 : B학점(~8점이상 B+, ~4점미만 B-, 나머지는 B0)
		 79 ~ 70 : C학점(~8점이상 C+, ~4점미만 C-, 나머지는 C0)
		 69 ~ 60 : D학점(~8점이상 D+, ~4점미만 D-, 나머지는 D0)
		 59 ~ 0 : F학점
		*/
		int score = 0;
		char jumsu = ' ';
		char opt = '0';
		
		System.out.print("점수 입력: ");
		score = scanner.nextInt();
		
		System.out.printf("당신의 점수는 %d점입니다.", score);
		
		if(score >= 90) {
			jumsu = 'A';
			if(score >= 98) {
				opt = '+';
			} else if(score < 94) {
				opt = '-';
			}
		} else if(score >= 80) {
			jumsu = 'B';
			if(score >= 88) {
				opt = '+';
			} else if(score < 84) {
				opt = '-';
			}
		} else if(score >= 70) {
			jumsu = 'C';
			if(score >= 78) {
				opt = '+';
			} else if(score < 74) {
				opt = '-';
			}
		} else if(score >= 60) {
			jumsu = 'D';
			if(score >= 68) {
				opt = '+';
			} else if(score < 64) {
				opt = '-';
			}
		} else
			jumsu = 'F';
		System.out.println("당신의 학점은 " + jumsu + opt + "입니다.");
		System.out.println();
		
		// switch문 Example
		System.out.print("숫자 입력: ");
		int num = scanner.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("하나");
			break;
		case 2:
			System.out.println("둘");
			break;
		case 3:
			System.out.println("셋");
			break;
		default:
			System.out.println("그 외~");
			break;
		}
		System.out.println();
		
		// 주민등록번호 판별기(뒷자리 : 1,3 남자, 2,4 여자)
		System.out.print("주민등록번호 입력.(ex 123456-1234567) : ");
		String regNo = sc.nextLine();
		// charAt(인수): 인수번째의 문자를 읽어낸다. 이때, 인덱스 번호는 0부터 시작한다.
		char gender = regNo.charAt(7);	// char gender = sc.nextLine().charAt(7);
		System.out.print(gender + ": ");
		
		// 1,3 남자, 2,4 여자입니다.
		// switch문 이용
		switch(gender) {
		case '1': case '3':
			System.out.println("남자");
			break;
		case '2': case '4':
			System.out.println("여자");
			break;
		}
		System.out.println();
		
		// switch문 중첩 사용
		switch(gender) {
		case '1': case '3':
			switch(gender) {
			case '1':
				System.out.println("당신은 2000년 이전 출생");
				break;
			case '3':
				System.out.println("당신은 2000년 이후 출생");
				break;
			}
			System.out.println("당신은 남자입니다.");
			break;
			
		case '2': case '4':
			switch(gender) {
			case '2':
				System.out.println("당신은 2000년 이전 출생");
				break;
			case '4':
				System.out.println("당신은 2000년 이후 출생");
				break;
			}
			System.out.println("당신은 여자입니다.");
			break;
		}
		
		scanner.close();
		sc.close();
	}
}
