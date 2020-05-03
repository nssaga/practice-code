package nssaga.advance.thread.problem;

/**
 * Write a multi thread program to print even odd in sequence using synchronization.
 */
public class EvenOdd {
	public volatile int num = 0;
	public int count = 0; // increase through sync

	public static void main(String[] args) throws InterruptedException {
		EvenOdd e = new EvenOdd();
		// Ex1 using sync
		Thread tex1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.print("Thread 1 -> ");
				e.print();
			}
		});
		tex1.start();

		Thread tex2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.print("Thread 2 -> ");
				e.print();
			}
		});
		tex2.start();
	}

	public void print() {
		synchronized (this) {
			System.out.println(count++);
		}
	}

	public void printEvenNum() throws InterruptedException {
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				wait();
				System.out.println("Even - " + num);
				num++;
				notify();
			}
		}
	}

	public void printOddNum() throws InterruptedException {
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				notify();
				System.out.println("Odd - " + num);
				num++;
				wait();
			}
		}
	}

}

class EvenOddThread1 implements Runnable {

	@Override
	public void run() {
		EvenOdd e = new EvenOdd();
		try {
			e.printOddNum();
		} catch (InterruptedException e1) {
			System.err.println("Thread2 Interrupted");
		}
	}
}

class EvenOddThread2 implements Runnable {

	@Override
	public void run() {
		EvenOdd e = new EvenOdd();
		try {
			e.printEvenNum();
		} catch (InterruptedException e1) {
			System.err.println("Thread2 Interrupted");
		}
	}
}
