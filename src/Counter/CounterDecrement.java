package Counter;

public class CounterDecrement implements Runnable {
	Counter counter;
	private int updates;

	public CounterDecrement(Counter counter, int updates) {
		this.counter = counter;
		this.updates = updates;
	}

	@Override
	public void run() {
		for (int i = 0; i < updates; i++)
			counter.decrement();
	}
}
