package GUIEx;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class NullContainerEx extends JFrame{
	
	public NullContainerEx() {
		
		setTitle("Null Layout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(null);	// 배치 관리자 삭제.
		
		JLabel label = new JLabel("Hello Press Button");
		label.setLocation(130, 50);
		label.setSize(200, 20);
		c.add(label);
		
		for (int i = 1; i < 10; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i * 15, i * 15);
			b.setSize(50, 20);
			c.add(b);
		}
		
		setSize(300, 200);
		setVisible(true);
	}
}

public class GUIEx9 {
	public static void main(String[] args) {
		
		new NullContainerEx();
	}
}
