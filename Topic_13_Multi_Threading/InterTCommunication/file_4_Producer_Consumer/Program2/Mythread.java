package file_4_Producer_Consumer.Program2;


class Mythread implements Runnable
{ 
	public Number n;
	
	public Mythread(Number	n)
	{
		this.n = n;
	}
	
	
	public void run()
	{
		Thread t = Thread.currentThread();
		
		if(t.getName().equals("prod"))
		{
			n.Producer();
		}
		
		if((t.getName().equals("cons")))
		{	
			n.Consumer();	
		}
	}
}
