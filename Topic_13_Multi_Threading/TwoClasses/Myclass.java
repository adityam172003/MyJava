
class Myclass
{

	public int x;
	
	synchronized public void show()
	{
		for(int i =0;i<10;i++)
		{
		
			Thread t = Thread.currentThread();
			x++;
			try
			{
				Thread.sleep(800);
			}
			catch(Exception s)
			{
				
			}
			System.out.println(t.getName() + " x="+x);
		}	
	}
	synchronized public void disp()
	{
		for(int i =0;i<10;i++)
		{
		
			Thread t = Thread.currentThread();
			x++;
			try
			{
				Thread.sleep(800);
			}
			catch(Exception s)
			{
				
			}
			System.out.println(t.getName() + " x="+x);
		}	
	}	
}
