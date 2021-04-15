package GUIEx;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Panel;

class PanelTest extends Frame{
	/*
	 패널
	 	- 컴포넌트들을 그룹별로 묶어서 처리할 때 주로 사용.
	 	- 일반적으로 Frame 컴포넌트들을 직접 붙이지 않고, 패널에 그룹별로 붙이고 Panel을 Frame에 다시 붙임.
	*/
	public PanelTest() {
		super("Panel Test");
		
		Panel panel = new Panel();
		
		Dialog d = new Dialog(this, "모덜리스 다이얼로그");
		d.setSize(200, 200);
		d.setVisible(true);
		
		panel.setBackground(Color.red);
		
		add(panel);
		
		setSize(300, 300);
		setVisible(true);
	}
}

public class GUIEx2 {
	public static void main(String[] args) {
		
		new PanelTest();
	}
}
