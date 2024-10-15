package file_2_Program1;

class MyThread implements Runnable
{
	public int x;
	
	synchronized public void run()
	{
		for(int i =0;i<10;i++)
		{
			x++;
			try
			{
			   String s = Thread.currentThread().getName();
			   System.out.println(s+ " x = "+x);
			   Thread.sleep(900);
			   notify();
			   wait();
			    
			}	
			catch(Exception e)
			{
				
			}
		}
		
		notify(); // if you not notify() here one of the two threads will be in wait state always
	}
}

