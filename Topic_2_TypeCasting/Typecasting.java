
class TypeCasting
{
	
	/*
		
		
		There are two type of type casting 
		
		------------------------------------------------------------
		1 ] Implicit type casting   byte -> short -> char -> int -> long -> float -> double                              |
		                                                                          |
		2 ] Explicit type casting                                 |
		------------------------------------------------------------
		
		
			
		JVM follows two rules while type casting the variable 
		
		1 ] Both data types must be compatible with each other 
		2 ] JVM never allows the type casting which results in loss of value 
		=========================================================
		
		
		
		Smaller data types always converted in larger data types 
		
		otherwise complier will generate error like 
		
		Uncompilable code - incompatible types: possible lossy conversion from int 
		to short	
		
		
		boolean data type : - 
		
		* ] In java Boolean values are not integer values 
		they are only types of true and false nothing else 
		
		* ] boolean variables are never campatable with any data type 
		they cant be type casted either implicit or explicit 
		
		
		
	*/
	
	public static void main(String args[])
	{	
	
		
		boolean a = true;
		
		System.out.println(a);
		
		
		char ch = (char)65535;
		//System.out.println(Integer.parseInt(ch+"")); numberFormatException 
		
		byte b =128;
                // error is like 
                /*
                	byte b = 128 :- causes this error 
                	Typecasting.java:50: error: incompatible types: possible lossy conversion from int to byte
			byte b = 128;
		         ^
			
			
			this  error  says : possible lossy conversion means we can explicitely type cast byte to int 
			which cause the loss in the value of the variable    
                */	
		
	//	int p ="compile time error";
		/*
			Typecasting.java:60: error: incompatible types: String cannot be converted to int
			int p ="compile time error";
			     ^
		*/
		
		
			boolean bl = True;
	      /*
	      
	            Typecasting.java:69: error: cannot find symbol
	            boolean bl = True;
					    ^
		   symbol:   variable True
		   location: class TypeCasting

	      
	      */
	      
	      // we can represent the numbers in int oct and hex format 
	      
	      int h = 0X19;
	      
	      System.out.println(h); // this will print the int value rither we have assigned the hex
	    /*  
            double dh= 0x19.0;
	          /\
		     /  \
		      |
	      malformed floating point literals 
	      Exception in thread "main" java.lang.RuntimeException: Uncompilable code - malformed floating-point literal
	    
	    int h1=0xa.a;
	    
	    System.out.println(h1);
	    
	    Typecasting.java:94: error: malformed floating-point literal
	    int h1=0xa.a;
	           ^

	    	    
		*/
	    
	 double h2= 0.1e10;
         System.out.println("h2 = "+h2);  //  1.0E9 
         
         //-=----------------------------------------------------------------------------------------------------------------------------------------------------------------------
         
         
         // char literals 
         
         
         char ch1 = 'a';
         
         System.out.println(ch1);
         
        char ch3 = 'a';
        System.out.println("ch3= " +Character.hashCode(ch3)); // hash code returns the Unicode value 
        
         char ch11 = '\u0061'; // it takes it as hexa decimal number 
        System.out.println("ch = " +ch11+" "+Character.hashCode(ch11)); // hash code returns the Unicode value 
        int p =0x61; // hex number 
        System.out.println("p = "+p); // 97
        
        char ch2= '\t';   // char  can define escape charactors 
        
        int trial_1= 1_223_1;
        
        System.out.println(trial_1);
        
        
		
	}
}
