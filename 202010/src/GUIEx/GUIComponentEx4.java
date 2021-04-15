package GUIEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUIComponentEx4 extends JFrame{
	
	JCheckBox[] fruits = new JCheckBox[3];
	String[] names = {"사과", "배", "체리"};
	
	JLabel sumLabel;
	
	public GUIComponentEx4() {
		super("체크박스 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));
		
		MyItemListener listener = new MyItemListener();
		
		for (int i = 0; i < fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);
			c.add(fruits[i]);
			fruits[i].addItemListener(listener);
		}
		sumLabel = new JLabel("현재 0원입니다.");
		c.add(sumLabel);
		
		setSize(250, 200);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener{
		
		int sum = 0;	// 가격의 합계
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			// 체크 되어있으면 true, 아니면 false.
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem() == fruits[0]) {
					sum += 100;
				} else if(e.getItem() == fruits[1]) {
					sum += 500;
				}else {
					sum += 20000;
				}
			} else {	// 체크를 해제했을 때..
				if(e.getItem() == fruits[0]) {
					sum -= 100;
				} else if(e.getItem() == fruits[1]) {
					sum -= 500;
				}else {
					sum -= 20000;
				}
			}
			sumLabel.setText("현재" + sum + "원 입니다.");
		}
	}
	
	public static void main(String[] args) {
		
		new GUIComponentEx4();
	}
}
