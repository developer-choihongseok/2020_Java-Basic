package GUIEx;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUIEventEx2 extends JFrame{
	
	JLabel label = new JLabel("Hello");
	
	public GUIEventEx2() {
		super("Mouse 이벤트 처리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		
		c.setLayout(null);
		
		label.setSize(50, 20);
		label.setLocation(30, 30);

		c.add(label);
		
		setSize(250, 250);
		setVisible(true);
	}
	
//	class MyMouseListener implements MouseListener{
	class MyMouseListener extends MouseAdapter{
		
		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			
			label.setLocation(x,y);
		}
	}
	
	public static void main(String[] args) {
		new GUIEventEx2();
	}
}
