

/*
	variables are divided in 2 grpups
	
	group 1 ] 
	  	based on declaration 
	  	1) primitive variable
	  	2) reference variable 
		3) static variable
	  	
	  	
	gruop 2]
		based on position
		
		1) instance variable
		3) local variable 
		
	

*/


/*
	Rules to name identifiers 
	
	1 ] can't start with digits 
	2 ] Case sensitive 
	3 ] No length limit 
	4 ] All predefined java classes are used for naming 
	---------------------------------------------------
	We can use only alphabates, Numbers and '_' , '$'  in identifiers 
	
	we should initialize the variable before its first use 
	it gives compiletime error 

	Local variable can not be defined as static 
	base class is also cant be defined private and static 
	
	Variables.java:60: error: modifier static not allowed here
	static class Variable

	
			
		
*/


/*
		
		Reserved Key words in Java 
		
		There are total 53 reserved keywords present in java 
		
		3 	 =  reserved literals  (true , false , null)
		2 	 = unused keywords     (const , goto)
		48	 = used keywords 		rest 
		
		
*/



 class Variable
{
	int x ; // instance variable
	public static void main(String [] args)
	{
	
		// we  can t access the instance variable directly from static context 
		
		
		// x=10; // will generate error 
		
		int a; //  local variable 
		
		
		// local variable is created in stack memory
		
		
		// --- - -- - - - - -- - -- - -- -- -  ---- -  Identifiers in java 
				
				 // name which identify variable , function ,class etc;
				
				
				// _   $   are only allowed if you are using any other 
				// symbol it will gives compiltime error 
				// we cant use reserved keywords as identifier 
				
			 	//	int = if20; java:20: error: not a statement

				
				/*
				
				
				int a@p =  10;
				
				System.out.println(a@p);	
				
				
				generated compiltime error : 
				
				 
				P1.java:19: error: illegal start of type
				int a@p =  10;


				*/ 
				 
				 // these are only names of predefined java class name 
				 // this are not reserved keywords so no error 
				 
				 int String = 10;
				
				
				 
		
	}
}
