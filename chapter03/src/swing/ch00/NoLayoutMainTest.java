package swing.ch00;

import javax.swing.JButton;
import javax.swing.JFrame;

class NoLayoutEx01 extends JFrame {

	private JButton button1;
	private JButton button2;
	private JButton button3;

	public NoLayoutEx01() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("No Layout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
	}

	private void setInitLayout() {
		// setLayout 사용 안함. 직접 위치 지정
		this.setLayout(null);
		
		// 버튼에 크기를 직접 지정해야 나온다. 
		button1.setSize(50, 50);
		button2.setSize(50, 50);
		button3.setSize(50, 50);

		button1.setLocation(10, 10);
		button2.setLocation(100, 100);
		button3.setLocation(200, 200);

		this.add(button1);
		this.add(button2);
		this.add(button3);
		setVisible(true);

	}

}

public class NoLayoutMainTest {

	public static void main(String[] args) {
		new NoLayoutEx01();

	}

}
