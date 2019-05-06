/**
  Ex02DeadlockClass.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 04-May-2019		Nawal Sah				Initial Version

 Copyright (c) 2018,
 ***********************************************************************************************************************
 */
package nssaga.advance.thread;

public class Ex02DeadlockClass {
	public static void main(String[] args) {
		Th1 t1 = new Th1();
		Th2 t2 = new Th2();

		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);

		th1.start();
		th2.start();
	}
}

class Th1 implements Runnable {
	@Override
	public void run() {
		synchronized (String.class) {
			System.out.println("Thread 1 : Lock acquired on String classs");
			System.out.println("Thread 1 : Wating to acquire lock on String class");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			synchronized (Object.class) {
				System.out.println("Thread 1 : Lock acquired on Object class");
			}
		}
		System.out.println("Thread 1 : Lock released on String and Object class, Thread ended.");
	}
}

class Th2 implements Runnable {
	@Override
	public void run() {
		synchronized (String.class) {
			System.out.println("Thread 2 : Lock acquired on String class");
			System.out.println("Thread 2 : Waiting to acquire lock on Object class");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			synchronized (Object.class) {
				System.out.println("Thread 2 : Lock acquired on String and Object class");
			}

		}
		System.out.println("Thread 2 : Lock released on String and Object, Thread ended");
	}
}
