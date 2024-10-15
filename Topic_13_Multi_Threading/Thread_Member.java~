

class Mythread implements Runnable
{

	int x;
	
	Thread t;
	
	
	public Mythread(String n)
	{
		t = new Thread(this,n);
	}
	
	public Mythread(int x,String n)
	{
		this.x = x;
		t      = new Thread(this,n);
	}
	
	public void Start()
	{
		t.start();
	}
	
	public void run()
	{
		
		PrintData();
		try
		{
			Thread.sleep(1000);
			
		}
		catch(Exception q)
		{	
			System.out.println("caught");
		}	
	}
	
	public void PrintData()
	{
		Thread t = Thread.currentThread();
		
		String s = t.getName();
		
		System.out.println("Thread name = "+s+" x = "+x);
	}
	
	Thread myT()
	{
		return t;
	}
}	



class Thread_Memeber
{
	public static void main(String[] args)throws Exception
	{
	
		Mythread t  = new Mythread(24,"myThread1");
		Mythread t2 = new Mythread(48,"myThread2");
		t.Start();
		
		
		t.myT().join();
		System.out.println(t.myT().getState());
		System.out.println(t2.myT().getState());
		t2.Start();
		t2.myT().join();
		System.out.println(t2.myT().getState());
		
		System.out.println(t.myT().getState());
		
	}
}



