package ThreadSerialism_join;

public class Main {
	public static void main(String[] args) {

		Thread t1 = new Thread(new Count(0, 25));
		Thread t2 = new Thread(new Count(26, 50, t1));
		Thread t3 = new Thread(new Count(51, 75, t2));
		Thread t4 = new Thread(new Count(76, 100, t3));

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
