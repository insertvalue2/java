package ch04;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


class MyFrame5_1 extends JFrame {
	
//	JButton button1;
//	ImageIcon ii = new ImageIcon("among1.png");
	
	ImagePanel imagePanel;
	
	class ImagePanel extends JPanel {
		// Ctrl + Shift + O
		private Image image;
		
		public ImagePanel() {
			image = new ImageIcon("among1.png").getImage();
		}

		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawImage(image, 0, 0, 100, 100, null);
		}
	}
	
	public MyFrame5_1() {
		initData();
		setInitLayout();
		addEventListener();
	}
	
	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		button1 = new JButton();
//		button1.setSize(100, 100);
//		button1.setLocation(100, 100);
		
		imagePanel = new ImagePanel();
		imagePanel.setSize(100, 100);
		imagePanel.setLocation(200, 200);
		
	}
	
	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
	}
	
	private void addEventListener() {
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				add(imagePanel);
				repaint();
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
	}
	
	
}


public class EventListenerEx5_1 {

	public static void main(String[] args) {
		new MyFrame5_1();

	}

}
