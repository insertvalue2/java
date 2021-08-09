package ch01;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

class NoLayoutEx01 extends JFrame {

	// 과제1. ArrayList 변경해 보기
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	
//	buttons.add(new JButton());
	int a;
//	a = 50 * 100;
	int b = 10 + 1;
//	int c = a + 100; 
//	b = a * b; 
	
//	private JButton button1;
//	private JButton button2;
//	private JButton button3;

	public NoLayoutEx01() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("No Layout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);

		// 현재 사이즈가 0
//		for (int i = 0; i < buttons.size(); i++) {
//			buttons.add(new JButton(i + ""));
//		}

		buttons.add(new JButton("1"));
		buttons.add(new JButton("2"));
		buttons.add(new JButton("3"));

//		for (int i = 0; i < 3; i++) {
//			buttons.add(new JButton(i + ""));
//		}

//		button1 = new JButton("1");
//		button2 = new JButton("2");
//		button3 = new JButton("3");
	}
	
	private int setupPosition(int size, int index) {
		int result = (index + 1) * size;
		return result; 
	}

	private void setInitLayout() {
		// setLayout 사용 안함. 직접 위치 지정
		this.setLayout(null);

		// 버튼에 크기를 직접 지정해야 나온다.
		for (int i = 0; i < buttons.size(); i++) {
			buttons.get(i).setSize(50, 50);
			buttons.get(i).setLocation(50 * i, 50 * i );
//			buttons.get(i).setLocation(setupPosition(50, i), setupPosition(50, i));
			this.add(buttons.get(i));
		}

//		JButton button = buttons.get(1); 
//		button1.setSize(50, 50);
//		button2.setSize(50, 50);
//		button3.setSize(50, 50);

//		buttons.get(0).setLocation(10, 10);
//		buttons.get(1).setLocation(100, 100);
//		buttons.get(2).setLocation(200, 200);

//		this.add(buttons.get(0));
//		this.add(buttons.get(1));
//		this.add(buttons.get(2));

		setVisible(true);

	}
}

public class NoLayoutMainTest {
	public static void main(String[] args) {
		new NoLayoutEx01();
	}
}
