package nssaga.advance.thread.problem;

/**
 * Write a thread program using tread communication to print even odd sequence.
 */
public class EvenOddUsingCommunicaton {
	public static void main(String[] args) {
		EvenOddClazz e = new EvenOddClazz();

		Runnable r1 = () -> e.even();
		Runnable r2 = () -> e.odd();

		Thread th1 = new Thread(r1);
		Thread th2 = new Thread(r2);

		th1.start();
		th2.start();
	}

}

class EvenOddClazz {
	int even = 0;
	int odd = 1;
	int count = 5;

	public void even() {
		synchronized (this) {
			for (int i = 0; i < count; i++) {
				System.out.println("Even -> " + even);
				even += 2;
				try {
					notify(); // Notify other thread on the same object to wake up
					wait(); // put to sleep the object until other thread notify
				} catch (InterruptedException e) {
					System.out.println("Thread1 interrupted");
				}
			}
			notify();
		}
		System.out.println("Even exit");

	}

	public void odd() {
		// used to sleep, so that this will not called first, we can also use thread
		// join to execute in sequence
		try {
			Thread.sleep(100);
			synchronized (this) {
				for (int i = 0; i < count; i++) {
					System.out.println("Odd -> " + odd);
					odd += 2;
					notify();
					wait();
				}
			}
		} catch (InterruptedException e) {
			System.out.println("Thread2 interrupted");
		}
		System.out.println("Odd exit");
	}
}
