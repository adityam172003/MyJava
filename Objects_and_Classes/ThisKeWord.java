class Myclass
{
	int x;
	static int y;
	
	public 
	Myclass()
	{
		
		this.x=20;
		
			//this = new Myclass();
			/*
				ThisKeWord.java:12: error: cannot assign to 'this'
			this = new Myclass();
			^
			1 error

			*/
			
		
	}
	
	static void fun()
	{	//this.x =10;
		/*
			ThisKeWord.java:16: error: non-static variable this cannot be referenced from a static 
			context
			this.x =10;
	 	          ^
			1 error

		*/
		System.out.println("static function in Myclass = = ");
		
		// work for class only 
	        // no this keyword is available here 
	         
	        
	        
	}
	
	void set(int x)
	{ 
	     /*
			here x is local variable + data memebre also 
			but the priority will goes to local variable 
			so if we access x data memebre its value is 0 
			 
			 rither we excute 
			 
			 x=x 
			 
			 here we introduce this keyWord
			 this.x = x;
			 
			 This keyWord 
			 
			 
			 this is the reference variable which stores the reference of 
			 the calling object 
			 
			 it is the final keyword we can't assign any reference value to This
			 
			 only accessable where things are working for object only
			 
			 
			 therefor This keYword is not accessible in static data members and static
			 blocks 
			 
			 
			 	     
	     */
		// x=x;
		
	}
	
	

}
