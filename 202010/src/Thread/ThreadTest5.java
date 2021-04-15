package Thread;

// join() : 특정한 쓰레드가 작업을 먼저 수행할 때 사용(즉, 강제성 부여)
class ThreadEx7 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("t1 : " + i);
		}
		System.out.println("<<<t1 완료>>>");
	}
}

class ThreadEx8 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("t2 : " + i);
		}
		System.out.println("<<<t2 완료>>>");
	}
}

public class ThreadTest5 {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new ThreadEx7());
		Thread t2 = new Thread(new ThreadEx8());
		
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main : " + i);
		}
		System.out.println("<<<Main 완료>>>");
	}
}