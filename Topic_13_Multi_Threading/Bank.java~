
class Receiver
{
	int amount;
	
	
	public Receiver(int a)
	{
		amount=a;
	}
	
	public void depo(int an)
	{
		System.out.println("Initial = "+amount+" - "+Thread.currentThread().getName());
		amount+=an;
		System.out.println("Final   = "+amount+" - "+Thread.currentThread().getName());
		System.out.println("======================");
		
	}
	
	
	
}


class Depositer implements Runnable
{
	int dep;
	Receiver r;
	public Depositer(Receiver r,int d)
	{
		this.r = r;
		dep    = d;
	}
	
	
	public void run()
	{
		synchronized(r)
		{
			
		}
		
		r.depo(dep);
		
		
	}
	
	
}


// deals with  synchronized blocks and synchronizaions



class Bank
{
	public static void main(String args[])throws InterruptedException
	{
	
		 Depositer d1 ,d2,d3;
		
		 Receiver r;
		r  =new Receiver(2000);
		d1 = new Depositer(r,1000);
		d2 = new Depositer(r,2000);
		d3 = new Depositer(r,3000);
		
		Thread t1 = new Thread(d1,"t1");
		Thread t2 = new Thread(d2,"t2");
		Thread t3 = new Thread(d3,"t3");
		
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		t3.join();
		System.out.println(r.amount);
	}
}
