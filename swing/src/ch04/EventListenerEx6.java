package ch04;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

class MyFrame6 extends JFrame {

	public MyFrame6() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("어댑터 클래스 이용");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
	}

	private void setInitLayout() {
		setVisible(true);
		setResizable(false);
	}

	private void addEventListener() {
		this.addMouseListener(new MyMouseListener());
	}

	// 내부 클래스 생성 (MouseAdapter 추상 클래스 보여주기 )
	private class MyMouseListener extends MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			System.out.println("x : " + x);
			System.out.println("y : " + y);
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


public class EventListenerEx6 {
	
	public static void main(String[] args) {
		new MyFrame6();
	}
}
