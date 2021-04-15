package Thread;

// yield() : 자신의 시간을 양보하는 메서드(= 쓰레드가 작업을 수행하던 중에 메서드를 만나게 되면, 실행시간을 다음 차례에게 양보.)
class ThreadEx5 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.print("★");
			Thread.yield();	// 자신에게 주어진 시간을 양보.
		}
	}
}

class ThreadEx6 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.print("☆");
		}
	}
}

public class ThreadTest4 {
	public static void main(String[] args) {
		
		ThreadEx5 t = new ThreadEx5();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(new ThreadEx6());
		
		t1.start();
		t2.start();
	}
}