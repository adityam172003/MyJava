

import java.util.*;


class Number
{
	int x;
	
	void set(int x)
	{
		// x=x     1 ]  here priority will be given to local variables
		
		this.x = x;  //this.x is referring to data memebr of the this class
		System.out.println(this.x);
		
	}
	
	// accessable in anonymous block
	
	{
		this.x = 100;
		System.out.println(this.x);
	}
	
	// 2 ] we can access this only in non-static members 
	
	static void not(int x)
	{
	    //this.x = x  ;// this will generate an error 
	    
	}
	
	// 3 ] we can not assign the other reference to this keyword
	        // it is a final entity and initialized with calling object reference
	void show()
	{
		/*
		this  = new Number();		 // will generate an error 
		System.out.println(this.x);
		*/
	}
	
	
}

class Question_7
{

	public static void main(String [] args)
	{
		// this  is a reference variable which stores the refence of the calling object
		Number n = new Number();
		n.set(10);
		
		Number.not();
		
	}

}
