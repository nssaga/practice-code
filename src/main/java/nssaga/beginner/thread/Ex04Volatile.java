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
package nssaga.beginner.thread;

import java.io.IOException;

/**
 * Using volatile is yet another way (like synchronized, atomic wrapper) of
 * making class thread safe.
 * 
 * https://www.geeksforgeeks.org/volatile-keyword-in-java/
 * http://tutorials.jenkov.com/java-concurrency/volatile.html
 * 
 * volatile keyword makes sure that the changes made in one thread are
 * immediately reflect in other thread.
 * 
 * The volatile keyword is used to say to the jvm "Warning, this variable may be
 * modified in an other Thread".
 * 
 * The volatile force the thread to update the original variable for each
 * variable. The volatile keyword could be used on every kind of variable,
 * either primitive or objects!
 * 
 * The Java volatile keyword is used to mark a Java variable as "being stored in
 * main memory". More precisely that means, that every read of a volatile
 * variable will be read from the computer's main memory, and not from the CPU
 * cache, and that every write to a volatile variable will be written to main
 * memory, and not just to the CPU cache.
 * 
 * Declaring a variable volatile thus guarantees the visibility for other
 * threads of writes to that variable.
 * 
 * volatile vs synchronized:
 * 
 * Before we move on let’s take a look at two important features of locks and
 * synchronization.
 * 
 * Mutual Exclusion: It means that only one thread or process can execute a
 * block of code (critical section) at a time. Visibility: It means that changes
 * made by one thread to shared data are visible to other threads.
 * 
 * Volatile variable example
 */
public class Ex04Volatile {
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