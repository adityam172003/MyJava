package file_3_Program2;
	
/*	
	this is the another solution for the infinite waiting state of one of the thread
	
	here we use the another version of wait()
	
	which is timed waiting state 
	
	thread will go in TIMED_WAITING state
*/
class Mythread implements Runnable
{
	public int x;
	
	synchronized public void run()
	{
		for(int i =0;i<20;i++)
		{
			Thread t = Thread.currentThread();
			
			String s = t.getName();
			
			if(s.equals("one"))
			{
				x+=2;
				try
				{
					
					System.out.println(s+" " +x);
					Thread.sleep(1000);
					notify();
					wait(100);
				}
				catch(Exception e )
				{	
					
				}
			}
			
			if(s.equals("two"))
			{
				x--;
				try
				{
					
					System.out.println(s+" " +x);
					Thread.sleep(1000);
					notify();
					wait(100); 
					
				}
				catch(Exception e )
				{	
					
				}
			}
		}
	}
	
}
