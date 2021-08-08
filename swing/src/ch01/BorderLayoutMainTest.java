package ch01;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class BorderLayoutEx extends JFrame {

	private BorderLayout borderLayout;
	JButton[] buttons = new JButton[5];
	String[] titles = { "북", "센터", "남", "동", "서" };
	String[] directions = { BorderLayout.NORTH, BorderLayout.CENTER, BorderLayout.SOUTH, BorderLayout.EAST,
			BorderLayout.WEST };

	public BorderLayoutEx() {
		initData();
		setInitLayout();
	}

	private void initData() {
		this.setTitle("BorderLayout");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 400);
		borderLayout = new BorderLayout();

		for (int i = 0; i < titles.length; i++) {
			buttons[i] = new JButton(titles[i]);
		}
	}

	private void setInitLayout() {
		this.setLayout(borderLayout);
		for (int i = 0; i < directions.length; i++) {
			this.add(buttons[i], directions[i]);
		}

		this.setVisible(true);
	}

}

public class BorderLayoutMainTest {

	public static void main(String[] args) {
		new BorderLayoutEx();

	}

}
