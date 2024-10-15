
class TwoInOne
{

	public static void main(String args[]) throws InterruptedException
	{
	
		Myclass  m  = new Myclass();
		Mythread t1 = new Mythread(m,"one");
		Mythread t2 = new Mythread(m,"two");
		
		t1.strt();
		t2.strt();
		System.out.println("one = "+t1.thr().getState());
		System.out.println("two = "+t2.thr().getState());
		Thread.sleep(21000);
		
		System.out.println("one = "+t1.thr().getState());
		System.out.println("two = "+t2.thr().getState());
		while(!t2.thr().getState().equals("TERMINATED") || !t1.thr().getState().equals("TERMINATED"))
		{
			
			System.out.println("one = "+t1.thr().getState());
			System.out.println("two = "+t2.thr().getState());
			
		}
		
		
		
	}
}
