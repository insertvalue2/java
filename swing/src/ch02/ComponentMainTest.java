package ch02;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class MyComponents extends JFrame {

	private JPanel panel;
	private JButton button;
	private JLabel label;
	JTextField textField;
	private JPasswordField pwField;
	private JCheckBox checkBox;
	
	public MyComponents() {
		initData();
		setInitLayout();
	}

	private void initData() {
		this.setTitle("컴포넌트연습");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 800);

		panel = new JPanel();
//		panel.setPreferredSize(this.getSize());
		// 풀이 
//		Dimension frameSize = this.getSize();
//		System.out.println(frameSize.width);
//		System.out.println(frameSize.height);
		
		button = new JButton("button");
		label = new JLabel();
		textField = new JTextField("", 20);
		pwField = new JPasswordField(20);
		checkBox = new JCheckBox("checkBox", true);
	}

	private void setInitLayout() {
		this.setVisible(true);
		this.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

		this.add(panel);

		panel.setBackground(Color.yellow);
		panel.add(button);
		panel.add(label);
		panel.add(textField);
		panel.add(pwField);
		panel.add(checkBox);
	}

}

//////////////////////////////////////////////////////////////////////////////
public class ComponentMainTest {

	public static void main(String[] args) {
		MyComponents mc = new MyComponents();
		// 글자 입력
		System.out.println("글자를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		// 콘솔창에서 글자 입력
		String userInput = sc.nextLine();

		// jTextField 입력 글자 전달
		mc.textField.setText(userInput);
		
	}
}
