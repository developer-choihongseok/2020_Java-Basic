package GUIEx;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class GUIComponentEx3 extends JFrame{
	
	public GUIComponentEx3() {
		super("Label 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textlabel = new JLabel("사랑합니다.");
		
//		ImageIcon beauty = new ImageIcon("C:\\Temp\\pengsu.jpeg");
//		JLabel imageLabel = new JLabel(beauty);
		JLabel test = new JLabel(new ImageIcon("C:\\Temp\\pengsu.jpeg"));
		
		JLabel test2 = new JLabel("전화하세요", new ImageIcon("C:\\Temp\\pengsu.jpeg"), SwingConstants.CENTER);
		
		ImageIcon normalIcon = new ImageIcon("C:\\Temp\\pengsu.jpeg");
		ImageIcon rolloverIcon = new ImageIcon("C:\\Temp\\kim.jpg");
		ImageIcon pressedIcon = new ImageIcon("C:\\Temp\\cap.jpg");
		
		JButton btn = new JButton("펭수", normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		
		btn.setVerticalAlignment(SwingConstants.CENTER);
		btn.setHorizontalAlignment(SwingConstants.CENTER);
		
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배", true);
		JCheckBox cherry = new JCheckBox("체리" ,normalIcon);
		
		cherry.setBorderPainted(true);
		
		c.add(textlabel);
		c.add(test);
		c.add(test2);
		c.add(btn);
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(400, 600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new GUIComponentEx3();
	}
}