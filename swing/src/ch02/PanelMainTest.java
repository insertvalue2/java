package ch02;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel {

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawString("안녕하세요 Java2D Test~!", 10, 20);
		g.drawLine(20, 30, 100, 100); // 선을긋다 x 축 y축
		g.drawRect(100, 100, 150, 150); // 사각형
	}
} // end of MyPanal (블록 범위 조심) 

///////////////////////////////////////////////////////////
class MyFrame extends JFrame {
    
	MyPanel panel;

	public MyFrame() {
		initData();
		setInitLayout();
	}

	private void initData() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("java2D Test");
		this.setSize(800, 800);
		panel = new MyPanel();
	}

	private void setInitLayout() {
		this.setVisible(true);

		this.add(panel);
	}

	// 내부 클래스
//	private class MyPanel extends JPanel {
//		@Override
//		public void paint(Graphics g) {
//			super.paint(g);
////			g.drawString("안녕하세요 Java2D Test~!", 10, 20);
////			g.drawLine(20, 30, 100, 100); // 선을긋다 x 축 y축
////			g.drawRect(100, 100, 150, 150); // 사각형
//			g.drawLine(300	, 100, 200, 200);
//			g.drawLine(300	, 100, 400, 200);
//			g.drawRect(200, 200, 200, 200);
//			
//		}
//	}

}

public class PanelMainTest {
	public static void main(String[] args) {
		new MyFrame();
	}
}
