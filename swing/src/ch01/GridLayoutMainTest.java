package ch01;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

class GridLayoutEx01 extends JFrame {

	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;

	public GridLayoutEx01() {
		initData();
		setInitLayout();
	}

	private void initData() {
		this.setTitle("GridLayoutEx");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 400);
		button1 = new JButton("가");
		button2 = new JButton("나");
		button3 = new JButton("다");
		button4 = new JButton("라");
		button5 = new JButton("마");
		button6 = new JButton("사");
	}

	private void setInitLayout() {
		this.setVisible(true);
		this.setLayout(new GridLayout(2, 3));
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.add(button6);
	}
}

public class GridLayoutMainTest {

	public static void main(String[] args) {
		new GridLayoutEx01();
	}

}
