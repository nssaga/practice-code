package nssaga.beginner.thread;

public class Ex06Deadlock1 {
	public static void main(String[] args) {
		Test t = new Test();
		Thread th = new Thread(t);

		th.start();
		// Thread acquires lock on myRunnable object so "Before wait" was printed but notify wasn't
		// called so "After wait" will never be printed, this is called frozen process. Deadlock is
		// formed, These type of deadlocks are called Frozen processes.
	}
}	

class Test implements Runnable {
	@Override
	public void run() {
		synchronized (this) {
			try {
				System.out.println("Before wait");
				this.wait();
				System.out.println("After wait");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}