package nssaga.beginner.thread;

/**
 * ThreadLocal created per thread instances for memory efficiency and thread
 * safety. It is used when we want to initialize object differently per thread.
 * 
 * ThreadLocal variables can only be read and write by the same thread. If two
 * threads are executing the same code and that code has a reference to a
 * ThreadLocal variable then the two threads can't see the local variable of
 * each other.
 * 
 * 
 * 
 * Thread confinement Per thread, object for performance per thread context
 */
public class Ex08ThreadLocal {
	public static void main(String[] args) {

		Thread t1 = new Thread(new ThreadLocalEx());
		t1.start();

		Thread t2 = new Thread(new ThreadLocalEx());
		t2.start();
	}

}

class ThreadLocalEx implements Runnable {

	ThreadLocal<Integer> threadlocal = new ThreadLocal<>();

	@Override
	public void run() {
		threadlocal.set((int) (Math.random() * 100));
		System.out.println(threadlocal.get());
	}
}