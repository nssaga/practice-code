/**
  Ex2JoinThread.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 02-Mar-2019		Nawal Sah				Initial Version

 Copyright (c) 2020,
 ***********************************************************************************************************************
 */
package nssaga.beginner.thread;

/**
 * Thread behavior is unpredictable because execution of Threads depends on
 * Thread scheduler, start main() method will be the printed first, but after
 * that we cannot guarantee the order of thread1, thread2 and main thread they
 * might run simultaneously or sequentially, so order of end main() method will
 * not be guaranteed.
 * 
 * To ensure all threads that started from main must end in order in which they
 * started and also main should end in last, we can use join() method of Thread.
 * In other words join() method waited for this thread to die.
 * 
 */
public class Ex02JoinThread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main thread started ...");
		Th1 t1 = new Th1();
		t1.set(10, 5);

		Th2 t2 = new Th2();
		t2.set(10, 5);

		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);

		th1.start();
		th2.start();

		th1.join();
		th2.join();

		System.out.println("main thread end");
	}
}

class Th1 extends Thread {
	private int x;
	private int y;

	void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void run() {
		System.out.println("x + y = " + (x + y) + "  - in " + this.getName());
	}
}

class Th2 extends Thread {
	private int x;
	private int y;

	void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void run() {
		System.out.println("x - y = " + (x - y) + "  - in " + this.getName());
	}
}
