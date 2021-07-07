package ch03;

public class MainTest1 {
	
	public static void main(String[] args) {
		
		RemoteControl[] remote = new RemoteControl[2];
		
		remote[0] = new Televison();
		remote[1] = new Refrigerator(); 
		
		for(int i = 0; i < remote.length; i++) {
			remote[i].turnOn();
		}
		
		System.out.println("==========");
		
		for(int i = 0; i < remote.length; i++) {
			remote[i].turnOff();
		}
	}
}
