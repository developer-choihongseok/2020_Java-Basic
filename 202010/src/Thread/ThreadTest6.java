package Thread;
/*
쓰레드 종료 
	1. 스스로 종료
		> run() 메서드에 예외처리에 return을 넣어 스스로 종료.
	2. 타 쓰레드에서 강제 종료
		> interrupt() 메서드 호출(예외 발생)
*/
class ThreadEx9 extends Thread{

	public ThreadEx9(String name){
		super(name);
	}
	
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				System.out.println(getName() + i + "번째 수행");
			}
		}catch(Exception e) {
			System.out.println("Thread 강제 종료");
			return;	// 쓰레드 강제 종료!!
		}
	}
}

public class ThreadTest6 {
	public static void main(String[] args) {
		
		ThreadEx9 th = new ThreadEx9("Thread ");
		th.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		th.interrupt();
	}
}