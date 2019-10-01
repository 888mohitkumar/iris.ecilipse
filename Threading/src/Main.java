import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		int arr[] = new int[5];

		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(5);

		ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(5);
		// newScheduledThreadPool.scheduleAtFixedRate(command, initialDelay,
		// period, unit)

		Callable call1 = new CallableOne(100);

		// Callable call2= new CallableSecond();
		for (int i = 0; i < 10; i++) {
			Future<String> submit = newFixedThreadPool.submit(new CallableOne(100 * i));
			System.out.println(submit.get());
			System.out.println(submit.isDone());
			System.out.println(submit.isCancelled());
		}

	}

}
