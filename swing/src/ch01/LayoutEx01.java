package ch01;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

class FlowLayoutEx extends JFrame {

	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private FlowLayout flowLayout;

	public FlowLayoutEx() {
		initData();
		setInitLayout();
	}

	private void initData() {
		this.setTitle("Flow Layout");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		flowLayout = new FlowLayout(FlowLayout.CENTER, 10, 10);
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
	}

	public void setInitLayout() {
		this.setVisible(true);
		this.setLayout(flowLayout);
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.add(button6);
		this.add(button7);
	}
}

public class LayoutEx01 {

	public static void main(String[] args) {
		FlowLayoutEx layoutEx = new FlowLayoutEx();

	}

}
