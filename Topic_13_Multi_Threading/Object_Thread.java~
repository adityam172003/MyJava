class Myclass implements Runnable
{
	int x;
	
	 public void run()
	{
		System.out.println("Thread name = "+ Thread.currentThread().getName()+ "  x = " +x );
		// member of those object is accessed for which excuting thread is set 
		
		
		
	}
	
}


/*
	
	for statement
		Thread t1 = new Thread(m1);
		
		
		there is a member of type Tread in thread class
		
		like 
		
		class Thread
		{
			Thread target;
			
			public Thread(Runnable temp)
			{
				this.target = temp;
			
			}
			
			
			public void run()
			{
				if(target!=null)
				{
					target.run();
				}
			}
			
		}
		
		this is the reason when we excute run method using directly thred it 
		does not run the run() method inside Thread class 
		it will run the method inside the class whose object is set for this thread an
		
		work for that object who is set for this thread 
		
		here 
		
		t1.run();
		
		run method of class Myclass will be excuted for object m1
		
		
		
	

*/


class Object_Thread
{
	public static void main(String [] args)	throws InterruptedException
	{
		Myclass m1 = new Myclass();
		Myclass m2 = new Myclass();
		m1.x=10;
		m2.x=20;
		Thread t1  = new Thread(m1,"t1");
		Thread t2  = new Thread (m2,"t2");
		
		
		
		
		
		t1.start();
		t2.start();
		
		//Thread.sleep(200);
		t1.run();
		t2.run();
		
		
		
		//t1.join();
		//t2.join();
		
		// if i call run using threads directly
		
		
		System.out.println("Main ends");
		
		// here the excuting thread  is main thread but calling object is the object of respective 
		// thread seted 
		 	
		
	}
	
}
