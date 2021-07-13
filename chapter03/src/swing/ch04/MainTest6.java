package swing.ch04;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

class MyFrame6 extends JFrame implements KeyListener {
	
	private JTextArea area;
	public MyFrame6() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("키 이벤트 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		area = new JTextArea();
	}
	
	private void setInitLayout() {
		setVisible(true);
		add(area);
	}
	
	private void display(KeyEvent e) {
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
//		System.out.println(" c : " + c);
//		System.out.println(" keyCode : " + keyCode);
//		area.setText(c + " : " + keyCode);
		area.append("\n" + c + " : " + keyCode);
	}
	
	private void addEventListener() {
		// 1. 익명 클래스로 변경하기 
		// 2. (주석이후)  내부 클래스 선언. KeyAdapter 클래스 사용 
		area.addKeyListener(this);
	}
	
	// 문자를 눌렀을 때 호출, 문자키에만 반응합니다.
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	// 키보드를 눌렀을 때 호출, 모든 키보드에 반응합니다.
	@Override
	public void keyPressed(KeyEvent e) {
		display(e);
	}

	// 키보드를 땟을 때 호출, 모든 키보드에 반응합니다.
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}


//////////////////////////////////////
public class MainTest6 {

	public static void main(String[] args) {
		new MyFrame6();

	}

}
