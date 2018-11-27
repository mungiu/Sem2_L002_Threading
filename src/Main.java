public class Main {
	public static void main(String[] args) {

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

//		// printing out a number each second using LAMBDA
//		new Thread((() -> {
//
//			int sec = 0;
//			while (true)
//			{
//				System.out.println(sec);
//				sec++;
//
//				try
//				{
//					Thread.sleep(1000);
//				} catch (InterruptedException e)
//				{
//					e.printStackTrace();
//				}
//			}
//		})).start();

//		// instantiating pre-made thread
//		// using the pre-made runnable class
//		Thread th = new Thread((new Numbers()));
//		th.start();
//
//		// instantiating a temporary thread
//		// using the pre-made runnable class
//		new Thread((new Letters())).start();
//
//		// running the pre-made runnable class on current thread
//		new Thread(new HelloPrintThread()).start();
//		new Thread(new HiPrintThread()).start();
//

//		// instantiating a temporary thread
//		// using a temporary runnable class
//		new Thread(() -> System.out.println("Bla bla")).start();
//
//		// running temporary runnable class on current thread
//		(new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("Bla bla");
//			}
//		}).run();
	}
}
