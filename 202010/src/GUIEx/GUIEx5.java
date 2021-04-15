package GUIEx;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 setLayout()
 	- JFrame에 얹을 컴포넌트의 배치 방법을 지정하는 메서드
 	
 FlowLayout()
 	- 공간이 부족하면, 아랫줄에 추가됨.
 	- 컨테이너 크기가 변경되면 컴포넌트들의 위치는 변하고, 크기는 고정.
 	- 기본적으로, 가운데 정렬이면서, hgap(좌우 간격)과 vgap(상하 간격)이 5px.
*/
class ContentPaneEx extends JFrame{
	
	public ContentPaneEx() {
		super("ContentPaneTest");
		
		// 꺼짐 버튼
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		
		contentPane.setBackground(Color.orange);
		contentPane.setLayout(new FlowLayout());	// 배치 관리자
		
		JButton btn1 = new JButton("OK");
		contentPane.add(btn1);
		
		// 버튼을 만들기만 한다.
		contentPane.add(new JButton("Cancel"));	
		contentPane.add(new JButton("Ignore"));
		
		setBounds(300, 150, 200, 200);
		setVisible(true);
	}
}

public class GUIEx5 {
	public static void main(String[] args) {
		
		new ContentPaneEx();
	}
}
