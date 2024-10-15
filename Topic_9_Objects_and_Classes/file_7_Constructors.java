




class Myclass
{	
	private int x;
	private int y;
	
	private static int z;
	
	
	// default constructor 
	
	/*
		constructors are simply memebre function
		
		they have no return type
		
		we cant declare them as static 
		
		they should be default or public so that we can create  the object 
		of the class 
		================================================================
		but Java does not have a built-in copy constructor. 
		You can, however, 
		create one manually in Java. 
		================================================================


		CONSTRUCTOR IS CALLED BY JVM AS A PART OF OBJECT CREATION 
		CONSTRUCTOR HAS ONEY ONE PURPOSE OF TO INITIALIZE TEH NEWLY CREATED OBJECT 
		IT DOES NOT RETURN THE REFERENCE OF OBJECT ALSO. 

		EVERYTHINKG IS DONE BY JVM AND NEW KEYWORD
		------------------------------------------

		WE CANT CALL CONSTRUCTOR EXPLICITLY 
		BUT WE CAN USE SUPER KEYWORD TO CALL PARENT CONSTRUCTOR 
		ONLY INSIDE CHILD CONSTRCUTOR WHICH SHOULD BE THE FIRST STATEMENT IN CHILD 
		CONSTRUCTOR 

		THERE IS NO ANY CONCEPT OF COPY CONSTRUCTOR IN JAVA 
		
		==========================================================================
		
		
	*/
	public Myclass()
	{
		x=0;
		y=0;
		z=10;
		
		System.out.println("in the default constructor of the Myclass class ");
		
	}
	
	
	// parameterised constructors 
	
	Myclass(int x,int y )
	{
		this.x = x;
		this.y = y;
	
	}
	
	// rest properties are same as c++;
	// if we have parameterised constructor then jvm will not provide default 
	// constructor  this is necessary to define default constructor manually 
	
	
		
}


class file_7_Constructors
{	
				
	public static void main(String[] args)
	{
		Myclass obj = new Myclass();
																
														
										
				
		
	
	}						
				
}	
