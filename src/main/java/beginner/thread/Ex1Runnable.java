/**
  Ex1Runnable.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 09-Oct-2018		Nawal Sah				Initial Version

 Copyright (c) 2018,
 ***********************************************************************************************************************
 */
package beginner.thread;

public class Ex1Runnable {
	public static void main(String[] args) {
		RunnableExample r = new RunnableExample("first");
		Thread th = new Thread(r);
		th.start();
	}
}

class RunnableExample implements Runnable {
	private String threadName;

	public RunnableExample(String threadName) {
		this.threadName = threadName;
		System.out.println("Thread created : " + threadName);
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
