package ch02;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MiniAmongUs extends JFrame {

	BufferedImage backgroundImage;
	BufferedImage amongImage1;
	BufferedImage amongImage2;
	CustomJPanel customPanel;
	
	int among1XPoint = 0;
	int among1YPoint = 370;
	int among2XPoint = 200;
	int among2YPoint = 200;
	
	public MiniAmongUs() {
		initData();
		setInitLayout();
		addEventListener();

		Thread thread = new Thread(customPanel);
		thread.start();
	}

	private void initData() {
		setTitle("이미지 백그라운드 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			amongImage1 = ImageIO.read(new File("among1.png"));
			amongImage2 = ImageIO.read(new File("among2.png"));
		} catch (IOException e) {
			System.out.println("파일이 없습니다.");
			System.exit(0);
		}
		// 내부 클래스 생성
		customPanel = new CustomJPanel();
	}

	private void setInitLayout() {
		this.setVisible(true);
		this.setResizable(false);
		this.add(customPanel);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				switch (code) {
				case KeyEvent.VK_UP:
					among2YPoint -= 10;
					break;
				case KeyEvent.VK_DOWN:
					among2YPoint += 10;
					break;
				case KeyEvent.VK_LEFT:
					among2XPoint -= 10;
					break;
				case KeyEvent.VK_RIGHT:
					among2XPoint += 10;
					break;
				}
			}
		});
	}

	private class CustomJPanel extends JPanel implements Runnable {

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(amongImage1, among1XPoint, among1YPoint, 100, 100, null);
			g.drawImage(amongImage2, among2XPoint, among2YPoint, 100, 100, null);
		}

		@Override
		public void run() {
			boolean direcation = true;
			while (true) {
				
				if (direcation) {
					among1XPoint = among1XPoint + 10;
				} else {
					among1XPoint = among1XPoint - 10;
				}

				if (among1XPoint == 400) {
					direcation = false;
				}

				if (among1XPoint == 0) {
					direcation = true;
				}
				
				if((among1XPoint == among2XPoint) && (among1YPoint == among2YPoint) ) {
					amongImage2 = null; 
					System.out.println("충돌");
				}
				repaint();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	} // end of MyImagePanel (내부 클래스)
	
} // end of class

/////////////////////////////////////////////////////////////////////
public class MainTest2 {
	public static void main(String[] args) {
		new MiniAmongUs();
	}
}
