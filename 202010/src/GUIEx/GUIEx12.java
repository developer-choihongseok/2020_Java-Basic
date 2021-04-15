package GUIEx;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

class FlyingTextEx extends JFrame{
	// 레이블이 한 번 움직이는 단위는 10픽셀.
	final int FLYING_UNIT = 10;
	
	JLabel label = new JLabel("HELLO");
	
	public FlyingTextEx() {
		super("상하좌우 키를 이용하여 텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addKeyListener(new MykeyListener());
		c.setLayout(null);	// 배치 관리자 삭제.
		
		label.setLocation(50, 50);
		label.setSize(100, 20);
		
		c.add(label);
		
		// 컨텐트 팬에 마우스리스너를 붙이겠다.
		c.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// 클릭 했을 때, 객체에 있는 소스 값을 가르켜준다.
				Component com = (Component) e.getSource();
				com.setFocusable(true);
				com.requestFocus();
			}
		});
		
		setVisible(true);
		setSize(300, 300);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MykeyListener extends KeyAdapter{
		
		@Override
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			
			switch(keyCode){
			case KeyEvent.VK_UP:
				label.setLocation(label.getX(), label.getY()-FLYING_UNIT);
				break;
			case KeyEvent.VK_DOWN:
				label.setLocation(label.getX(), label.getY()+FLYING_UNIT);
				break;
			case KeyEvent.VK_LEFT:
				label.setLocation(label.getX()-FLYING_UNIT, label.getY());
				break;
			case KeyEvent.VK_RIGHT:
				label.setLocation(label.getX()+FLYING_UNIT, label.getY());
				break;
			}
		}
	}
}

public class GUIEx12 {
	public static void main(String[] args) {
		
		new FlyingTextEx();
	}
}
