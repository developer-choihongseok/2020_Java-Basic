package GUIEx;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class GUIComponentEx5 extends JFrame{
	
	public GUIComponentEx5() {
		this("라디오버튼 예제");
	}
	
	public GUIComponentEx5(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon cherryicon = new ImageIcon("C:\\Users\\chs02\\OneDrive\\바탕 화면\\20년 코리아IT아카데미\\JAVA\\JAVA2 - 평일(윤호근 강사)\\명품 JAVA 프로그래밍(스윙)\\images\\cherry.jpg");
		ImageIcon SelectedCherryicon = new ImageIcon("C:\\Users\\chs02\\OneDrive\\바탕 화면\\20년 코리아IT아카데미\\JAVA\\JAVA2 - 평일(윤호근 강사)\\명품 JAVA 프로그래밍(스윙)\\images\\selectedCherry.jpg");
		
		ButtonGroup g = new ButtonGroup();
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배", true);
		JRadioButton cherry = new JRadioButton("체리", cherryicon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(SelectedCherryicon);
		
		// 그룹을 해제하면, 여러 개 체크 가능!!
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new GUIComponentEx5();
	}
}
