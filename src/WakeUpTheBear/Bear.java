package WakeUpTheBear;

public class Bear implements Runnable {
	Thread[] threads;

	public Bear() {

	}

	public Bear(Thread... threads) {
		this.threads = new Thread[threads.length];
	}

	public void wakeUpAllOtherBears()
	{
		for (Thread thread : threads)
		{
			// checking if the thread is sleeping
			// HOW CAN A THREAD BE NULL?
			if (thread != null && thread.getState() == Thread.State.TIMED_WAITING)
				thread.interrupt();
		}
	}

	@Override
	public void run() {
		try
		{
			System.out.println("The bear goes to sleep");
			Thread.sleep(100000);
		} catch (InterruptedException e)
		{
//			e.printStackTrace();
			wakeUpAllOtherBears();
			System.out.println("The bear woke up himself and woke up all other bears, the man is really fucked");
		}
	}
}
