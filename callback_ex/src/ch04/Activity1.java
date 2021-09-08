package ch04;

import java.awt.Color;

import ch03.CallbackCheckPosition;

public class Activity1 extends BaseActivity {

	CallbackCheckPosition callbackCheckPosition = new CallbackCheckPosition() {
		@Override
		public void checkPositionX(int x, int y) {
			System.out.println(name + "이 콜백 받음 x 값: " + x);
			System.out.println(name + "이 콜백 받음 y 값: " + y);
		}
	};
	
	@Override
	public void setInitLayout() {
		super.setInitLayout();
//		super.panel.setBackground(Color.blue);
	}
	
	public Activity1(String name) {
		super(name);
	}
}
