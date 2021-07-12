package swing.ch03;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ImagePanel extends JPanel {
	// Ctrl + Shift + O
	private Image image;

	public ImagePanel() {
		image = new ImageIcon("image1.jpg").getImage();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
	}
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class MyFrame extends JFrame {

	private ImagePanel imagePanel;

	public MyFrame() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("JPanel 에 이미지 넣기");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new ImagePanel();
	}

	private void setInitLayout() {
		setVisible(true);
		add(imagePanel);
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class MainTest1 {
	public static void main(String[] args) {
		new MyFrame();
	}
}
