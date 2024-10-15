

/*
		Life Cycle of a Thread 
		reference : https://www.javatpoint.com/life-cycle-of-a-thread
		
		New (thread object before calling start())
		|
		|
		|---> Active (after calling start start()) 
				|
				|
				|-------> Blocked / Waiting (Synchronization)
								|
								|
								|------------> Timed waiting (sleep(time))
													|
													|
													|----> Terminated 

	 Thread states 

	 1] NEW 
	 2] RUNNABLE
	 3] RUNNING
	 4] BLOCKED 
	 5] WAITING 
	 6] TIMED-WAITING 
	 7] TERMINATED 

		observe this function for more information 
        ->System.out.println(t.getState());


    private static final int NEW      = 0;
    private static final int STARTED  = 1;
    private static final int RUNNABLE = 2;     // runnable-unmounted
    private static final int RUNNING  = 3;     // runnable-mounted
    private static final int PARKING  = 4;
    private static final int PARKED   = 5;     // unmounted
    private static final int PINNED   = 6;     // mounted
    private static final int YIELDING = 7;     // Thread.yield
    private static final int TERMINATED = 99;  // final state
	
 */

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



