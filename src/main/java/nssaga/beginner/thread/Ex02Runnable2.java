/**
  Ex2Runnable2.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 02-Mar-2019		Nawal Sah				Initial Version

 Copyright (c) 2018,
 ***********************************************************************************************************************
 */
package nssaga.beginner.thread;

public class Ex02Runnable2 {
	public static void main(String[] args) {
		RunnableDemo rd1 = new RunnableDemo("Thread-1");
		rd1.start();

		RunnableDemo rd2 = new RunnableDemo("Thread-2");
		rd2.start();
	}
}

class RunnableDemo implements Runnable {
	private Thread t;
	private String threadName;

	public RunnableDemo(String threadName) {
		this.threadName = threadName;
		System.out.println("Creating Thread : " + threadName);
	}

	@Override
	public void run() {
		System.out.printf("Running thread %s ...\n", threadName);
		for (int i = 0; i < 4; i++) {
			System.out.printf("Thread %s : %d \n", threadName, i);
		}
		System.out.printf("Exiting thread %s \n", threadName);
	}

	public void start() {
		System.out.println("Starting Thread " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
}
