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

/**
 * Thread creation by extending the Thread class
 * 
 * We create a class that extends the java.lang.Thread class. This class
 * overrides the run() method available in the Thread class. A thread begins its
 * life inside run() method. We create an object of our new class and call
 * start() method to start the execution of a thread. Start() invokes the run()
 * method on the Thread object.
 * 
 * Runnable provides the means for a class to be active while not subclassing
 * Thread. A class that implements Runnable can run without subclassing Thread
 * by instantiating a Thread instance and passing itself in as the target. In
 * most cases, the Runnable interface should be used if you are only planning to
 * override the run() method and no other Thread methods. This is important
 * because classes should not be subclassed unless the programmer intends on
 * modifying or enhancing the fundamental behavior of the class.
 * 
 * 
 * Thread Class vs Runnable Interface
 * 
 * 1. If we extend the Thread class, our class cannot extend any other class
 * because Java doesn�t support multiple inheritance. But, if we implement the
 * Runnable interface, our class can still extend other base classes.
 * 
 * 2. We can achieve basic functionality of a thread by extending Thread class
 * because it provides some inbuilt methods like yield(), interrupt() etc. that
 * are not available in Runnable interface.
 * 
 * 
 */
public class Ex1Thread {

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