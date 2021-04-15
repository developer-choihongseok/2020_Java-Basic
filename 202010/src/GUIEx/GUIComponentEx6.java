package GUIEx;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class GUIComponentEx6 extends JFrame{
	
	JRadioButton[] radio = new JRadioButton[3];
	String[] text = {"사과","배","체리"};
	ImageIcon[] image = {new ImageIcon("C:\\Users\\chs02\\OneDrive\\바탕 화면\\20년 코리아IT아카데미\\JAVA\\JAVA2 - 평일(윤호근 강사)\\명품 JAVA 프로그래밍(스윙)\\images\\apple.jpg"),
			new ImageIcon("C:\\Users\\chs02\\OneDrive\\바탕 화면\\20년 코리아IT아카데미\\JAVA\\JAVA2 - 평일(윤호근 강사)\\명품 JAVA 프로그래밍(스윙)\\images\\pear.jpg"),
			new ImageIcon("C:\\Users\\chs02\\OneDrive\\바탕 화면\\20년 코리아IT아카데미\\JAVA\\JAVA2 - 평일(윤호근 강사)\\명품 JAVA 프로그래밍(스윙)\\images\\cherry.jpg")
			};
	JLabel imageLabel = new JLabel();
	
	public GUIComponentEx6() {
		this("라디오 버튼 예제");
	}
	
	public GUIComponentEx6(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel radioPanel = new JPanel();
		
		ButtonGroup g = new ButtonGroup();
		radioPanel.setBackground(Color.GRAY);
		
		for (int i = 0; i < radio.length; i++) {
			radio[i] = new JRadioButton(text[i]);
			
			g.add(radio[i]);
			radioPanel.add(radio[i]);
			
			radio[i].addItemListener(new MyItemListener());
		}
		c.add(radioPanel, BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		radio[2].setSelected(true);
		
		setSize(250, 250);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.DESELECTED) {
				return;
			}
			if(radio[0].isSelected()) {
				imageLabel.setIcon(image[0]);
			} else if(radio[1].isSelected()) {
				imageLabel.setIcon(image[1]);
			} else {
				imageLabel.setIcon(image[2]);
			}
		}
	}
	
	public static void main(String[] args) {
		
		new GUIComponentEx6();
	}
}
