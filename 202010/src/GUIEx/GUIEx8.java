package GUIEx;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class GridLayoutEx extends JFrame{
	
	public GridLayoutEx() {
		
		super("GridLayout Test");
		
		Container c = getContentPane();
		
		GridLayout grid = new GridLayout(4, 2);	// 4행 2열로 만들겠다.
		grid.setVgap(5);
		c.setLayout(grid);
		
		c.add(new JLabel(" 이름"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학번"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학과"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 과목"));
		c.add(new JTextField(""));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300, 200);
	}
}

public class GUIEx8 {
	public static void main(String[] args) {
		
		new GridLayoutEx();
	}
}
