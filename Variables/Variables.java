

/*
	variables are divided in 2 grpups
	
	group 1 ] 
	  	based on declaration 
	  	1) primitive variable
	  	2) reference variable 
	  	
	  	
	gruop 2]
		based on position
		
		1) instance variable 
		2)static variable
		3)local variable 
		
	

*/

class Variable
{
	int x ; // instance variable
	public static void main(String [] args)
	{
		// we  can t access the instance variable directly from static context 
		
		
		x=10; // will generate error 
		
		int a; //  local variable 
		// local variable is created in stack memory
		
	}
}
