import java.util.concurrent.Callable;

public class CallableOne implements Callable<String> {

	private int value;
	public CallableOne(int i)
	{
		value=i;
	}
	public String call() throws Exception {

			try
			{
				if(value==100)
				{
					throw new Exception();
				}
				System.out.println("In Callable one::"+value);
				Thread.sleep(3000);
			}
			catch(Exception ex)
			{
				return " exception has occured";
			}
		    return "success";
	}

}
