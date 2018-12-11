/**
  Ex2Thread.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 10-Oct-2018		Nawal Sah				Initial Version

 Copyright (c) 2018,
 ***********************************************************************************************************************
 */
package beginner.thread;

public class Ex2Thread {

	public static void main(String[] args) {
		ThreadExample t = new ThreadExample("thread1");
		Thread th = new Thread(t);
		th.start();
	}

}

class ThreadExample extends Thread {
	private String threadName;

	public ThreadExample(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {
		System.out.println("Running thread :" + threadName);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			System.out.println("Thread Interrupted");
		}
		System.out.println("Exiting from thread :" + threadName);
	}

}