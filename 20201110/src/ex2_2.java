import java.awt.Container;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ex2_2 extends JFrame{
	
	public ex2_2() {
		
		super("디지털 시계 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.add(new MyLabel());	// 컨텐트팬의 중앙에 붙임.
		
		setSize(300, 200);
		setVisible(true);
	}
	
	class MyLabel extends JLabel implements Runnable{
		
		Thread timerThread = null;
		
		public MyLabel() {
			
			setText(makeClock());
			setFont(new Font("TimesRoman", Font.ITALIC, 50));
			setHorizontalAlignment(SwingConstants.CENTER);
			
			timerThread = new Thread(MyLabel.this);
			timerThread.start();
		}
		
		String makeClock() {
			
			Calendar c = Calendar.getInstance();
			
			int hour = c.get(Calendar.HOUR_OF_DAY);
			int minute = c.get(Calendar.MINUTE);
			int second = c.get(Calendar.SECOND);
			
			String clockText;
			
			clockText = Integer.toString(hour);
			clockText = clockText.concat(":");
			clockText = clockText.concat(Integer.toString(minute));
			clockText = clockText.concat(":");
			clockText = clockText.concat(Integer.toString(second));
			
			return clockText;
		}
		
		@Override
		public void run() {
			
			while(true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					setText(makeClock());
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		new ex2_2();
	}
}
