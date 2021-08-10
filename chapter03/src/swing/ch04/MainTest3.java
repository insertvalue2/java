package swing.ch04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame3 extends MyFrame2 {

	@Override
	protected void addEventListener() {
		// 익명 구현 객체 
		// 구현 클래스를 만들어서 사용하는 것이 일반적이나 일회성의 구현 객체를 만들기 위해 
		// 소스 파일을 만들고 클래스를 선언하는것은 비효율적이기 때문에 자바 소스 파일을 
		// 만들지 않고도 구현 객체를 만들 수 있는 방법
		super.button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 클릭 확인");
			}
		});
	}
}

/////////////////////////////////////////////////////
public class MainTest3 {

	public static void main(String[] args) {
		// 익명 클래스 상태 이다. 
		// 메모리 공간에 객체가 생성되고 그 공간을 가리키는 인스턴스 변수가 없기 때문에 
		// 한번만 사용할 수 있다. 
		new MyFrame3();
		
		new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			}
		};
	}
}
