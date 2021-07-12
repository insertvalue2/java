package ch01;


public class ComputerTest {

	public static void main(String[] args) {

		Computer computer = new DeskTop();
		computer.turnOn();
		computer.display();
		computer.turnOff();
		

		System.out.println("==========");
		NoteBook myNote = new MyNoteBook();
		myNote.turnOn();
		myNote.display();
		myNote.turnOff();
		

	}

}
