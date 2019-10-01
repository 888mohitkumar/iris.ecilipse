import java.util.concurrent.Callable;

public class CallableSecond implements Callable<String> {

	public String call() throws Exception {

			try
			{
				System.out.println("In Callable one");
				Thread.sleep(1000);
			}
			catch(Exception ex)
			{
				
			}
		    return "success";
	}

}
