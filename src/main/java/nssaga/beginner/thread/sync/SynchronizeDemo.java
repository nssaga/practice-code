package nssaga.beginner.thread.sync;

/**
 * Synchronization : At a times when more than one thread try to access a shared
 * resource, we need to ensure that resource will be used by only one thread at
 * a time. The process by which this is achieved is called synchronization. The
 * synchronization keyword in java creates a block of code referred to as
 * critical section.
 * 
 * 
 * Difference between synchronized keyword and synchronized block
 * 
 * When we use synchronized keyword with a method, it acquires a lock in the
 * object for the whole method. It means that no other thread can use this
 * synchronized method until the current thread, which has invoked it's
 * synchronized method, has finished its execution.
 * 
 * synchronized block acquires a lock in the object only between parentheses
 * after the synchronized keyword. This means that no other thread can acquire a
 * lock on the locked object until the synchronized block exits. But other
 * threads can access the rest of the code of the method.
 * 
 * Which is more preferred - Synchronized method or Synchronized block?
 * 
 * In Java, synchronized keyword causes a performance cost. A synchronized
 * method in Java is very slow and can degrade performance. So we must use
 * synchronization keyword in java when it is necessary else, we should use Java
 * synchronized block that is used for synchronizing critical section only.
 * 
 */
class First {
	public void display(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}

class Second extends Thread {
	String msg;
	First fobj;

	Second(First fobj, String msg) {
		this.fobj = fobj;
		this.msg = msg;
		start();
	}

	public void run() {
		// without Synchronized block
		// fobj.display(msg);

		// Synchronized block
		synchronized (fobj) {
			fobj.display(msg);
		}
	}
}

public class SynchronizeDemo {
	public static void main(String[] args) {

		// object fnew of class First is shared by all the three running
		// threads(ss, ss1 and ss2) to call the shared method(void display).
		// Hence the result is unsynchronized and such situation is called Race
		// condition. But by using the synchronize block in run we can make it
		// to synchronized shared resource.
		First fnew = new First();
		Second ss = new Second(fnew, "welcome");
		Second ss1 = new Second(fnew, "new");
		Second ss2 = new Second(fnew, "programmer");
	}
}
