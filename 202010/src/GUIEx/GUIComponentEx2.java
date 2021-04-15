package GUIEx;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class GUIComponentEx2 extends JFrame{
	
	public GUIComponentEx2() {
		super("Label 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textlabel = new JLabel("사랑합니다.");
		
		ImageIcon beauty = new ImageIcon("C:\\Temp\\pengsu.jpeg");
		JLabel imageLabel = new JLabel(beauty);
//		JLabel test = new JLabel(new ImageIcon("C:\\Temp\\pengsu.jpeg"));
		JLabel test = new JLabel("전화하세요", new ImageIcon("C:\\Temp\\pengsu.jpeg"), SwingConstants.CENTER);
		
		c.add(textlabel);
		c.add(imageLabel);
		c.add(test);
		
		setSize(400, 600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new GUIComponentEx2();
	}
}