package GUIEx;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUIEventEx3 extends JFrame{
	
	JLabel label = new JLabel("No Mouse Event");
	
	public GUIEventEx3() {
		super("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.addMouseListener(new MyMouseListener());
		c.addMouseMotionListener(new MyMouseListener());
		
		c.add(label);
	
		setSize(300, 200);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter{

		@Override
		public void mousePressed(MouseEvent e) {
			label.setText("MousePressed(" + e.getX() + "," + e.getY() + ")");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			label.setText("MouseReleased(" + e.getX() + "," + e.getY() + ")");
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			Component c = (Component) e.getSource();
			c.setBackground(Color.CYAN);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			Component c = (Component) e.getSource();
			c.setBackground(Color.YELLOW);
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			label.setText("MouseDragged(" + e.getX() + "," + e.getY() + ")");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			label.setText("MouseMoved(" + e.getX() + "," + e.getY() + ")");
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			if(e.getClickCount() == 2) {
				int r = (int)(Math.random() * 256);
				int g = (int)(Math.random() * 256);
				int b = (int)(Math.random() * 256);
				
				Component c = (Component)e.getSource();
				c.setBackground(new Color(r,g,b));
			}
		}
	}
	
	public static void main(String[] args) {
		
		new GUIEventEx3();
	}
}
