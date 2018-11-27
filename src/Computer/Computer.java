package Computer;

public class Computer {
	public static void main(String[] args) {

		Program progWin = new Program("Windows", "Win Update", 30);
		Program progCC = new Program("CCleaner", "AVG Update", 5);
		Program progJava = new Program("Java", "FBack Update", 3);
		Program progSkype = new Program("Skype", "Skype Update", 17);
		Mailbox mailBox = new Mailbox(20);

		Thread winUpThread = new Thread(progWin);
		Thread ccUpThread = new Thread(progCC);
		Thread javaUpThread = new Thread(progJava);
		Thread skypeMsgThread = new Thread(progSkype);

		// NOTE: since this thread has to wait for other threads to finish, it will be instantiated last
		Thread mailUpThread = new Thread(mailBox);


		System.out.println("Computer power in ON!");
		winUpThread.start();
		ccUpThread.start();
		javaUpThread.start();
		skypeMsgThread.start();
		mailUpThread.start();
	}
}
