

/*
	This is the program which shows the time duration of excuting the prigram using main thread 
	and using our own thread 
	
	
*/

class Prime1 implements Runnable
{
	int n;
	
	public Prime1(int n)
	{
		this.n = n;
	}
	
	public void run()
	{
		
		findPrime();
	}
	
	void findPrime()
	{
		int ans=0;
		int i =2;
		while(n!=0)
		{
			if(isPrime(i))
			{
				ans=i;
				
				n--;	
			}
			i++;
		}
		
		System.out.println(ans);
	}
	
	boolean isPrime(int i)
	{
		for(int j=2;j*j<=i;j++)
		{
			if(i%j==0)return false;
		}
		return true;
	}

}



class Prime
{
	public static void main(String args[])
	{
	
		Prime1  p  = new Prime1(500000);
		Prime1  q  = new Prime1(900000);
		
		Thread  t1 = new Thread(p);
		Thread  t2 = new Thread(q);
		
		t1.start();
		t2.start();
		/*
			using threads it took 19 seconds 
		*/
		
		
		//p.findPrime();
		//q.findPrime();
		/*
			using main thread program took 28seconds to compute the numbers 
		*/
		
		
	}


}
