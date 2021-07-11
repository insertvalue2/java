package swing.ch00;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

class FlowLayoutEx extends JFrame {

	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private FlowLayout flowLayout;

	public FlowLayoutEx() {
		initData();
		setInitLayout();
	}

	private void initData() {
		this.setTitle("Flow Layout");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 400);
		flowLayout = new FlowLayout(FlowLayout.CENTER, 10, 100);
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
	}

	public void setInitLayout() {
		this.setVisible(true);
		this.setLayout(flowLayout);
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
	}
}

public class LayoutEx01 {

	public static void main(String[] args) {
		FlowLayoutEx layoutEx = new FlowLayoutEx();

	}

}
