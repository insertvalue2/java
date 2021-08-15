package ch03;

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
	BufferedImage pinkImage;
	BufferedImage grayImage;
	CustomJpanel customJpanel;
	final int HERO_SIZE_1 = 100;

	int grayImageX = 200;
	int grayImageY = 200;
	int pinkImageX = 0;
	int pinkImageY = 400;

	public MiniAmongUs() {
		initData();
		setInitLayout();
		addEventListener();
		Thread thread = new Thread(customJpanel);
		thread.start();
	}

	private void initData() {
		setTitle("미니어몽어스");
		setSize(600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			pinkImage = ImageIO.read(new File("among1.png"));
			grayImage = ImageIO.read(new File("among2.png"));
		} catch (IOException e) {
			System.out.println("파일을 찾지 못했습니다.");
		}
		//
		customJpanel = new CustomJpanel();
	}

	private void setInitLayout() {
		setVisible(true);
		setResizable(false);
		add(customJpanel);
	}

	public void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();

				if (code == KeyEvent.VK_UP) {
					grayImageY -= 10;
				} else if (code == KeyEvent.VK_DOWN) {
					grayImageY += 10;
				} else if (code == KeyEvent.VK_LEFT) {
					grayImageX -= 10;
				} else if (code == KeyEvent.VK_RIGHT) {
					grayImageX += 10;
				}
				// 필수!! (이미지를 다시 그려라)
				repaint();
			}
		});

	}

	// 내부 클래스
	private class CustomJpanel extends JPanel implements Runnable {
		boolean flag = true; 
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), null);
			g.drawImage(pinkImage, pinkImageX, pinkImageY, HERO_SIZE_1, HERO_SIZE_1, null);
			g.drawImage(grayImage, grayImageX, grayImageY, HERO_SIZE_1, HERO_SIZE_1, null);
		}

		private void checkHeroPosition() {
//			System.out.println("pinkImageX " + pinkImageX);
//			System.out.println("pinkImageY " + grayImageY);
//			System.out.println("grayImageX " + grayImageX);
//			System.out.println("grayImageY " + grayImageY);
			 if((pinkImageX == grayImageX)  && (pinkImageY == grayImageY)) {
				 System.out.println("x, y 좌표값이 같음 !!");
				 pinkImage = null;
				 flag = false; 
			 }
//			 if ((pinkImageY == grayImageY)) {
//				 System.out.println("y 좌표 값이 같음 !! ");
//			 }
		}
		
		@Override
		public void run() {
			boolean direction = true;
			while (flag) {
//			while (true) {
				if (direction) {
					pinkImageX += 10;
				} else {
					pinkImageX -= 10;
				}
				
				if (pinkImageX == 500) {
					direction = false;
				}
				
				if (pinkImageX == 0) {
					direction = true;
				}
				
				repaint();
				checkHeroPosition(); 
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}// end of run

	} // end of inner class

} // end of class

public class MainTest1 {
	public static void main(String[] args) {
		new MiniAmongUs();
	}
}
