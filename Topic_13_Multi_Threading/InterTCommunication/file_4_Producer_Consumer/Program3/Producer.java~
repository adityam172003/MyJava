
class Producer implements Runnable
{
	Queue q;
	Thread t;
	
	public Producer(Queue q)
	{
		this.q  = q;
		t       = new Thread(this); 
	}
	public void strt()
	{
		t.start();
	}
	
	public void run()
	{
		q.Produce();
	}
}	
