/**
  ThreadVsRunnable.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 23-Apr-2019		Nawal Sah				Initial Version

 Copyright (c) 2018,
 ***********************************************************************************************************************
 */
package nssaga.beginner.thread;

/**
 * Thread Class vs Runnable Interface
 * 
 * 1. If we extend the Thread class, our class cannot extend any other class
 * because Java doesn't support multiple inheritance. But, if we implement the
 * Runnable interface, our class can still extend other base classes.
 * 
 * 2. We can achieve basic functionality of a thread by extending Thread class
 * because it provides some inbuilt methods like yield(), interrupt() etc. that
 * are not available in Runnable interface.
 * 
 * Runnable is the preferred way to do it, In most cases. You're not really
 * specializing the thread's behavior. You're just giving it something to run.
 * That means composition is the philosophically "purer" way to go.
 * 
 * one significant difference between implementing Runnable and extending Thread
 * is that by extending Thread, each of your threads has a unique object
 * associated with it, whereas implementing Runnable, many threads can share the
 * same object instance.
 * 
 * When to use Runnable? Use Runnable interface when you want to access the same
 * resources from the group of threads. Avoid using Thread class here, because
 * multiple objects creation consumes more memory and it becomes a big
 * performance overhead.
 * 
 * A class that implements Runnable is not a thread and just a class. For a
 * Runnable to become a Thread, You need to create an instance of Thread and
 * passing itself in as the target.
 * 
 * In most cases, the Runnable interface should be used if you are only planning
 * to override the run() method and no other Thread methods. This is important
 * because classes should not be sub classed unless the programmer intends on
 * modifying or enhancing the fundamental behavior of the class.
 * 
 * When there is a need to extend a superclass, implementing the Runnable
 * interface is more appropriate than using the Thread class. Because we can
 * extend another class while implementing Runnable interface to make a thread.
 * 
 */
public class Ex02ThreadVsRunnable {

	public static void main(String args[]) throws Exception {
		// Multiple threads share the same object.
		ImplementsRunnable rc = new ImplementsRunnable();
		Thread t1 = new Thread(rc);
		t1.start();
		Thread.sleep(1000); // Waiting for 1 second before starting next thread
		Thread t2 = new Thread(rc);
		t2.start();
		Thread.sleep(1000); // Waiting for 1 second before starting next thread
		Thread t3 = new Thread(rc);
		t3.start();

		// Creating new instance for every thread access.
		ExtendsThread tc1 = new ExtendsThread();
		tc1.start();
		Thread.sleep(1000); // Waiting for 1 second before starting next thread
		ExtendsThread tc2 = new ExtendsThread();
		tc2.start();
		Thread.sleep(1000); // Waiting for 1 second before starting next thread
		ExtendsThread tc3 = new ExtendsThread();
		tc3.start();
	}
}

// Implement Runnable Interface...
class ImplementsRunnable implements Runnable {

	private int counter = 0;

	public void run() {
		counter++;
		System.out.println("ImplementsRunnable : Counter : " + counter);
	}
}

// Extend Thread class...
class ExtendsThread extends Thread {

	private int counter = 0;

	public void run() {
		counter++;
		System.out.println("ExtendsThread : Counter : " + counter);
	}
}