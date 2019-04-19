/**
  Ex2JoinThread.java
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

public class Ex2JoinThread {

	public static void main(String[] args) throws InterruptedException {
		Th1 t1 = new Th1();
		t1.set(10, 5);

		Th2 t2 = new Th2();
		t2.set(10, 5);

		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		
		th1.start();
		th2.start();
		
		th1.join();
		th2.join();
	}
}

class Th1 extends Thread {
	private int x;
	private int y;

	void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void run() {
		System.out.println("x + y = " + (x + y));
	}
}

class Th2 extends Thread {
	private int x;
	private int y;

	void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void run() {
		System.out.println("x - y = " + (x - y));
	}
}
