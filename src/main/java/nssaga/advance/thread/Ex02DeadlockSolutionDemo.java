/*------------------------------------------------------------------------------------------------------
 NEWGEN SOFTWARE TECHNOLOGIES LIMITED
 Author                         : nawal.sah
 Group                          : AP-2
 Project/Product                : ADF Phonix Project 
 Module                         : Web Portal Development
 File Name                      : DeadlockSolutionDemo.java
 Date (DD/MM/YYYY)              : May 4, 2017
 Description                    : 
 ------------------------------------------------------------------------------------------------------*/

package nssaga.advance.thread;

/**
 * Let's change the order of the lock and run of the same program to see if both
 * the threads still wait for each other
 */
public class Ex02DeadlockSolutionDemo {
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
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				}
				System.out.println("Thread 1: Waiting for lock 2...");

				synchronized (Lock2) {
					System.out.println("Thread 1: Holding lock 1 & 2...");
				}
				//Releasing lock 2
			}
			//Releasing lock 1
		}
	}

	private static class ThreadDemo2 extends Thread {
		public void run() {
			synchronized (Lock1) {
				System.out.println("Thread 2: Holding lock 1...");

				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				System.out.println("Thread 2: Waiting for lock 2...");

				synchronized (Lock2) {
					System.out.println("Thread 2: Holding lock 1 & 2...");
				}
			}
		}
	}
}
