package Thread;

import java.util.Timer;
import java.util.TimerTask;

class MyTask extends TimerTask{

	@Override
	public void run() {
		System.out.println("타이머 호출");
	}
}

public class ThreadTimer {
	public static void main(String[] args) {
		
		MyTask task = new MyTask();
		
		Timer timer = new Timer();
		timer.schedule(task, 1000, 2000);	// 1초 후에 시작해서 2초 간격으로 타이머 실행.
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		timer.cancel();	// 타이머 중단
	}
}