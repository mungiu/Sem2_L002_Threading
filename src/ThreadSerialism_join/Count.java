package ThreadSerialism_join;

public class Count implements Runnable {
	int from;
	int till;
	Thread otherThread;

	public Count(int from, int till) {
		this.from = from;
		this.till = till;
	}

	public Count(int from, int till, Thread otherThread) {
		this.from = from;
		this.till = till;
		this.otherThread = otherThread;
	}

	public void count() {
		for (int i = from; i <= till; i++)
			System.out.println(i);
	}

	@Override
	public void run() {
		// joining thread if one was specifically passed in
		if (otherThread != null)
			try
			{
				otherThread.join();
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		count();
	}
}
