package swing.ch02;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame2 extends JFrame {
	
	JPanel panel1; 
	JPanel panel2;
	JButton button1; 
	JButton button2; 
	 
	public MyFrame2() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("패널 연습");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel1 = new JPanel();
		panel1.setBackground(Color.yellow);
		
		panel2 = new JPanel();
		panel2.setBackground(Color.blue);
		
		button1 = new JButton("버튼 1"); 
		button2 = new JButton("버튼 2"); 
		
	}
	
	private void setInitLayout() {
		this.setVisible(true);
		this.setLayout(new GridLayout(2, 1));
		this.add(panel1);
		this.add(panel2);
		
		panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel2.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		panel1.add(button1);
		panel2.add(button2);
		
	}
	
}


public class TwoPanelMainTest {
	public static void main(String[] args) {
		new MyFrame2();	
	}

}
