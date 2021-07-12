package swing.ch02;

import java.util.Scanner;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyComponents extends JFrame {

	private JPanel jPanel1;
	private JButton button1;
	private JLabel jLabel1;
	JTextField jTextField;
	private JCheckBox cbox1;

	public MyComponents() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("컴포넌트연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 800);
		jPanel1 = new JPanel();
		button1 = new JButton("button");
		jLabel1 = new JLabel();
		jTextField = new JTextField("", 20);
		cbox1 = new JCheckBox("JCheckBox 1", true);
	}

	private void setInitLayout() {
		this.setVisible(true);
		this.add(jPanel1);

		jPanel1.add(button1);
		jPanel1.add(jLabel1);
		jPanel1.add(jTextField);
		jPanel1.add(cbox1);

	}

}

public class JPanelMainTest {

	public static void main(String[] args) {
		MyComponents mc = new MyComponents();

		// 글자 입력
		System.out.println("글자를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		// 콘솔창에서 글자 입력
		String userInput = sc.next();

		// jTextField 입력 글자 전달
		mc.jTextField.setText(userInput);

	}

}
