package swing.ch04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame3 extends MyFrame2 {

	@Override
	protected void addEventListener() {
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
		new MyFrame3();
	}
}
