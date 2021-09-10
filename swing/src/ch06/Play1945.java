package ch06;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Play1945 extends JFrame {
	
	BufferedImage bgImage1; 
	BufferedImage bgImage2; 
	ImagePanel imagePanel;
	final int WIDTH_SIZE = 600; 
	int bgx1;  
	int bgx2;  
	
	public Play1945() {
		initData();
		setInitLayout();
		addEventListener();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					bgx1--; 
					bgx2--; 
				
					if(bgx1 < -WIDTH_SIZE) {
						bgx1 = WIDTH_SIZE;
					}
					
					if(bgx2 < -WIDTH_SIZE) {
						bgx2 = WIDTH_SIZE;
					}
					
					repaint(); 
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
	
	private void initData() {
		setSize(WIDTH_SIZE, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		try {
			bgImage1 = ImageIO.read(new File("background_1.png"));
			bgImage2 = ImageIO.read(new File("background_1.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		imagePanel = new ImagePanel();
		
	}
	
	private void setInitLayout() {
		setVisible(true);
		add(imagePanel);
	}
	
	private void addEventListener() {
		
	}
	
	private class ImagePanel extends JPanel {
		
		public ImagePanel() {
			bgx1 = 0; 
			bgx2 = WIDTH_SIZE; 
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g); // 캔버스를 비워주는 메서드 
			g.drawImage(bgImage1, bgx1, 0, WIDTH_SIZE, 600, null);
			g.drawImage(bgImage2, bgx2, 0, WIDTH_SIZE, 600, null);
		}
	}
	
	public static void main(String[] args) {
		new Play1945();
	}
	
}
