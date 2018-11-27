package Turtle_Rabit_Race;

public class Main {
	public static void main(String[] args) {
		Thread tThread = new Thread(new Turtle());
		Thread rThread = new Thread(new Rabbit());

		tThread.start();
		rThread.start();
	}
}
