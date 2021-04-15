package GUIEx;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

class BorderLayoutEx extends JFrame{
	
	public BorderLayoutEx() {
		
		super("BorderLayout Test");
		
		Container c = getContentPane();
		
		// BorderLayout
		c.setLayout(new BorderLayout(10,10));
		
		c.add(new JButton("add"), BorderLayout.CENTER);
		c.add(new JButton("sub"), BorderLayout.NORTH);
		c.add(new JButton("mul"), BorderLayout.SOUTH);
		c.add(new JButton("div"), BorderLayout.EAST);
		c.add(new JButton("Calc"), BorderLayout.WEST);

		setResizable(false);	// 창의 크기를 변경 X
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 200, 200, 200);
		setVisible(true);
	}
}

public class GUIEx7 {
	public static void main(String[] args) {
		
		new BorderLayoutEx();
	}
}
