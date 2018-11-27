package Turtle_Rabit_Race;

public class Turtle implements Runnable {

	public void count() throws InterruptedException {
		for (int i = 0; i < 1000; i++)
		{
			// turtle will run only if rabbit didnt win yet.
			if (RaceJudge.getrCount() < 1000)
			{
				RaceJudge.inctCount();
				System.out.println("Turtle moved till: " + RaceJudge.gettCount());
			}
			if (RaceJudge.gettCount() == 1000)
			{
				System.out.println("Turtle won!");
				System.exit(0);
			}

			Thread.sleep(10);
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
