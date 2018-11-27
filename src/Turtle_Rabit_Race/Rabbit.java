package Turtle_Rabit_Race;

import java.util.Random;

public class Rabbit implements Runnable {


	public Rabbit() {

	}

	public void count() throws InterruptedException {
		for (int i = 0; i < 1000; i++)
		{
			// used to generate a random number
			Random r = new Random();
			// generated random number of milliseconds
			int x = r.nextInt(1000);

			// if rabbit is 50 counts ahead, random sleep time
			if (RaceJudge.getrCount() - RaceJudge.gettCount() > 50)
				Thread.sleep(x);
				// rabbit will run if turtle didn't win yet
			else if (RaceJudge.gettCount() < 1000)
			{
				RaceJudge.incrCount();
				System.out.println("Rabbit ran till: " + RaceJudge.getrCount());
			}
			if (RaceJudge.getrCount() == 1000)
			{
				System.out.println("Rabbit won!");
				System.exit(0);
			}
		}
	}

	@Override
	public void run() {
		try
		{
			count();
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}

	}
}
