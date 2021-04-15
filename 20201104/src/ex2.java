import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Calculator extends JFrame{
	
	public Calculator() {
		setTitle("계산기 프레임");
		
		Container c = getContentPane();
	
		c.add(new NorthPanel(), BorderLayout.NORTH);
		c.add(new SouthPanel(), BorderLayout.SOUTH);
		c.add(new CenterPanel(), BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400, 400);
	}
}

class NorthPanel extends JPanel{
	public NorthPanel() {
		
		setBackground(Color.LIGHT_GRAY);
		setOpaque(true);
		setLayout(new FlowLayout());
		
		add(new JLabel("수식입력"));
		add(new JTextField(16));
	}
}

class SouthPanel extends JPanel{
	public SouthPanel() {
		
		setBackground(Color.YELLOW);
		setOpaque(true);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(new JLabel("계산 결과"));
		add(new JTextField(20));
	}
	
}

class CenterPanel extends JPanel{
	
	JButton[] button = {new JButton("+"),new JButton("-"),new JButton("x"),new JButton("/")};
	
	public CenterPanel() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(new GridLayout(4,4,5,5));
		
		for (int i = 0; i < 10; i++) {
			JButton button = new JButton(Integer.toString(i));
			add(button);
		}
		
		add(new JButton("CE"));
		add(new JButton("계산"));
		
		for (int i = 0; i < button.length; i++) {
			button[i].setBackground(Color.CYAN);
			add(button[i]);
		}
	}
}

public class ex2 {
	public static void main(String[] args) {
		
		new Calculator();
	}
}
