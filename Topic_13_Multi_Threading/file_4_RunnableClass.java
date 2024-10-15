class Myclass implements Runnable
{

	public void run() 
	{
		System.out.println("Run method of Runnable interface ");
		//run method in Runnable interface is abstract we compulsary have to overrde it 
		// other wise it will generate error

		
		// if we are using sleep() methode here then we should use try catch block
		// to handle the InterruptedException here we cant use the throws keyword as it changes 
		// the function signature 
		

		// Runnable interface is the functional interface 
		//------------------------------------------------
		
	}

	

}



class file_4_RunnableClass
{

	public static void main(String [] args)
	{

		Myclass m = new Myclass();
		
		Thread  t = new Thread(m,"t1");
		
		t.start();
		
		System.out.println("Main ends");
        
	}
}
