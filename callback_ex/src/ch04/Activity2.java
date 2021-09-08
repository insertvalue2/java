package ch04;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import ch03.CallbackCheckPosition;

public class Activity2 extends BaseActivity {

	CallbackCheckPosition checkPosition; 
	
	public Activity2(String name) {
		super(name);
		addEventListener();
	}
	
	@Override
	public void setInitLayout() {
		super.setInitLayout();
		super.panel.setBackground(Color.yellow);
	}
	
	
	private void addEventListener() {
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				//System.out.println("x : " + x);
				//System.out.println("y : " + y);
				checkPosition.checkPositionX(x, y);
			}
		});
	}
	
	public void setCallbackCheckPosition(CallbackCheckPosition callbackCheckPosition) {
		this.checkPosition = callbackCheckPosition;
	}
	
}
