package nssaga.advance.thread;

import java.util.Scanner;

/**
 * What is Polling and what are problems with it? The process of testing a
 * condition repeatedly till it becomes true is known as polling.
 * 
 * Polling is usually implemented with the help of loops to check whether a
 * particular condition is true or not. If it is true, certain action is taken.
 * This waste many CPU cycles and makes the implementation inefficient. For
 * example, in a classic queuing problem where one thread is producing data and
 * other is consuming it.
 * 
 * How Java multi threading tackles this problem? To avoid polling, Java uses
 * three methods namely, wait(), notify() and notifyAll(). All these methods
 * belong to object class as final so that all classes have them. They must be
 * used within a synchronized block only.
 * 
 * wait() - It tells the calling thread to give up the lock and go to sleep
 * until some other thread enters the same monitor and calls notify().<br>
 * notify() - It wakes up one single thread that called wait() on the same
 * object. It should be noted that calling notify() does not actually give up a
 * lock on a resource.<br>
 * notifyAll() - It wakes up all the threads that called wait() on the same
 * object.
 * 
 * @author Nawal Sah
 */
public class Ex03InterThreadCommuniation {

	public static void main(String[] args) throws InterruptedException {
		final PC pc = new PC();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pc.produce();
				} catch (InterruptedException e) {
					System.out.println("InterruptedException");
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException e) {
					System.out.println("InterruptedException");
				}
			}
		});

		t1.join();
		t2.join();

		t1.start();
		t2.start();

	}

	public static class PC {
		public void produce() throws InterruptedException {
			/*
			 * synchronizing block to ensure one thread run at a time.
			 */
			synchronized (this) {
				System.out.println("Producer thread running..");
				// releasing the lock on shared resource
				wait();

				// and waits till some other method invokes notify().
				System.out.println("Resumed.");
			}
		}

		/*
		 * Sleeps for some time and waits for a key press. After key is pressed, it
		 * notifies produce().
		 */
		public void consume() throws InterruptedException {

			// this makes the produce thread to run first.
			Thread.sleep(1000);

			Scanner sc = new Scanner(System.in);

			synchronized (this) {
				System.out.println("Waiting for return key..");
				sc.nextLine();
				System.out.println("Key pressed");

				/**
				 * notifies the produce thread that it can wake up.
				 */
				notify();

				Thread.sleep(1000);
				System.out.println("after");
			}
		}

	}
}
