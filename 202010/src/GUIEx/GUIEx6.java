package GUIEx;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class FlowLayoutEx extends JFrame{
	
	public FlowLayoutEx() {
		
		super("FlowLayout Test");
		
		Container c = getContentPane();
		
		// flowLayout
		c.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calc"));
		
		setResizable(false);	// 창의 크기를 변경 X 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 200, 200, 200);
		setVisible(true);
	}
}

public class GUIEx6 {
	public static void main(String[] args) {
		
		new FlowLayoutEx();
	}
}
