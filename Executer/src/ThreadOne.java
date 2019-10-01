
public class ThreadOne implements Runnable {

	public void run() {
		while(true)
		{
			try
			{
				System.out.println("In Thread one");
				Thread.sleep(1000);
			}
			catch(Exception ex)
			{
				
			}
		}
	}

}
