package ch04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame4 extends JFrame {
	
	// 익명 구현 객체 사용 방법 
	JButton button; 
	
	public MyFrame4() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("익명구현객체사용");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("이벤트 등록 후 대기");
	}
	
	private void setInitLayout() {
		setVisible(true);
		add(button);
	}
	
	private void addEventListener() {
		// 익명 구현 객체 
		// 일회성의 인터페이스를 익명 구현 객체로 만들어서 사용할 수 있다.    
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 클릭 됨");
			}
		});
	}
}


public class EventListenerEx4 {
	public static void main(String[] args) {
		// 익명 클래스 ( 인스턴스 변수가 없이 때문에 지속적으로 접근에서 사용할 수 없다)
		// 메모리 공간(동적 메모리)에 객체가 생성되고 인스턴스 변수가 없기 때문에 
		// 한번만 사용할 수 있다. 
		new MyFrame4();
		
		
	}
}
