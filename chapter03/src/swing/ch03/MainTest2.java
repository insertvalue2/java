package swing.ch03;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ex03.MyLogger;

class MyFrame2 extends JFrame {
	
	BufferedImage backgroundImage; 
	BufferedImage imageIcon; 
	MyImagePanel myImagePanel; 
	JButton button1;
	
	public MyFrame2() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("이미지 백그라운드 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try {
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			imageIcon = ImageIO.read(new File("among11.png"));
		} catch (IOException e) {
			MyLogger logger = MyLogger.getLogger();
			logger.warning(this + "" + e.toString());
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
	
	private class MyImagePanel extends JPanel {
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(imageIcon, 200, 200, 100, 100, null);
		}
	} // end of MyImagePanel (내부 클래스)
	
} // end of MyFrame2 class 

/////////////////////////////////////////////////////////////////////
public class MainTest2 {
	public static void main(String[] args) {
		new MyFrame2();
	}
}
