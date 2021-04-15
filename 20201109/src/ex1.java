import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ex1 extends JFrame{

	JCheckBox buttonInactive = new JCheckBox("버튼 비활성화");
    JCheckBox buttonHide= new JCheckBox("버튼 감추기");
    JButton btn = new JButton("test button");
    
	public ex1() {
		setTitle("체크 박스 연습문제 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(buttonInactive);
		c.add(buttonHide);
		c.add(btn);
		
		buttonInactive.addItemListener(new MyItemListener());
		buttonHide.addItemListener(new MyItemListener());
		
//		buttonInactive.addItemListener(new ItemListener() {
//			
//			@Override
//			public void itemStateChanged(ItemEvent e) {
//				if(e.getStateChange() == ItemEvent.SELECTED) {
//					btn.setEnabled(false);
//				}else {
//					btn.setEnabled(true);
//				}
//			}
//		});
//		
//		buttonHide.addItemListener(new ItemListener() {
//			
//			@Override
//			public void itemStateChanged(ItemEvent e) {
//				if(e.getStateChange() == ItemEvent.SELECTED) {
//					btn.setVisible(false);
//				}else {
//					btn.setVisible(true);
//				}
//			}
//		});
		
		setSize(300, 200);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			 if(e.getStateChange() == ItemEvent.SELECTED) {
				 if(e.getItem() == buttonInactive) {
					 btn.setEnabled(false);
				} else {
					btn.setVisible(false);
				}
			}else {
				if(e.getItem() == buttonInactive) {
					btn.setEnabled(true);
				} else {
					btn.setVisible(true);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		new ex1();
	}
}
