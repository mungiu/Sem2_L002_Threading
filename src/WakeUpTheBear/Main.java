package WakeUpTheBear;

public class Main {
	public static void main(String[] args) {

		// assigning runnable to thread
		Thread tBear1 = new Thread(new Bear());
		Thread tBear2 = new Thread(new Bear());
		Thread tBear3 = new Thread(new Bear());
		Thread tBear4 = new Thread(new Bear());
		Thread tBear = new Thread(new Bear(tBear1, tBear2, tBear3, tBear4));
		Thread tMan = new Thread(new Man(tBear));

		// if any of the two runnables is ran on the main thread, sequence is not respected
		// why?

		tBear.start();
		tMan.start();

	}
}
