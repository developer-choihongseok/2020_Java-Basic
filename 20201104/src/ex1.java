import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class Baduk extends JFrame{
	
	public Baduk() {
		super("4X4 Color Frame");
		
		Container c = getContentPane();
		GridLayout grid = new GridLayout(4,4);
		
		c.setLayout(grid);
		
		Color[] color = {Color.RED, Color.ORANGE, Color.YELLOW,
				Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA,
				Color.GRAY, Color.BLACK, Color.PINK, Color.LIGHT_GRAY,
				Color.DARK_GRAY, Color.MAGENTA, Color.WHITE, Color.YELLOW,
				Color.ORANGE};
		
		JLabel[] label = new JLabel[16];
		
		for (int i = 0; i < label.length; i++) {
			label[i] = new JLabel(Integer.toString(i));	// 0부터해서 차례대로 들어간다.
			label[i].setOpaque(true);
			label[i].setBackground(color[i]);
			c.add(label[i]);
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(500, 200);
	}
}

public class ex1 {
	public static void main(String[] args) {
		
		new Baduk();
	}
}
