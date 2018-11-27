public class Letters implements Runnable {

	int max = 10;

	public Letters() {
	}

	public Letters(int max)
	{
		this.max = max;
	}

	@Override
	public void run() {
		while (true)
			for (int i = 0; i < max; i++)
				System.out.println((char) (i + 97));
	}
}
