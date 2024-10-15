class Myclass
{

	int x;
	// this are the blocks having no name
	
	/*
		Anonymous block gets excuted when object is created  
		independent on the what type of constructor gets called
		
		
		they get excuted before constrors 


		IF WE WANT TO PERFORM SOME OPERATIONS AFTER CREATING THE OBJECT 
		IRRESPECTIVE OF WHICH TYPE OF CONSTRUCTION IS CALLED THEN WE WRITE THOSE 
		OPERATIONS IN ANONYMOUS BLOCK 
		 
		
	*/
	{	
		// this is accessble in anonymous block
		
		
		System.out.println("In the Anonymous block"+this.x);
		
	}
	
	static
	{
	
		System.out.println("In the static block");
		
	}
	
	

	public Myclass()
	{
		System.out.println("in the default constructor");
	}
	
	public Myclass(int x)
	{	
		this.x = x;
		System.out.println("in the parameterised constructor");
		
	}
	
	
	

}


/*

	excution
	
		1 ] static block
		
		2 ] anonymous bock
		
		3 ] constructors 

*/


class file_6_Anonymous
{
	
	
	public static void main(String[] args)
	{
		Myclass m1 = new Myclass();
		
		Myclass m2 = new Myclass(3);
		
		
	}

}
