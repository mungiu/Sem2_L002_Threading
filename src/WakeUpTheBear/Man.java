package WakeUpTheBear;

public class Man implements Runnable{
	Thread thread;

	public Man(Thread tBear) {
 		this.thread = tBear;
	}

	public void wakeUpBear() {
		thread.interrupt();
		System.out.println("The man woke up the bear");
	}

	@Override
	public void run() {
		wakeUpBear();
	}
}
