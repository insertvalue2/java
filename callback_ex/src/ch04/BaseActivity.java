package ch04;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BaseActivity extends JFrame {
	
	String name; 
	JPanel panel;
	
	public BaseActivity(String name) {
		this.name = name; 
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle(this.name);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel = new JPanel();
	}

	public void setInitLayout() {
		setVisible(true);
		add(panel);
//		panel.setBackground(Color.blue);
	}
}
