package nssaga.beginner.thread.callable;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * Callable vs Runnable
 * 
 * For implementing Runnable, the run() method needs to be implemented which
 * does not return anything, while for a Callable, the call() method needs to be
 * implemented which returns a result on completion. Note that a thread can’t be
 * created with a Callable, it can only be created with a Runnable. Another
 * difference is that the call() method can throw an exception whereas run()
 * cannot.
 * 
 * 
 * Example to return value
 */
public class CallableEx1 implements Callable {

	@Override
	public Object call() throws Exception {
		Random random = new Random();

		return random.nextInt(5);
	}

}
