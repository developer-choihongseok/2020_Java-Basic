package Thread;
/*
 run() : 메소드가 종료되면, 쓰레드 종료.
 	- 쓰레드를 계속 실행 시키고 싶으면 run() 메서드를 무한루프 속에 실행.
 	
 	한번 종료된 쓰레드는 다시 시작 불가.
 	쓰레드 객체를 다시 생성해야 가능.
 	
 	한 쓰레드에서 다른 쓰레드 강제 종료 가능!
 	
 	쓰레드의 상태 6가지
 		
 		1. NEW : 쓰레드가 생성되었지만, 쓰레드가 아직 실행할 준비가 되지 않았음(즉, start()가 호출되지 않은 상태)
 		2. RUNNABLE : 쓰레드가 실행되고 있거나, 실행 준비되어 스케줄링을 기다리는 상태.
 		3. WAITING : 다른 쓰레드가 notify(), notifyAll()를 불러주기를 기다리고 있는 상태.
 		4. TIMED_WAITING : 쓰레드 sleep() 호출로 인해 n 밀리초동안 잠을 자고 있는 상태.
 		5. BLOCKED : 쓰레드가 I/O 작업을 요청하면, 자동으로 쓰레드를 BLOCK 상태로 만든다.
 		6. TERMINATED : 쓰레드가 종료한 상태.
 		
 	JVM이 쓰레드 상태를 기록 관리.
 		
 		JVM의 스케줄링 규칙
 			- 철저한 우선 순위 기반.
 			- 가장 높은 우선 순위의 쓰레드가 우선적으로 스케줄링.
 			- 동일한 우선 순위의 쓰레드는 돌아가면서 스케줄링(= RR 기법)
*/
class ThreadEx4 extends Thread{
	
	public void run() {
		System.out.println("카운트 다운 5초");
		
		for (int i = 5; i >= 0; i--) {
			System.out.println(i);
			
			if(i != 0) {
				// 예외처리를 안하면 '교착상태'가 일어나기 때문에 해주어야 한다!!
				try {
					Thread.sleep(1000);	// 1초
				} catch (InterruptedException e) {
					System.out.println(e.toString());
				}
			}
		}
		System.out.println("종료");
	}
}

public class ThreadTest3 {
	public static void main(String[] args) {
		
		ThreadEx4 t = new ThreadEx4();
		t.start();
	}
}