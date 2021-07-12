package swing.ch04;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame5 extends JFrame {
	JLabel label;
	Container container;

	public MyFrame5() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("어댑터 클래스 이용");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		label = new JLabel("AdapterClass");
		label.setSize(100, 100);
		label.setLocation(200, 200);
		container = getContentPane();
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
		add(label);
	}

	private void addEventListener() {
		container.addMouseListener(new MyMouseListener());
	}

	// 내부 클래스 생성 (MouseAdapter 추상 클래스 보여주기 )
	private class MyMouseListener extends MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			label.setLocation(x, y);
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			System.out.println("마우스가 root Container 안으로 들어 왔습니다.");
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			System.out.println("마우스가 나갔습니다. ");
		}
	
	}

}

public class MainTest5 {

	public static void main(String[] args) {
		new MyFrame5();
	}

}
