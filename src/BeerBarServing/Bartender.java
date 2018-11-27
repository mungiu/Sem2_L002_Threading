package BeerBarServing;

public class Bartender implements Runnable {
	Bar bar;
	Beer beer;


	public Bartender(Bar bar) {
		this.bar = bar;
	}

	public void placeBeer() {
		synchronized (bar)
		{
			beer = new Beer();
			bar.placeBeer(beer);
			try
			{
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

	@Override
	public synchronized void run() {
		while (true) placeBeer();
	}
}
