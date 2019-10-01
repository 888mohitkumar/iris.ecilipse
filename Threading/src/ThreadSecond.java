
public class ThreadSecond implements Runnable {

	public void run() {
		while(true)
		{
			try
			{
				System.out.println("In Thread Second");
				Thread.sleep(1000);
			}
			catch(Exception ex)
			{
				
			}
		}
	}

}
