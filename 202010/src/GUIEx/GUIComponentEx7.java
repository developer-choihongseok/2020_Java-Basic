package GUIEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUIComponentEx7 extends JFrame{
	
	public GUIComponentEx7() {
		super("텍스트 필드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("이름"));
		c.add(new JTextField(20));
		
		c.add(new JLabel("학과"));
		c.add(new JTextField("컴퓨터 공학과", 20));
		
		c.add(new JLabel("주소"));
		c.add(new JTextField("서울시", 20));
		
		JTextField tt = new JTextField(20);
		tt.setEditable(false);
		tt.setText("Test");
		tt.setFont(new Font("고딕체", Font.ITALIC, 12));
		
		c.add(tt);
		
		setSize(300, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new GUIComponentEx7();
	}
}
