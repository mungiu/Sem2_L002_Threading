package Computer;

public class Program implements Runnable {
	private String action;
	private String program;
	private int count;
	private static long RUNTIME;

	public Program(String program, String action, int count) {
		this.action = action;
		this.program = program;
		this.count = count;
		RUNTIME = 100000;
	}

	public synchronized void normalOperation() throws InterruptedException {
		System.out.println(action);
		Thread.sleep(RUNTIME/count);
	}

	@Override
	public void run() {
		for (int i = 0; i < count; i++)
		{
			try
			{
				normalOperation();
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
