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
		button1 = new JButton("(내부 클래스 타입)이벤트 리스너 2 ");
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout());
		this.add(button1);
	}

	private void addEventListener() {
//		button1.addActionListener(new MyButtenListener());
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("가나다라마바사");
				
			}
		});
	}
	
	private class MyButtenListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton targetBtn = (JButton) e.getSource();
			System.out.println(targetBtn.getText());
		}
	}
}

interface A {
	public abstract void a(String a);
}

public class EventListenerMainTest2 {
	public static void main(String[] args) {
		new MyFrame2();
	}
}
