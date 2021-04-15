package GUIEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIEventEx1 extends JFrame{
	
	public GUIEventEx1() {
		super("Action 이벤트 리스터 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		c.add(btn);
		
//		btn.addActionListener(new MyActionListener());
//		btn.addActionListener(new InnerActionListener());
		
		// 익명 클래스
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource();
				
				if(b.getText().equals("Action")) {
					b.setText("액션");
				}else {
					b.setText("Action");
				}
			}
		});
		
		setSize(350, 150);
		setVisible(true);
	}
	
	// 내부 클래스
//	class InnerActionListener implements ActionListener{
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			JButton b = (JButton) e.getSource();
//			
//			if(b.getText().equals("Action")) {
//				b.setText("액션");
//			}else {
//				b.setText("Action");
//			}
//			
//			GUIEventEx1.this.setTitle(b.getText());
//			
//		}
//	}
	
	public static void main(String[] args) {
		// 독립 클래스
		new GUIEventEx1();
	}
}

//class MyActionListener implements ActionListener{
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		JButton b = (JButton) e.getSource();
//		
//		if(b.getText().equals("Action")) {
//			b.setText("액션");
//		}else {
//			b.setText("Action");
//		}
//	}
//}
