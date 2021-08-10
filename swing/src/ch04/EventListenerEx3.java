package ch04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ColorChangeFrame extends JFrame implements ActionListener {
	// 버튼 두개 생성
	// BorderLayout 생성
	// JPanel 생성
	// 버튼 1 , 버튼 2 이벤트 리스너 등록
	// 동쟉 : 버튼 1 -> JPanel 색상을 빨간색으로 변경
	// 동작 : 버튼 2 -> JPanle 색상을 노란색으로 변경
	JButton button1;
	JButton button2;
	// 문제 버튼 2개 추가해서 원하는 색상으로 변경하는 기능을 만들어 봅시다.  
	
	JPanel panel1;
	JPanel panel2;
	BorderLayout borderLayout;

	public ColorChangeFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		panel1 = new JPanel();
		panel1.setBackground(Color.gray);
		panel1.setPreferredSize(new Dimension(500, 400));
		panel2 = new JPanel(new FlowLayout());

		button1 = new JButton("빨간색");
		button2 = new JButton("노란색");
		borderLayout = new BorderLayout();
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(borderLayout);
		add(panel1, BorderLayout.NORTH);
		add(panel2, BorderLayout.SOUTH);
		panel2.add(button1);
		panel2.add(button2);
	}

	private void addEventListener() {
		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton targetBtn = (JButton)e.getSource();
		if(targetBtn.getText().equals(button1.getText())) {
			panel1.setBackground(Color.RED);
		} else {
			panel1.setBackground(Color.YELLOW);
		}
	}
}

public class EventListenerEx3 {
	public static void main(String[] args) {
		new ColorChangeFrame(); 
	}
}
