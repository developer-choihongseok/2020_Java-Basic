package GUIEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThread extends Thread{
	
	JLabel timerLabel;
	
	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	@Override
	public void run() {
		int n = 0;
		
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class GUIThreadEx1 extends JFrame{
	
	public GUIThreadEx1() {
		super("타이머 Thread");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel();
		label.setFont(new Font("고딕", Font.ITALIC, 80));
		
		c.add(label);
		
		TimerThread th = new TimerThread(label);
		th.start();
		
		setSize(300, 170);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new GUIThreadEx1();
	}
}
