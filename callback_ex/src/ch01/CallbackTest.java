package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// 인터페이스를 선언한다. 
interface CallbackBtnAction {
	public abstract void clickedAddBtn();
	public void clickedMinusBtn();
	// 매개변수 전달 (값 , object 가능) 
	public void passValue(int value);
	
}

// 콜백 받는 객체 : CallbackBtnAction 인터페이스를 구현해서 메서드를 정의 한다. 
class MainActivity extends JFrame implements CallbackBtnAction {
	int count;
	JLabel label;
	SubActivity subActivity; 
	
	public MainActivity() {
		count = 0;
		label = new JLabel(count + "");
		setSize(300, 300);
		setLayout(new FlowLayout());
		setVisible(true);
		add(label);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// SubActivity 생성시에 MainActivity 주소값을 등록 한다. 
		subActivity = new SubActivity(this);
	}


	@Override
	public void clickedAddBtn() {
		System.out.println(" + 콜백 받았습니다.");
		count++; 
		label.setText(count + "");
	}

	@Override
	public void clickedMinusBtn() {
		System.out.println(" - 콜백 받았습니다.");
		count--; 
		label.setText(count + "");
	}

	@Override
	public void passValue(int value) {
		label.setText("매개변수로 값 전달 받음 : " + value);		
	}
}

class SubActivity extends JFrame implements ActionListener {

	JButton btnAdd; 
	JButton btnMinus;
	CallbackBtnAction callbackBtnAction; 
	// 
	JButton btnValue; 
	
	// 콜리(호출자) : 콜백 받는 객체의 주소값을 알고 있어야 메서드가 호출 되었다고 알릴 수 있다.  
	public SubActivity(CallbackBtnAction callbackBtnAction) {
		// 중요! 
		this.callbackBtnAction = callbackBtnAction;
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		btnAdd = new JButton("더하기 버튼");
		btnMinus = new JButton("마이너스 버튼");
		btnValue = new JButton("값 전달하기 ");
		
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		add(btnAdd);
		add(btnMinus);
		add(btnValue);
		
		btnAdd.addActionListener(this);
		btnMinus.addActionListener(this);
		btnValue.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton targetBtn = (JButton)e.getSource(); 
		if(targetBtn.getText().equals(btnAdd.getText())) {
			System.out.println("더하기버튼 클릭");
			callbackBtnAction.clickedAddBtn();
		} else if(targetBtn.getText().equals(btnMinus.getText())) {
			System.out.println("마이너스버튼 클릭");
			callbackBtnAction.clickedMinusBtn();
		} else {
			int tempValue = 100; 
			callbackBtnAction.passValue(tempValue);
		}
	} 
}

public class CallbackTest {
	public static void main(String[] args) {
		new MainActivity();
	}
}
