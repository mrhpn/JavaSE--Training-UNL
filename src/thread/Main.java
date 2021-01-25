package thread;

public class Main {

	/**
	 * Thread Priority
	 * ---------------
	 * Thread priorities (0 to 10) and 0 is the highest.
	 */
	public static void main(String[] args) {
		Thread thread1 = new Thread(new ThreadOne());
		thread1.start();
		
		Thread thread2 = new Thread(new ThreadOne());
		thread2.start();
		
		Thread thread3 = new Thread(new ThreadOne());
		thread3.start();
		
//		ThreadOne thread2 = new ThreadOne();
//		thread2.run();
//		
//		ThreadOne thread3 = new ThreadOne();
//		thread3.run();
	}

}
