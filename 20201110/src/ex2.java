import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ex2 extends JFrame{
	
	MyPanel panel = new MyPanel();
	
	public ex2() {
		super("그래픽 이미지 확대축소");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new MyPanel());
		
		setSize(400, 400);
		setVisible(true);
		
		getContentPane().setFocusable(true);
		getContentPane().requestFocus();
	}
	
	class MyPanel extends JPanel{
		ImageIcon icon = new ImageIcon("C:\\Users\\chs02\\OneDrive\\바탕 화면\\20년 코리아IT아카데미\\JAVA\\JAVA2 - 평일(윤호근 강사)\\명품 JAVA 프로그래밍(스윙)\\images\\apple.jpg");
		Image img = icon.getImage();
		
		int width, height;
		
		public MyPanel() {
			// 이미지의 원본 크기 기억.
			width = img.getWidth(this);
			height = img.getHeight(this);
			
			addKeyListener(new KeyAdapter() {
				
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyChar() == '+') {
						width = (int)(width * 1.1);
						height = (int)(height * 1.1);
						repaint();	// 다시 그리기 지시.
					}else if(e.getKeyChar() == '-') {
						width = (int)(width * 0.9);
						height = (int)(height * 0.9);
						repaint();
					}
				}
			});
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			g.drawImage(img, 10, 10, width, height, this);
		}
	}
	
	public static void main(String[] args) {
		
		new ex2();
	}
}
