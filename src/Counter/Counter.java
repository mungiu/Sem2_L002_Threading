package Counter;

public class Counter {

	private long value;
	private long max;
	private long min;

	public Counter(long max, long min) {
		this.max = max;
		this.min = min;
		value = 0;
	}

	public synchronized void increment() {
		if (value >= max)
			try
			{
				wait();
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}

		value++;
		System.out.println(value + ": Incremented by: " + Thread.currentThread().getName());
	}

	public synchronized void decrement() {
		if (value <= min)
			try
			{
				wait();
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}

		value--;
		System.out.println(value + ": Decremented by: " + Thread.currentThread().getName());
	}

	public synchronized long getValue() {

		return value;
	}
}
