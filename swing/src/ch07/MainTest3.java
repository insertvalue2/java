package ch07;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



class MainFrame extends JFrame {
	MainFrame() {

		setTitle("gif 사용해보기");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel textLabel = new JLabel("펭하 입니다");
		ImageIcon img = new ImageIcon("img.gif");
		JLabel imageLabel = new JLabel(img);
		c.add(textLabel);
		c.add(imageLabel);
		setSize(500, 500);
		setVisible(true);
	}

}

public class MainTest3 {

	public static void main(String[] args) {
		new MainFrame();
	}
}
