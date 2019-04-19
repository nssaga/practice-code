/**
  Ex11Thread.java
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
package beginner.thread;

import java.io.IOException;

/**
 * Volatile variable example
 */
public class Ex4Volatile {
	public static void main(String[] args) throws IOException {
		Machine m = new Machine();
		m.start();

		System.out.println("Press return/enter key to stop machine.");
		System.in.read();

		m.shutdown();
	}
}

class Machine extends Thread {

	// Variable in main memory to make all thread accessible, which define the
	// status of thread.
	public volatile boolean running = true;

	@Override
	public void run() {

		while (running) {
			System.out.println("Machine is running ...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.err.println("Machine Interrupted.");
			}
		}
	}

	public void shutdown() {
		running = false;
		System.out.println("Return key pressed, shutting down the machine.");
	}

}