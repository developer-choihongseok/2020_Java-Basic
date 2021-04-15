package GUIEx;

import javax.swing.JFrame;

class SwingEx extends JFrame{
	
	public SwingEx() {
		setTitle("스윙 프레임");	// super("스윙 프레임");
		setBounds(100, 100, 200, 200);
		setVisible(true);
	}
}

public class GUIEx4 {
	public static void main(String[] args) {
		
		new SwingEx();
	}
}
