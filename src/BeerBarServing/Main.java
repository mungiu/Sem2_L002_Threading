package BeerBarServing;

public class Main {
	public static void main(String[] args) {
		Bar bar = new Bar();
		Customer cust1 = new Customer(bar);
		Customer cust2 = new Customer(bar);
		Customer cust3 = new Customer(bar);
		Customer cust4 = new Customer(bar);

		Bartender bart1 = new Bartender(bar);
		Bartender bart2 = new Bartender(bar);
		Bartender bart3 = new Bartender(bar);
		Bartender bart4 = new Bartender(bar);

		new Thread(bar).start();

		new Thread(bart1).start();
		new Thread(bart2).start();
		new Thread(bart3).start();
		new Thread(bart4).start();

		new Thread(cust1).start();
		new Thread(cust2).start();
		new Thread(cust3).start();
		new Thread(cust4).start();
	}
}
