import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

class LeftKeyFrame2 extends JFrame{
	
	public LeftKeyFrame2() {
		setTitle("Left 키로 문자열 교체");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");

		label.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					JLabel label = (JLabel) e.getSource();
					String text = label.getText();
					
					String front = text.substring(0,1);	// L
					String last = text.substring(1);	// ove Java
					label.setText(last.concat(front));	// ove JavaL
				}
			}
		});
		
		c.add(label);
		
		setVisible(true);
		setSize(350, 200);

		label.setFocusable(true);
		label.requestFocus();
	}
}

public class ex2 {
	public static void main(String[] args) {
		
		new LeftKeyFrame2();
	}
}