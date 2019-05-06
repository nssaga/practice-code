/**
  E01ThreadInterruption.java
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

import java.io.IOException;

public class Ex01ThreadInterruption {
	public static void main(String[] args) throws IOException {

		// MyRunnable r = new MyRunnable();
		Runnable r = () -> {
			System.out.println("Thread started, press enter to interrupt");

			try {
				while (!Thread.interrupted()) {
					System.out.println("X");
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				System.out.println("Interrupted and thread ended");
			}
		};

		Thread t1 = new Thread(r);
		t1.start();

		System.in.read();
		t1.interrupt();

	}

	class MyRunnable implements Runnable {

		@Override
		public void run() {
			System.out.println("Thread started");

			try {
				while (!Thread.interrupted()) {
					System.out.println("X");
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				System.out.println("Interrupted");
			}

		}

	}
}
