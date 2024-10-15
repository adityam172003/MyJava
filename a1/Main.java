

class Main
{

	public static void main(String... args)
	{
		
		
		System.out.println("Inside the parent main");
	}
}

// we cant declare any class as private here 
// private class Myclss2
// {


// }
	


class Child extends Main
{
		// Inheritance property hold for main method 
		
		// if we do not define main method here then parent main method will be called 
		
		// it seems method overridin it is actually method hiding  
		public static void main(String... args)
		{
			System.out.println("Inside the child main");
		}
}		

class MainSyntax
{
	static final synchronized public void main(String... args)
	{
		// this is the overall main method declaration 
		System.out.println("This is the valid main method ");
	}
	
	
}


/*
	in the above context if we run the command 
	
	-java Child 
	
	it will call the parent main method 
*/
