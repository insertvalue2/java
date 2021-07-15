package swing.ch04;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame4 extends JFrame {

	JLabel label;
	Container container; 
	
	public MyFrame4() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("마우스 이벤트");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("Hello");
		label.setSize(100, 100);
		container = getContentPane();
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
		add(label);
		label.setLocation(12, 39);
	}
	
	private void addEventListener() {
		this.addMouseListener(new MouseListener() {
			
			// 마우스가 떨어졌을 때 실행되는 메서드 
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			// 마우스가 눌러 졌을때 실행되는 메서드
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			// 마우스가 나갔을때 실행되는 메서드 
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			// 마우스가 들어 왔을때 실행되는 메서드 
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			// 마우스가 클릭되었을때 실행되느 메서드 
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getX() + " : x 좌표 값");
				System.out.println(e.getY() + " : y 좌표 값 ");
				label.setLocation(e.getX(), e.getY());
			}
		});
	}

}
/////////////////////////////////////////////////////
public class MainTest4 {

	public static void main(String[] args) {
		new MyFrame4();
	}

}
