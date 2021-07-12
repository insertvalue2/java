package swing.ch04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame1 extends JFrame implements ActionListener {

	JButton button1;
	JButton button2;
	FlowLayout flowLayout;
	// 버튼 3개 추가 !! 

	public MyFrame1() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("이벤트 리스너 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		button1 = new JButton("button1");
		button2 = new JButton("button2");
		flowLayout = new FlowLayout();
	}

	private void setInitLayout() {
		this.setVisible(true);
		this.setLayout(flowLayout);
		this.add(button1);
		this.add(button2);
	}

	private void addEventListener() {
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	
	// 액션이 일어나면 여기 메서드가 실행 !! 
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Action 이 일어나면 여기 메서드에서 동작 !!! ");
		JButton clickedButton = (JButton) e.getSource();
		
		if(clickedButton.getText().equals(button1.getText())) {
			System.out.println("1번 버튼이 클릭 되었습니다.");
		} else {
			System.out.println("2번 버튼이 클릭 되었습니다.");
		}
//		System.out.println(clickedButton.getText());
//		clickedButton.setText("클릭 되었습니다.");
	}

}

/////////////////////////////////////////////////////////////////
public class MainTest1 {

	public static void main(String[] args) {
		new MyFrame1();

	}

}
