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
package beginner.thread;

public class Ex3Sync {

	public static void main(String[] args) {
		SyncEx ex = new SyncEx();

		Thread1 thread1 = new Thread1(ex);
		new Thread(thread1, "Question").start();

		Thread2 thread2 = new Thread2(ex);
	}

}

class SyncEx {
	boolean flag = false;

	public synchronized void question(String question) {
		if (flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Interrupted");
			}
		}
		System.out.println(question);
		flag = true;
		notify();
	}

	public synchronized void answer(String answer) {
		if (!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Interrupted");
			}
		}
		System.out.println(answer);
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