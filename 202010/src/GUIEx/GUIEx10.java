package GUIEx;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

class KeyListenerEx extends JFrame{
	
	JLabel[] keyMessage;
	
	public KeyListenerEx() {
		super("keyListener 예제");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.addKeyListener(new MyKeyListener());
		
		keyMessage = new JLabel[3];
		
		keyMessage[0] = new JLabel("getKeyCode()");
		keyMessage[1] = new JLabel("getKeyChar()");
		keyMessage[2] = new JLabel("getKeyText()");
		
		for (int i = 0; i < keyMessage.length; i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true);	// true: 불투명 / false: 투명
			keyMessage[i].setBackground(Color.YELLOW);
		}
		
		setVisible(true);
		setSize(300, 150);
		
		// ContentPane이 키 입력을 받을 수 있도록, 포커스 강제 지정.
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter{

		@Override
		public void keyReleased(KeyEvent e) {	// 누른 키를 떼는 순간.
			int keyCode = e.getKeyCode();	// 가상 키 값.
			char keyChar = e.getKeyChar();	// 키의 문자 코드(유니코드) 알아내는 방법.
			
			keyMessage[0].setText(Integer.toString(keyCode));
			keyMessage[1].setText(Character.toString(keyChar));
			keyMessage[2].setText(e.getKeyText(keyCode));	// 키 이름 문자열 리턴(즉, 들어있는 문자열 그대로의 값)
		}
	}
}

public class GUIEx10 {
	public static void main(String[] args) {
		
		new KeyListenerEx();
	}
}
