
class Number 
{
	int x;
	
	synchronized public void Producer()
	{
		while(true)
		{
			
			x++;
			System.out.println("Producer is Producing x ="+x);
			try
			{
				notify();
				wait();
			}
			catch(Exception s )
			{
				//
			}	
			
		}
	
	}
	
	synchronized public void Consumer()
	{
		while(true)
		{
			
			
			System.out.println("Consumer is Consuming x ="+x);
			try
			{
				notify();
				wait();
			}
			catch(Exception s )
			{
				//
			}	
			
		}
	
	}


}
