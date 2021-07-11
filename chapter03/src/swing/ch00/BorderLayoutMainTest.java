package swing.ch00;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class BorderLayoutEx extends JFrame {

//	private JButton button1;
//	private JButton button2;
//	private JButton button3;
//	private JButton button4;
//	private JButton button5;

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

//		button1 = new JButton("북");
//		button2 = new JButton("센터");
//		button3 = new JButton("남");
//		button4 = new JButton("동");
//		button5 = new JButton("서");
	}

	private void setInitLayout() {
		this.setLayout(borderLayout);
		for (int i = 0; i < directions.length; i++) {
			this.add(buttons[i], directions[i]);
		}
//		this.add(button1, BorderLayout.NORTH);
//		this.add(button2, BorderLayout.CENTER);
//		this.add(button3, BorderLayout.SOUTH);
//		this.add(button4, BorderLayout.EAST);
//		this.add(button5, BorderLayout.WEST);
		this.setVisible(true);
	}

}

public class BorderLayoutMainTest {

	public static void main(String[] args) {
		new BorderLayoutEx();

	}

}
