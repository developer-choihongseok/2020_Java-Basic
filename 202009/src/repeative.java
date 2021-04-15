import java.util.Scanner;

public class repeative {
	public static void main(String[] args) {
		/*
		 반복문 - 조건에 만족하면 수행한다(조건문과 동일)
		 	   (단, 조건에 만족하지 않을 때 까지..)
		 	
			1. while문
				- 조건식이 참이면 수행문 수행
				- if문과 기본 구조가 동일
			  	(단, if문 : 조건이 참이면 수행하고 끝.
			      	while문 : 조건이 참이면 수행하고, 다시 조건식을 비교)
			    
			2. do-while문 
				- while문 변형된 형태
				- 명령문을 실행 후, 조건을 검사
				- 최소 1번은 명령문 실행
			
			3. for문
				- 특정한 횟수동안 작업 반복
				- 초기화, 조건식, 증감식
		*/
		
		// while문 example
		int num = 0;
		
		while(num < 3) {
			System.out.println(num);
			num++;	// 조건 변수가 중요하다!!
		}
		System.out.println();
		
		/*
		 조건 변수 - 조건 변수에 따라 반복횟수가 정해짐
		 
		 초기값(조건 변수 생성)
		
		while(조건식)	// 조건 변수 사용
			명령문(= 반복 수행할 코드 + 조건 변수의 변화식)
			
		 조건 변수의 변화식은 얼마든지 자유롭게 사용 가능.
		(단, 조건식이 만족하도록 구성)
		*/
		
		// 반복횟수 지정 example
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("반복횟수 입력: ");
		int count = scanner.nextInt();
		
		while(count > 0) {
			System.out.println("count = " + count);
			count--;
		}
		System.out.println();
		
		int i = 5;
		
		while(i-- != 0) {
			System.out.println(i + " - I can do it.");
		}
		System.out.println();
		
		/*
		1. 1부터 10까지 합 구하기
		  	- 1 ~ 10까지 증가할 변수
		  	- 합계를 누적할 변수
		  	
		 [출력 결과]
		 1 ~ 10까지 합은 55입니다.
		*/
		int number = 0;
		int sum = 0;
		
		while(number <= 10) {
			sum += number;
			number++;
		}
		System.out.println("1 ~ 10까지의 합은 " + sum + "입니다." + "\n");
		
		/*
		 2. 1부터 입력 받은 수까지 합 구하기
		  
		 [출력 결과]
		  숫자 입력 : 5
		 1 ~ 5까지 합은 15입니다.
		*/
		System.out.print("숫자 입력 : ");
		int cnt = scanner.nextInt();
		
		int x = 1;
		int hap = 0;
		
		while(x <= cnt) {
			hap += x;
			x++;
		}
		
		/*
		int hap = 0;
		
		while(cnt > 0) {
			hap += cnt;
			cnt--;
		}
		*/
		System.out.println("1부터 " + cnt + "까지의 합은 " + hap + "입니다." + "\n");
		
		/*
		 3. 구구단 7단 출력하기
		  
		 [출력 결과]
		 7 * 1 = 7
		 ...
		 7 * 9 = 63
		*/
		int j = 1;
		
		while(j < 10) {
			System.out.printf("%d * %d = %d\n", 7, j, 7 * j);
			j++;
		}
		System.out.println();
		
		// while문 example
		boolean flag = true;
		int sum1 = 0;
		
		System.out.println("합계를 구할 숫자를 입력(0을 입력 종료)");
		
		while(flag) {	// flag 값이 true이면 조건식이 참(무한 반복)
			System.out.print(">>");
			int number2 = scanner.nextInt();
			
			if(number2 == 0) {
				flag = false;
			}else {
				sum1 += number2;
			}
		}
		System.out.println("입력한 합계는 : " + sum1);
		System.out.println();
		
		// do-while문 example
		int menu = 0;
		
		do {
			System.out.println("1. 새로만들기");
			System.out.println("2. 파일열기");
			System.out.println("3. 파일닫기");
			System.out.print("선택 : ");
			
			menu = scanner.nextInt();	
		}while(menu < 1 || menu > 3);	
		
		System.out.print("선택된 메뉴는 : " + menu);
		System.out.println();
		
		// 난수 발생 시키는 방법
		int rnd;
		rnd = (int)(Math.random() * 100) + 1;
		
		System.out.println();
		System.out.println(rnd);
		System.out.println();
		
		/*
		 숫자 맞추기
		   1 ~ 50까지 랜덤으로 정답 숫자를 생성
		   while문 안에서 숫자를 입력 받고, 숫자가 정답이면 탈출!
		   
		 [출력 결과] (정답이 50이라고 가정)
		  숫자 입력 : 20
		  더 큰 수를 입력해보세요.
		  숫자 입력 : 35
		  더 작은 수를 입력해보세요.
		  숫자 입력 : 50
		  정답입니다!
		 3회만에 맞추셨습니다.	* 심화 : 몇 회 만에 맞혔는지 추가로 출력.
		 */
		
		int answer, cnt2= 0;
		boolean on_off = true;
		int random = (int)(Math.random() * 50) + 1;
		
		while(on_off) {
			System.out.print("숫자 입력: ");
			answer = scanner.nextInt();
			cnt2++; // 한번 입력할 때마다 1씩 증가!!
			
			if(answer > random)
				System.out.println("더 작은 수를 입력하세요.");
			else if(answer < random)
				System.out.println("더 큰 수를 입력하세요.");
			else {
				System.out.println("정답입니다.");
				on_off = false;
			}
		}
		System.out.println(cnt2 + "회 만에 맞추셨습니다.");
		System.out.println();
		
		int answer2, cnt3 = 0;
		int ran = (int)(Math.random() * 10) + 1;
		
		do {
			System.out.print("숫자 입력 : ");
			answer2 = scanner.nextInt();
			cnt3++;
			
			if(answer2 > ran) {
				System.out.println("더 작은 수를 입력하세요.");
			}else if(answer2 < ran) {
				System.out.println("더 큰 수를 입력하세요.");
			}else {
				System.out.println("정답입니다.");
			}
		}while(answer2 != ran);
		
		System.out.println(cnt3 + "회 만에 맞추셨습니다.");
		System.out.println();
		
		// for문 example -> 1 ~ 10 까지의 합 구하기
		int sum2 = 0;
		
		for(int k = 0; k <= 10; k++) {
			sum2 += k;
		}
		System.out.println("1부터 10까지의 합은 : " + sum2);
		System.out.println();
		
		// for문 example -> 두 개의 초기값, 두 개의 증감식
		for(int k = 1, l = 10; k <= 10; k++, l--) {
			System.out.printf("%d\t%d\n", k,l);
		}
		System.out.println();
		
		for(int n = 1; n <= 10; n++) {
			System.out.printf("%d\t%d\n", n, 11-n);
		}
		System.out.println();
		
		/*
		 break문
		  - 반복문 종료
		  - 마주하게 되면 반복문 탈출
		*/
		
		// break문 example
		int sum3 = 0, cnt1 = 0;
		
		while(true) {
			if(sum3 > 100) {
				break;
			}
			++cnt1;
			sum3 += cnt1;
		}
		System.out.println("cnt1 = " + cnt1);
		System.out.println("sum3 = " + sum3);
		System.out.println();
		
		/*
		 continue문
		  - 조건식으로 점프
		  	while : 조건식으로 검사
		  	for : 증감 후, 조건식으로 검사
		*/
		
		// continue문 example
		int num4 = 0, sum4 = 0;
		
		while(num4 <= 100) {
			if(num4 % 3 == 0) {
				num4++;
				continue;
			}
			sum4 += num4;
			num4++;
		}
		System.out.println("1부터 100까지 수 중 3의 배수를 제외한 합은 : " + sum4);
		System.out.println();
		
		// 중첩 반복문 example_1
		for(int a = 1; a <= 10; a++) {
			for(int b = 1; b <= 10; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// 중첩 반복문 example_2 -> 구구단
		for(int c = 2; c < 10; c++) {
			System.out.println(c + "단");
			for(int d = 1; d < 10; d++) {
				System.out.printf("%d * %d = %d\n", c, d, c * d);
			}
		}
		System.out.println();
		
		// 이름 붙은 반복문
		Loop1 : for(int c = 2; c < 10; c++) {
			System.out.println(c + "단");
			for(int d = 1; d < 10; d++) {
				if(d == 5)
//					break;
//					break Loop1;
//					continue;
					continue Loop1;
				System.out.printf("%d * %d = %d\n", c, d, c * d);
			}
		}
		scanner.close();
	}	
}
