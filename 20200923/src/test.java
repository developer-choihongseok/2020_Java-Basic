// 메소드 생성 연습
public class test {
    // 전달받은 정수형 인자를 그대로 출력하는 함수
    static void A(int a)
    {	
    	System.out.println("a = " + a);
    }

    // 전달받은 정수형 인자에 10을 더한 후 리턴하는 함수
    static int B(int b)
    {
    	return b + 10;
    }

    // 전달받은 세 정수를 다 더한 값을 리턴하는 함수
    static int C(int a, int b, int c)
    {
    	return a + b + c;
    }
 
    // 전달받은 인자를 출력하는 함수(인자 : 정수형 2개, 문자형 1개)
    static void D(int a, int b, char ch1)
    {
    	System.out.println("a = " + a + " b = " + b + " ch1 = " + ch1);
    }

    // 소문자를 대문자로 바꾸어 출력하는 함수
    static void E(int ch1)
    {
    	System.out.printf("ch1 = %c\n", ch1 - 32);
    }

    // 대문자를 소문자를 바꾸어 리턴하는 함수
    static int F(char ch2)
    {
    	return ch2 + 32;
    }

    // 정수형 인자 1개, 문자형 인자 1개를 받아서 정수는 출력하고 문자는 리턴하는 함수
    static char G(int a, char ch2)
    {
    	System.out.println("a = " + a);
    	return ch2;
    }

    // 문자열을 입력받아 출력하는 함수
    static void H(String str)
    {
    	System.out.println("str = " + str);
    }

    // 인자(정수1, 정수2, 문자)를 입력받아 문자 = 정수2 - 정수1 을 출력하는 함수
    static void I(int a, int b, char ch1)
    {
    	ch1 = (char)(b - a);
    	System.out.printf("%c\n",ch1);
    }

    public static void main(String[] args) {
    	
        int a, b, c;
        char ch1, ch2;
        String str = "KoreaIT";

        a = 90; b = 100; c = 120;
        ch1 = 'a'; ch2 = 'Z';

        A(a);
        System.out.printf("%d\n", B(b));
        System.out.printf("%d\n", C(a, b, c));
        D(a, b, ch1);
        E(ch1);
        System.out.printf("%c\n", F(ch2));
        System.out.printf("%c\n", G(a, ch2));
        H(str);
        I(a,b,ch1);
    }
}