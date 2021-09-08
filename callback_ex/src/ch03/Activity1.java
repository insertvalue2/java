package ch03;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Activity1 extends JFrame {
	
	String name; 
	JPanel panel;
	
	CallbackCheckPosition callbackCheckPosition = new CallbackCheckPosition() {
		@Override
		public void checkPositionX(int x, int y) {
			System.out.println(name + "이 콜백 받음 x 값: " + x);
			System.out.println(name + "이 콜백 받음 y 값: " + y);
		}
	};
	
	public Activity1(String name) {
		this.name = name; 
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle(name);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel = new JPanel();
	}

	private void setInitLayout() {
		setVisible(true);
		add(panel);
		panel.setBackground(Color.blue);
	}
}
