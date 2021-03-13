package nssaga.beginner.thread;

/**
 * Increase counter value by one using two thread and print the value.
 */
public class Ex03Sync2 {
	private int count = 0;

	public static void main(String[] args) throws InterruptedException {
		Ex03Sync2 ex = new Ex03Sync2();
		ex.doWork();
	}

	public synchronized void increment() {
		System.out.println(count);
		count++;
	}

	public void doWork() throws InterruptedException {

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					increment();
				}
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				increment();
			}
		});

		t1.start();
		t2.start();

		// Join should be after start
		t1.join();
		t2.join();

		System.out.println(count);
	}

}
