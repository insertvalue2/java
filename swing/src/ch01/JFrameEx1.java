package ch01;

import java.awt.Color;

import javax.swing.JFrame;

class MyFrame extends JFrame {
	
	public MyFrame() {
		super.setTitle("MyFrame Test1");
		super.setSize(800, 500);
		super.setVisible(true);
	}
} // end of MyFrame


public class JFrameEx1 {
	public static void main(String[] args) {
		new MyFrame(); 
	} // end of main 
} // end of class
