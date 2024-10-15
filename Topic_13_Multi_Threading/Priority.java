

/*
    Setting the priority its dosent mean that settin the excution rank 
  its the cpu allocation to the thread to excute the program 
  
  it does not change the excution of threads 
  
  

*/



class Myclass implements Runnable
{
	int x;
	public void run()
	{
		
		
		for(int i =0;i<10;i++)
		{
			x++;
			Thread t = Thread.currentThread();
			
			System.out.println(t.getName()+ " x =" +x);
			
		
		}
	}	
	
}


class Proirity
{	
	public static void main(String arhs[])
	{
	
		Thread t1,t2;
		Myclass m = new Myclass();
		t1        = new Thread(m,"t1");
		t2        = new Thread(m,"t2");
		
		
		t1.setPriority(10);
		t2.setPriority(1) ;
		
		t1.start();
		t2.start();
		
		
	}
	

}
