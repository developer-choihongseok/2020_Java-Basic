package GUIEx;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

class KeyCodeEx1 extends JFrame{
	
	JLabel label = new JLabel();
	Container c = getContentPane();
	
	public KeyCodeEx1() {
		super("KeyCode 예제 : F1키 -> 초록색, %키 -> 노란색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c.addKeyListener(new MyKeyListener());
		c.add(label);
		
		setVisible(true);
		setSize(300, 150);
		
		// 키 입력을 받을 수 있게 한다.
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter{
		
		@Override
		public void keyPressed(KeyEvent e) {
			label.setText(e.getKeyText(e.getKeyCode())+ "키가 입력되었습니다.");
			
			if(e.getKeyChar() == '%') {
				c.setBackground(Color.YELLOW);
			}else if(e.getKeyCode() == KeyEvent.VK_F1) {
				c.setBackground(Color.GREEN);
			}
		}
	}
}

public class GUIEx11 {
	public static void main(String[] args) {
		
		new KeyCodeEx1();
	}
}
