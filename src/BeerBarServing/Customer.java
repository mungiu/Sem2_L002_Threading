package BeerBarServing;

import java.util.Random;

public class Customer implements Runnable {
	Bar bar;
	int timePeriod;

	public Customer(Bar bar) {
		this.bar = bar;
	}

	public void takeBeer() {
		synchronized (bar)
		{
			timePeriod = new Random().nextInt(11158);
			bar.takeBeer();
			try
			{
				Thread.sleep(timePeriod);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

	@Override
	public synchronized void run() {
		while (true) takeBeer();
	}
}
