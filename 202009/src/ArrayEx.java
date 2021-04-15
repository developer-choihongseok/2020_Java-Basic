import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx {
	public static void main(String[] args) {
		/*
		 배열
		 	- 같은 자료형의 나열
		 	- 많은 양의 값을 다룰 때 유용
		 	- 배열의 각 요소는 서로 연속적
		 	
		 베열의 선언
		 	- 자료형이나 변수이름 뒤 대괄호[] 붙여 선언
		 	ex)
		 	자료형[] 변수이름;	// int[] score;
		  	자료형 변수이름[]; // int score[];
		  	
		배열의 생성
			int[] score;	// 배열의 선언
			score = new int[5];	// 배열의 생성
			
			int[] scroe = new int[5];
		
		배열의 초기화
			- 생성된 배열에 처음으로 값을 저장
			- 딱 한번만 초기화 가능!!
			
			int[] score = {100,90,80,70,60};	정석 : int[] score = new int[]{100,90,80,70,60};
			
		배열의 길이와 인덱스
		
			1) 인덱스
				- 배열의 공간마다 붙여진 번호
				- 인덱스 번호는 0번부터 부여
				- 배열의 길이: 선언한 크기 - 1
		*/
		int[] student = new int[3];
		
		System.out.println("현재 0번지 값: " + student[0] + "\n");
		
		student[0] = 30;
		student[1] = 20;
		student[2] = 10;
		
		System.out.println("현재 0번지 값: " + student[0] + "\n");
		
		int[] stu = {30,20,10};
		System.out.println("현재 0번지 값 : " + stu[0] + "\n");
		
		for(int i = 0; i < stu.length; i++) {
			System.out.println("현재 " + i + "번지 값: " + stu[i]);
		}
		System.out.println();
		
		/*
		 [출력 결과]
		 양수 5개를 입력하세요
		 1
		 39
		 78
		 100
		 99
		 가장 큰 수는 100입니다.
		*/
		System.out.println("양수 5개를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		
		int[] num = new int[5];
		int max = 0;
		
		for(int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
			
			if(max < num[i]) {
				max = num[i];
			}
		}
		System.out.println("가장 큰 수는 " + max + "입니다." + "\n");
		
		// Array API -> Arrays.으로 시작!!
		
		// 1. copyOf : 전달받은 배열의 특정 길이 만큼을 새로운 배열로 복사 반환(무조건 처음부터!!)
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = Arrays.copyOf(arr1, 3);
		int[] arr3 = Arrays.copyOf(arr1, 10);
		
		System.out.println("arr2 :" + Arrays.toString(arr2));
		System.out.println("arr3 :" + Arrays.toString(arr3));
		
		// 2. copyOfRange : 전달받은 배열의 특정 범위에 해당하는 요소만을 새로운 배열로 복사 반환(범위 지정)
		// 두번째 매개변수로는 원본 배열에서 복사할 시작 인덱스를 전달받고,
		// 세 번째 매개변수로는 마지막으로 복사될 배열 요소의 바로 다음 인덱스를 전달 받는다. 
		// 즉, 세 번째 매개변수로 전달된 인덱스 바로 전까지의 배열 요소까지만 복사.
		int[] arr4 = Arrays.copyOfRange(arr1, 2, 4);
		
		System.out.println("arr4 :" + Arrays.toString(arr4));
		System.out.println();
		
		// 3. fill : 전달받은 배열의 모든 요소를 특정 값으로 초기화
		int[] arr5 = new int[10];
		
		Arrays.fill(arr5, 7);
		System.out.println("arr5 :" + Arrays.toString(arr5));
		System.out.println();
		
		// 4. sort : 전달받은 배열의 모든 요소를 오름차순으로 정렬
		int[] arr6 = {5,3,2,1,4};
		
		Arrays.sort(arr6);
		System.out.println("arr6 :" + Arrays.toString(arr6));
		System.out.println();
		
		// 문자열 배열 특징 -> 문자 그대로 찍힌다!!
		char[] abc = {'A','B','C','D'};
		char[] num2 = {'1','2','3','4','5','6','7','8','9'};
		
		System.out.println(abc);
		System.out.println(num2);
		System.out.println();
		
		// 문자열 배열 특징2
		// arraycopy() : 지정된 범위의 값들을 한 번에 통째로 복사한다.	c.f) for문은 배열의 요소 하나하나 접근해서 복사한다.
		// 호출할 때는 어느 배열의 몇 번째 요소에는 어느 배열로 몇 번재 요소로 몇 개의 값을 복사할 것인지 지정해줘야 한다.
		char[] result = new char[abc.length + num2.length];
		
		// abc[0]에서 result[0]로 abc.length개의 데이터를 복사
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num2, 0, result, abc.length, num2.length);
		System.out.println(Arrays.toString(result));
		System.out.println();
		
		/*
		 1. 다음 1차원 배열의 합과 평균을 구하세요.
		 	조건1) 배열 초기값
		 	int arr[] = {20, 34, 22, 14, 36, 23, 67, 25, 99, 88};
		*/
		// 1번 문제
		int arr[] = {20, 34, 22, 14, 36, 23, 67, 25, 99, 88};
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("합은 : " + sum);
		System.out.println("평균은 : " + (float)sum / arr.length);
		System.out.println();
		
		/*
		 2. 1 ~ 100까지의 수를 1차원 배열에 저장.
		 	조건1) 저장된 배열에서 5의 배수만 출력하세요.
		 	조건2) 배열의 위치가 90번째일 때 출력을 중지함.
		*/
		// 2번 문제
		int[] numArray = new int[100];
	
		for(int j = 0; j < numArray.length; j++) {
			numArray[j] = j + 1;
		}
		System.out.println(Arrays.toString(numArray));
		System.out.println();
		
		for(int j = 0; j < numArray.length; j++) {
			if(numArray[j] % 5 == 0 && j <= 90) {
				System.out.println(numArray[j]);
			}
		}
		System.out.println();
		
		/*
		 로또 번호 생성기
			- 1 ~ 45 숫자 중에 6개 랜덤하게 생성(단, 중복 없이)
		*/
		// 로또 번호 생성기 -> 1번째 방법
		int[] lottery = new int[6];
		
		for(int number = 0; number < lottery.length; number++) {
			lottery[number] = (int)(Math.random() * 45) + 1;
			
			for(int number_duplicate = 0; number_duplicate < number; number_duplicate++) {
				if(lottery[number] == lottery[number_duplicate]) {
					number--;
				}
			}
		}
		
		for(int number = 0; number < lottery.length; number++) {
			System.out.print(lottery[number] + " ");
		}
		System.out.println();
		System.out.println();
		
		// 로또 번호 생성기 -> 2번째 방법
		int[] ball = new int[45];
		int rnd;
		int tmp;
		
		for(int l = 0; l < ball.length; l++) {
			ball[l] = l + 1;
		}
		
		for(int l = 0; l < 6; l++) {
			rnd = (int)(Math.random() * 45);
			
			tmp = ball[l];
			ball[l] = ball[rnd];
			ball[rnd] = tmp;
		}
		
		for(int l = 0; l < 6; l++) {
			System.out.printf("ball[%d] = %d\n", l+1, ball[l]);
		}
		System.out.println();
		
		/*
		 2차원 배열
		 	- 행과 열로 이루어진 배열
		 	
		 	자료형[][] 배열이름;		ex) int[][] student;
		 	
		  선언 및 생성
		  	int[][] student = new int[3][2];
		  	
		  초기화
		  	int[][] student = {100,200,300,1,2,3,4,5,6};		<- 이렇게 잘 쓰지 않는다.
		  	
		  	int[][] student = {{100,200,300},{1,2,3},{4,5,6}};	<- 이 방법도 선호하지 않는다.
		  	
		  	int[][] student = {									<- ★ 이 방법을 선호.
		  						{100,200,300},
		  						{1,2,3},
		  						{4,5,6}
		  					  };
		*/
		
		// 단어 맞추기_example	-> 3행 2열 
		String[][] words = {
				{"chair","의자"},
				{"computer","컴퓨터"},
				{"integer","정수"}
		};
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은? ", i+1, words[i][0]);
			String temp = sc.nextLine();
			
			if(temp.equals(words[i][1])) {
				System.out.println("정답입니다.\n");
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.\n\n", words[i][1]);
			}
		}
		
		// 2차원 배열_example
		int[][] test = new int[2][2];
		int count = 1;
		
		for(int i = 0; i < test.length; i++) {
			for(int j = 0; j < test[i].length; j++) {
				test[i][j] = count++;
				System.out.print(test[i][j]);
			}
			System.out.println();
		}

		scanner.close();
		sc.close();
	}
}
