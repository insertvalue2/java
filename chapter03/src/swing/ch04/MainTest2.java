package swing.ch04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends JFrame {

	JButton button1;

	public MyFrame2() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("이벤트 리스너 연습 2");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("button");
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout());
		this.add(button1);
	}
	// private -> protected 변경 (MyFrame3 사용)
	protected void addEventListener() {
		button1.addActionListener(new MyButtenListener());
	}
	
	private class MyButtenListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton targetBtn = (JButton) e.getSource();
			System.out.println(targetBtn.getText());
		}
	}
}

public class MainTest2 {
	public static void main(String[] args) {
		new MyFrame2();
	}
}
