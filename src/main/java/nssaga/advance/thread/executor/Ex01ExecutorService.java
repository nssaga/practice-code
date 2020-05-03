package nssaga.advance.thread.executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * BlockingQueue is used to keep all the task. BlockingQueue is thread safe and
 * can handle concurrent modification.
 * 
 * Idle pool size is CPU core count
 * 
 * Too many thread will increase memory consumption.
 * 
 * There are 4 thread pool
 * 1. FixedThreadPool : Fixed number of thread and hold by blocking queue
 * 2. CachedThreadPool
 * 3. ScheduledThreadPoll
 * 4. SingleThreadedExecutor
 * 
 */
public class Ex01ExecutorService {
	public static void main(String[] args) {
		// Get idle pool size
		int coreCount = Runtime.getRuntime().availableProcessors();
		System.out.println(coreCount);
		ExecutorService service = Executors.newFixedThreadPool(5);

		for (int i = 0; i < 100; i++) {
			service.execute(new NewTask());
		}
	}
}


class NewTask implements Runnable {
	@Override
	public void run() {
		// Only fixed number of thread will be created after that it will wait for thread
		// to released
		System.out.println(Thread.currentThread().getName());
	}
}

