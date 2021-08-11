package ch04;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;


class MyFrame5 extends JFrame {

	JLabel label;


	public MyFrame5() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("마우스 이벤트");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("Helloasdfasdfasdfkasdflkjahdf");
		label.setSize(50, 50);
//		label.setBounds(-250, 0, 50, 50);
		
		System.out.println(label.getBounds());

	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
		add(label);
		label.setLocation(12, 39);
	}

	private void addEventListener() {
		this.addMouseListener(new MouseListener() {

			// 마우스가 떨어졌을 때 실행되는 메서드
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			// 마우스가 눌러 졌을때 실행되는 메서드
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			// 마우스가 나갔을때 실행되는 메서드
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			// 마우스가 들어 왔을때 실행되는 메서드
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			// 마우스가 클릭되었을때 실행되느 메서드
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getX() + " : x 좌표 값");
				System.out.println(e.getY() + " : y 좌표 값 ");
				System.out.println(getHeight() + " : getHeight() ");
				
				label.setLocation(e.getX(), e.getY() - label.getBounds().height);
				
			}
		});
	}

}

public class EventListenerEx5 {
	public static void main(String[] args) {
		new MyFrame5();
	}
}
