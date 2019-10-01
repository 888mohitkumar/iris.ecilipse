import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

	public static void main(final String[] args) throws InterruptedException, ExecutionException {

		final int arr[] = new int[5];

		final ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(5);

		final ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(5);
		// newScheduledThreadPool.scheduleAtFixedRate(command, initialDelay,
		// period, unit)

		final Callable call1 = new CallableOne(100);

		// Callable call2= new CallableSecond();
		for (int i = 0; i < 10; i++) {
			final Future<String> submit = newFixedThreadPool.submit(new CallableOne(100 * i));
			System.out.println(submit.get());
			System.out.println(submit.isDone());
			System.out.println(submit.isCancelled());
		}

		final ReentrantLock rel = new ReentrantLock();
	}

}
