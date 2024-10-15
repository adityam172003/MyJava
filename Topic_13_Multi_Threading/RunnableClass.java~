class Myclass implements Runnable
{

	public void run()
	{
		System.out.println("Run method of Runnable interface ");
		//run method in Runnable interface is abstract we compulsary have to overrde it 
		// other wise it will generate error
	}

}



class RunnableClass
{

	public static void main(String [] args)
	{
		Myclass m = new Myclass();
		
		Thread  t = new Thread(m,"t1");
		
		t.start();
		
		System.out.println("Main ends");
	}
}
