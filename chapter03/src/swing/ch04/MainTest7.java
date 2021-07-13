package swing.ch04;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame7 extends JFrame implements KeyListener  {
	
	BufferedImage backgroundImage; 
	BufferedImage imageIcon; 
	MyImagePanel myImagePanel; 
	JButton button1;
	int xPoint = 200; 
	int yPoint = 200; 
	
	public MyFrame7() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setTitle("이미지 백그라운드 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			imageIcon = ImageIO.read(new File("among1.png"));
		} catch (IOException e) {
			System.out.println("파일이 없습니다.");
			
			System.exit(0);
		} 
		myImagePanel = new MyImagePanel();
	}
	
	private void setInitLayout() {
		this.setVisible(true);
		this.setResizable(false);
		this.add(myImagePanel);
	}
	
	private void addEventListener() {
		this.addKeyListener(this);
	}
	
	
	private class MyImagePanel extends JPanel {
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(imageIcon, xPoint, yPoint, 100, 100, null);
			System.out.println("paintComponent  실행 ");
		}
	} // end of MyImagePanel (내부 클래스)


	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if (keyCode == KeyEvent.VK_UP) {
			//yPoint = (yPoint < 0) ? 0 :  yPoint - 10; 
		} else if (keyCode == KeyEvent.VK_DOWN) {
			yPoint += 10;
		} else if (keyCode == KeyEvent.VK_LEFT) {
			xPoint -= 10; 
		} else if (keyCode == KeyEvent.VK_RIGHT)  {
			xPoint += 10; 
		}
		repaint();
		
	}
	
} // end of MyFrame2 class 

/////////////////////////////////////////////////////////////////////
public class MainTest7 {
	public static void main(String[] args) {
		new MyFrame7();
	}
}
