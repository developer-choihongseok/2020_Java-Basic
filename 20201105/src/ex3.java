import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

class ClickEx extends JFrame{
	
	JLabel label = new JLabel("C");
	
	public ClickEx() {
		setTitle("클릭 연습 용 응용프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);

		c.add(label);
		
		label.setLocation(100, 100);
		label.setSize(50, 30);
		
		label.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JLabel label = (JLabel) e.getSource();
				Container c = label.getParent();
				
				int x1 = c.getWidth() - label.getWidth();
				int y1 = c.getHeight() - label.getHeight();
				
				int x = (int)(Math.random() * x1);
				int y = (int)(Math.random() * y1);
				
				label.setLocation(x, y);
			}
		});
		
		setVisible(true);
		setSize(400, 400);
	}
}

public class ex3 {
	public static void main(String[] args) {
		
		new ClickEx();
	}
}
