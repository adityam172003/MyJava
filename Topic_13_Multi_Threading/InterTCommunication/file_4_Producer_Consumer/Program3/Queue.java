package file_4_Producer_Consumer.Program3;
import java.util.*;
class Queue
{
	int x;
	
	synchronized public void Produce()
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			Thread t = Thread.currentThread();
			
			String s = t.getName();
			int n;
			
			System.out.println("Enter producing quantity");
			n = sc.nextInt();
			if(n==0)
			{
				notify();
				return;
			}
			
			x+=n;
			System.out.println("Producer is produced x="+x);
			try
			{
				Thread.sleep(1000);
				notify();
				wait();
			
			}
			catch(Exception e)
			{
				
			}
		}
	}
	
	synchronized public void Consume()
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			Thread t = Thread.currentThread();
			
			String s = t.getName();
			int n;
			System.out.println("Enter consuming quantity");
			n = sc.nextInt();
			
			while(n>x)
			{
				System.out.println("Unavailable , We have only x="+x+" Please consume in limit :");
				n = sc.nextInt();
				if(n==0)
				{
					notify();
					return;
				}
			
			}
			if(n==0)
			{
					notify();
					return;
			}
			
			x-=n;
			
			
			
			
			System.out.println("consumer is consumed x="+x);
			try
			{
				Thread.sleep(1000);
				notify();
				wait();
			
			}
			catch(Exception e)
			{
				
			}
		}
	}
}
