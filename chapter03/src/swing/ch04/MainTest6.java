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
		area.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		display(e);
	}

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
