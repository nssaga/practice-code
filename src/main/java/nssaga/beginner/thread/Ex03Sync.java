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

		QuestionThread thread1 = new QuestionThread(ex);
		new Thread(thread1, "Question").start();

		AnswerThread thread2 = new AnswerThread(ex);
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

class QuestionThread implements Runnable {

	SyncEx syncEx;

	String ques[] = { "Hi", "How are you ?", "I am also doing fine!" };

	public QuestionThread(SyncEx syncEx) {
		this.syncEx = syncEx;
		System.out.println("creating question Thread");
	}

	@Override
	public void run() {
		for (int i = 0; i < ques.length; i++) {
			syncEx.question(ques[i]);
		}
	}
}

class AnswerThread implements Runnable {
	SyncEx syncEx;

	String answer[] = { "Hi", "I am good, what about you?", "Great!" };

	public AnswerThread(SyncEx syncEx) {
		this.syncEx = syncEx;
		new Thread(this, "Answer").start();
		System.out.println("creating answer Thread");
	}

	@Override
	public void run() {
		for (int i = 0; i < answer.length; i++) {
			syncEx.answer(answer[i]);
		}
	}
}