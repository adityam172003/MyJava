package file_2_Program1;

class Program
{
	public static void main(String sre[])throws Exception
	{
		MyThread m = new MyThread();
		
		Thread  t1 = new Thread(m,"t1");
		Thread  t2 = new Thread(m,"t2");
		t1.start();
		t2.start();
		
		while(true)
		{
		 System.out.println(t1.getState());
		 System.out.println(t2.getState());
		 Thread.sleep(900);
		}
		
		
		
		
	}

}

