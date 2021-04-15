import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ex2 extends JFrame{
    
	public ex2() {
		setTitle("Money Changer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new MyPanel());
		
		setSize(300, 300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		
		int[] pm = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		String[] bill = {"오만원","만원","천원","500원","100원","50원","10원","1원"};
		
		JTextField source;	// 사용자로부터 금액이 입력될 텍스트 필드.
		JTextField[] jf = new JTextField[8];	// 환산된 돈의 개수가 출력될 텍스트 필드.
		
		public MyPanel() {
			setBackground(Color.PINK);
			setLayout(null);
			
			JLabel label = new JLabel("금액");
			label.setHorizontalAlignment(JLabel.RIGHT);
			label.setSize(50, 20);
			label.setLocation(20, 20);
			add(label);
			
			source = new JTextField(30);
			source.setSize(100, 20);
			source.setLocation(100, 20);
			add(source);
			
		    JButton btn = new JButton("계산");
		    btn.setSize(70, 20);
		    btn.setLocation(210, 20);
		    add(btn);
		    
		    // 계산된 액수 별 돈의 갯수
		    for (int i = 0; i < bill.length; i++) {
		    	label = new JLabel(bill[i]);
		    	label.setHorizontalAlignment(JLabel.RIGHT);
		    	label.setSize(50, 20);
		    	label.setLocation(50, 50+i*20);
		    	add(label);
		    	
		    	jf[i] = new JTextField(30);
		    	jf[i].setHorizontalAlignment(JTextField.CENTER);
		    	jf[i].setSize(70, 20);
		    	jf[i].setLocation(120, 50+i*20);
		    	add(jf[i]);
			}
		    
		    btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// 입력된 금액 문자열
					String str = source.getText();
					
					// 입력된 금액이 없음
					if(str.length() == 0) {
						return;
					}
					// 입력된 금액을 정수로 변환
					int money = Integer.parseInt(str);
					
					int res;
					
					for (int i = 0; i < pm.length; i++) {
						// pm[i]의 개수 계산
						res = money/pm[i];
						
						jf[i].setText(Integer.toString(res));
						
						if(res > 0) {
							// money 갱신
							money %= pm[i];
						}
					}
				}
			});
		}
	}
	
	public static void main(String[] args) {
		
		new ex2();
	}
}
