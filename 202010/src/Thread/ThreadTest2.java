package Thread;
/*
 getPriority() : 우선순위를 반환.
 setPriority() : 우선순위를 설정.
 
 우선순위 : 1 ~ 10 -> 1: 우선 순위 낮다. 10: 우선 순위 높다.
 
 주요 필드(상수)
 
 	MAX_PRIORITY : 10
 	MIN_PRIORITY : 1
 	NORM_PRIORITY : 5
 	
ex)
	test.setPriority(Thread.MAX_PRIORITY); // 우선순위 가장 높게 하는 방법.
*/
class ThreadEx3 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("<" + Thread.currentThread().getName() + ">");
		}
		
		// 시간 지연
		for (int i = 0; i < 1000; i++);
	}
}

public class ThreadTest2 {
	public static void main(String[] args) {
		
		Runnable t = new ThreadEx3();
		Thread t1 = new Thread(t,"Thread1");
		
//		Thread th = new Thread(new ThreadEx3());
		
		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println("t1의 우선 순위는 : " + t1.getPriority());
		
		Thread t2 = new Thread(t, "Thread2");
		t2.setPriority(Thread.NORM_PRIORITY);
		System.out.println("t2의 우선 순위는  : " + t2.getPriority());
		
		Thread t3 = new Thread(t, "Thread3");
		t3.setPriority(Thread.MAX_PRIORITY);
		System.out.println("t3의 우선 순위는  : " + t3.getPriority());
		
		t1.start();
		t2.start();
		t3.start();
	}
}