package BeerBarServing;

import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class Bar implements Runnable
{
	private int maxBeersOnTable = 20;
	private final ArrayList<Beer> beerList = new ArrayList<>(maxBeersOnTable);
	boolean barIsOpen = true;

	public void placeBeer(Beer beer)
	{
		{
			if (barIsOpen == true & beerList.size() == maxBeersOnTable)
			{
				try
				{
					barIsOpen = false;
					wait();
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			else if (barIsOpen == true)
			{
				beerList.add(beer);
				notifyAll();
				System.out.println("Beer placed NOTIFICATION");
			}
		}
	}

	public void takeBeer()
	{
		{
			if (barIsOpen == true & beerList.size() > 0)
			{
				beerList.remove(0);
				System.out.println("Beer Sold");
			}
			else
			{
				System.out.println("!!! CLOSED !!!");
			}
		}
	}

	@Override
	public void run()
	{
		int i = 0;
		try
		{
			for (i = 0; i < 6000000; i++)
				sleep(1000);
			if (i == 6000000)
				synchronized (this)
				{
					barIsOpen = false;
				}
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
// hashes the object
		beerList.hashCode();
	}
}

