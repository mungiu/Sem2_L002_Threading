package Counter;

public class Main {
	public static void main(String[] args) {
		Counter counter = new Counter(10000, 100);
		CounterIncrement counterInc1 = new CounterIncrement(counter, 200);
		CounterIncrement counterInc2 = new CounterIncrement(counter, 200);

		CounterDecrement counterDec1 = new CounterDecrement(counter, 200);
		CounterDecrement counterDec2 = new CounterDecrement(counter, 200);

		new Thread(counterInc1).start();
		new Thread(counterInc2).start();
		new Thread(counterDec1).start();
		new Thread(counterDec2).start();
	}
}

////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////// NOTE: After using the main thread for a task it becomes busy			 	///////
///////////////////// NOTE: Always try to avoid using the main thread 							///////
///////////////////// NOTE: .run() will execute the runnable class on the main thread, always		///////
///////////////////// NOTE: .start() will execute the runnable class on the passed in thread		///////
///////////////////// NOTE: Using LAMBDA expression will ost likely make thread behave unexpectedly ////
///////////////////// NOTE: synchronize methods that the thread is accessing not at lower levels ///////
///////////////////// NOTE: remember to call Thread.sleep() per method VS per class				///////
////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////// 		E X A M P L E S			//////////////////////////////////
