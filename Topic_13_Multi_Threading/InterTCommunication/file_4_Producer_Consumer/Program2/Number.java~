
import java.util.*;

class Number 
{
	int x;
	
	synchronized public void Producer()
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			int n;
			
			System.out.println("Enter producing quantity");
			n = sc.nextInt();
			if(n==0)
			{
				notify();
				return;
			}
			
			x+=n;
			
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
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			
			int n;
			System.out.println("Enter consuming quantity");
			n = sc.nextInt();
			if(n==0)
			{
				notify();
				return;
			}
			System.out.println("Consumer is Consuming x ="+n);
			x-=n;
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
