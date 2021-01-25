package thread;

// public class ThreadOne extends Thread {

public class ThreadOne implements Runnable {

	@Override
	public void run() {
		printNumber();
	}
	
	public synchronized void printNumber() {
		for (int i = 1; i <=10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);			
		}
		
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
