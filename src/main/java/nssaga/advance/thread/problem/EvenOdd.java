/**
  EvenOdd.java
 ***********************************************************************************************************************
 Description: 	Write a multi thread program to print even odd in sequence.

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 12-May-2019		Nawal Sah				Initial Version

 Copyright (c) 2018,
 ***********************************************************************************************************************
 */
package nssaga.advance.thread.problem;

/**
 * Write a multi thread program to print even odd in sequence.
 */
public class EvenOdd {
	public volatile int num = 0;
	public int count = 0; // increase through sync

	public static void main(String[] args) throws InterruptedException {
		EvenOdd e = new EvenOdd();
		// Ex1 using sync
		Thread tex1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.print("Thread 1 ");
					e.print();
					
				}
			}
		});
		tex1.start();

		Thread tex2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.print("Thread 2 ");
					e.print();
					
				}

			}
		});
		tex2.start();

		/*tex1.join();
		tex2.join();*/

		/*
		 * EvenOddThread1 t1 = new EvenOddThread1(); EvenOddThread2 t2 = new
		 * EvenOddThread2();
		 * 
		 * Thread th1 = new Thread(t1); Thread th2 = new Thread(t2);
		 * 
		 * th2.join(); th1.join();
		 * 
		 * th2.start(); th1.start();
		 */

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
		// return num;
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
		// return num;
	}

}

class EvenOddThread1 implements Runnable {

	@Override
	public void run() {
		EvenOdd e = new EvenOdd();
		try {
			e.printOddNum();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		/*
		 * e.num++; System.out.println(e.num);
		 */
	}
}

class EvenOddThread2 implements Runnable {

	@Override
	public void run() {
		EvenOdd e = new EvenOdd();
		try {
			e.printEvenNum();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		/*
		 * e.num++; System.out.println(e.num);
		 */
	}
}
