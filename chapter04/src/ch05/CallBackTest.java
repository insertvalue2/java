package ch05;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

interface MyCallBack {
	public void add();

	public void minus();

//	public void check(Boolean ck);
}

class MyPanel extends JPanel implements ActionListener {

	JButton addBtn;
	JButton minusBtn;
	MyCallBack myCallBack;

	// (콜리 : 호출할 녀셕의 주소를 알고 있어야 할 객체 - 소리쳐 !! 단 누구한테 알려야 할지 주소를 가지고 있어야 해)
	// 호출할 녀셕에 누구에게 전달 해야 할지 주소값을 알고 있어야 한다.
	public MyPanel(MyCallBack myCallBack) {
		this.myCallBack = myCallBack;
		addBtn = new JButton("더하기 버튼");
		minusBtn = new JButton("빼기 버튼");
		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		setBackground(Color.yellow);
		this.add(addBtn);
		this.add(minusBtn);

		addBtn.addActionListener(this);
		minusBtn.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		if (button.getText().equals(addBtn.getText())) {
			myCallBack.add();
		} else {
			myCallBack.minus();
//			myCallBack.check(true);
		}
	}
}

// 콜백 : MyCallBack 등록 누구인지 모르지만 add, minus 메서드가 실행되면 나에게 알려 줘 
class MyFrame extends JFrame implements MyCallBack {

	JLabel label;
	MyPanel myPanel;

	// 2 (변수에 직업  구현하는 방식 ) 
//	MyCallBack myCallBack = new MyCallBack() {
//
//		@Override
//		public void minus() {
//			// TODO Auto-generated method stub
//
//		}
//
//		@Override
//		public void check(Boolean ck) {
//			// TODO Auto-generated method stub
//
//		}
//
//		@Override
//		public void add() {
//			// TODO Auto-generated method stub
//
//		}
//	};

	public MyFrame() {
		initData();
		setInitLayot();
	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("안녕하세요");
		// 인터페이스 구현를 했기때문에 MyFrame 객체는 MyCallBack 타입으로도 바라 볼 수 있다 (다형성)
		myPanel = new MyPanel(this);
		myPanel.setPreferredSize(new Dimension(500, 300));
	}

	private void setInitLayot() {
		setVisible(true);
		setLayout(new BorderLayout());
		this.add(label, BorderLayout.NORTH);
		this.add(myPanel, BorderLayout.SOUTH);
	}

	@Override
	public void add() {
		System.out.println("더하기 버튼이 눌러졌다고 알려왔습니다.");
		label.setText("더하기 버튼이 클릭 !!!!!!");
	}

	@Override
	public void minus() {
		System.out.println("마이너스 버튼이 눌러졌다고 알려왔습니다.");
		label.setText("마이너스 버튼이 클릭 !!!!!");
	}

//	@Override
//	public void check(Boolean ck) {
//		System.out.println(ck);
//	}

}

public class CallBackTest {

	public static void main(String[] args) {
		new MyFrame();

	}

}
