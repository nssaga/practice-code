/**
  Ex6ThreadPriority.java
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

public class Ex05ThreadPriority extends Thread {

	@Override
	public void run() {
		System.out.println("run() method");
	}

	public static void main(String[] args) {
		Ex05ThreadPriority t1 = new Ex05ThreadPriority();
		Ex05ThreadPriority t2 = new Ex05ThreadPriority();
		Ex05ThreadPriority t3 = new Ex05ThreadPriority();

		System.out.println("Before Main thread priority : " + Thread.currentThread().getPriority());
		System.out.println("Before Priority t1 : " + t1.getPriority()); // Default priority 5
		System.out.println("Before Priority t2 : " + t2.getPriority()); // Default priority 5
		System.out.println("Before Priority t3 : " + t3.getPriority()); // Default priority 5

		// Setting thread priority
		t1.setPriority(2);
		t2.setPriority(3);
		t3.setPriority(4);

		Thread.currentThread().setPriority(5);
		System.out.println("After Main thread priority : " + Thread.currentThread().getPriority());
		System.out.println("After Priority t1 : " + t1.getPriority());
		System.out.println("After Priority t2 : " + t2.getPriority());
		System.out.println("After Priority t3 : " + t3.getPriority());

	}

}
