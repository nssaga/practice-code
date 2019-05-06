/*------------------------------------------------------------------------------------------------------
 NEWGEN SOFTWARE TECHNOLOGIES LIMITED
 Author                         : nawal.sah
 Group                          : AP-2
 Project/Product                : ADF Phonix Project 
 Module                         : Web Portal Development
 File Name                      : DeadlockDemo.java
 Date (DD/MM/YYYY)              : May 4, 2017
 Description                    : 
 ------------------------------------------------------------------------------------------------------*/

package nssaga.advance.thread;

/**
 * Deadlock describes a situation where two or more threads are waiting for each
 * other and blocked forever.
 * 
 * Deadlock occurs when multiple threads need the same locks but obtain them in
 * different order. A Java multi threaded program may suffer from the deadlock
 * condition because the synchronized keyword causes the executing thread to
 * block while waiting for the lock, or monitor, associated with the specified
 * object.
 * 
 * 
 * synchronized keyword is used to make the class or method thread-safe which
 * means only one thread can have lock of synchronized method and use it, other
 * threads have to wait till the lock releases and anyone of them acquire that
 * lock. It is important to use if our program is running in multi-threaded
 * environment where two or more threads execute simultaneously. But sometimes
 * it also causes a problem which is called Deadlock. Below is a simple example
 * of Deadlock condition.
 * 
 * Important Points :
 * 
 * If threads are waiting for each other to finish, then the condition is known
 * as Deadlock. Deadlock condition is a complex condition which occurs only in
 * case of multiple threads. Deadlock condition can break our code at run time
 * and can destroy business logic. We should avoid this condition as much as we
 * can.
 */
public class Ex02DeadlockDemo {
	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();

	public static void main(String args[]) {
		ThreadDemo1 T1 = new ThreadDemo1();
		ThreadDemo2 T2 = new ThreadDemo2();
		T1.start();
		T2.start();
	}

	private static class ThreadDemo1 extends Thread {
		public void run() {
			synchronized (Lock1) {
				System.out.println("Thread 1: Holding lock 1...");

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
				}
				System.out.println("Thread 1: Waiting for lock 2...");

				synchronized (Lock2) {
					System.out.println("Thread 1: Holding lock 1 & 2...");
				}
			}
		}
	}

	private static class ThreadDemo2 extends Thread {
		public void run() {
			synchronized (Lock2) {
				System.out.println("Thread 2: Holding lock 2...");

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
				}
				System.out.println("Thread 2: Waiting for lock 1...");

				synchronized (Lock1) {
					System.out.println("Thread 2: Holding lock 1 & 2...");
				}
			}
		}
	}
}
