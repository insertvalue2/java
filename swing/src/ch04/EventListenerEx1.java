package ch04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame1 extends JFrame implements ActionListener {
	
	JButton button; 
	
	public MyFrame1() {
		initData();
		setInitLayout();
		addEventListener();
	}
	private void initData() {
		button = new JButton("button1");
	}
	private void setInitLayout() {
		setTitle("이번트 리스너 연습");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLayout(new FlowLayout());
		add(button);
	}
	
	private void addEventListener() {
		button.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("콜백메서드 실행");
		System.out.println("버튼이 클릭 되었습니다.");
		System.out.println(e.toString());
	}
}


public class EventListenerEx1 {
	public static void main(String[] args) {
		new MyFrame1(); 
	}
}
