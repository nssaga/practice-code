/**
  Ex3Sync.java
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
package nssaga.beginner.thread;

/**
 * constructors cannot be synchronized — using the synchronized keyword with a
 * constructor is a syntax error. Synchronizing constructors doesn't make sense,
 * because only the thread that creates an object should have access to it while
 * it is being constructed.
 * 
 * 
 */
public class Ex03Sync {

	public static void main(String[] args) {
		SyncEx ex = new SyncEx();

		Thread1 thread1 = new Thread1(ex);
		new Thread(thread1, "Question").start();

		Thread2 thread2 = new Thread2(ex);
	}

}

class SyncEx {
	boolean flag = false;

	public synchronized void question(String ques) {
		if (flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(ques);
		flag = true;
		notify();
	}

	public synchronized void answer(String ans) {
		if (!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		System.out.println(ans);
		flag = false;
		notify();
	}
}

class Thread1 implements Runnable {

	SyncEx syncEx;

	String ques[] = { "Hi", "How are you ?", "I am also doing fine!" };

	public Thread1(SyncEx syncEx) {
		this.syncEx = syncEx;

		System.out.println("creating Thread1");
	}

	@Override
	public void run() {
		for (int i = 0; i < ques.length; i++) {
			syncEx.question(ques[i]);
		}
	}
}

class Thread2 implements Runnable {
	SyncEx syncEx;

	String answer[] = { "Hi", "I am good, what about you?", "Great!" };

	public Thread2(SyncEx syncEx) {
		this.syncEx = syncEx;
		new Thread(this, "Answer").start();
		System.out.println("creating Thread2");
	}

	@Override
	public void run() {
		for (int i = 0; i < answer.length; i++) {
			syncEx.answer(answer[i]);
		}
	}
}