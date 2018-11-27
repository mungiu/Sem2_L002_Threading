public class Numbers implements Runnable {

	int max = 10;

	public Numbers() {
	}

	public Numbers(int max)
	{
		this.max = max;
	}

	@Override
	public void run() {
		while (true)
			for (int i = 0; i < max; i++)
				System.out.println(i);
	}
}
