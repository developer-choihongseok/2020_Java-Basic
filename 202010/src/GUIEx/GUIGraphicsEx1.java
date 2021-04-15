package GUIEx;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUIGraphicsEx1 extends JFrame{
	
	MyPanel panel = new MyPanel();
	
	public GUIGraphicsEx1() {
		
		setTitle("원본 크기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(panel);
		
		setSize(300, 420);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		
		ImageIcon icon = new ImageIcon("C:\\Users\\chs02\\OneDrive\\바탕 화면\\20년 코리아IT아카데미\\JAVA\\JAVA2 - 평일(윤호근 강사)\\명품 JAVA 프로그래밍(스윙)\\images\\image0.jpg");
		Image img = icon.getImage();
		
		@Override
		protected void paintComponent(Graphics g) {
			g.drawImage(img, 20, 20, this);	// 원본 크기.
//			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);	// 꽉 차게.
//			g.drawImage(img, 20, 20, 250, 100, 100, 100, 50, 200, this);	// 일부분 크기조절.
			
			// 클리핑 영역
//			g.setClip(100, 20, 150, 150);
//			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
//			g.setColor(Color.YELLOW);
//			g.setFont(new Font("Arial", Font.ITALIC, 40));
//			g.drawString("Go Gater", 10, 150);	// 어디 위치에 글자를 찍어달라.는 뜻!!
		}
	}
	
	public static void main(String[] args) {
		
		new GUIGraphicsEx1();
	}
}
