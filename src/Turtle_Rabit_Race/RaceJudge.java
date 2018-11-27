package Turtle_Rabit_Race;

public class RaceJudge {
	static int tCount = 0;
	static int rCount = 0;

	public static int gettCount() {
		return tCount;
	}

	public static int getrCount() {
		return rCount;
	}

	public static void inctCount() {
		tCount++;
	}

	public static void incrCount() {
		rCount += 50;
	}
}
