package Computer;

import static java.lang.Thread.sleep;

public class Mailbox implements Runnable {
	private int count;
	private static long RUNTIME;
	private static long maxFrequency;

	public Mailbox(int count) {
		this.count = count;
		RUNTIME = 100000;
		maxFrequency = RUNTIME / count;
	}

	private synchronized void waitingForMails() throws InterruptedException {
		for (int i = 0; i < count; i++)
		{
			System.out.println("New mail in your box...");
			sleep(maxFrequency);
		}
		// notify all threads that the required task has been completed and they can continue updating
		notifyAll();
	}

	@Override
	public void run() {
		try
		{
			waitingForMails();
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
