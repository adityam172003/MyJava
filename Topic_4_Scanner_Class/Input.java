import java.util.Scanner;

// remember scanner present in java.util package 

/*
	in and out are the static data members of the class System 
	their datatype is input stream and print stream 
	that is they are the object of the class input and output stream 
	***************************************************************************************************
	
	static data members     : - it always work for the class and accessed using class name and (.) dot
				    operator exa. - : System.in , System.out
	non-static data members : - it always work for the object and accessed using object name and (.) dot
				    operator exa. - : 
				    sc.nextInt()      ==  to scan integer 
				    sc.nextByte()     ==  to scan byte datatype integer
				    sc.nextShort()    ==  to scan short variable
				    sc.nextLong()     ==  to scan Long integer 
				    sc.nextDouble()   ==  to scan double datatype variable 
				    sc.nextBoolean()  ==  to scan Boolean value i.e. true or false
				                           (not case sensitive)
				    ***************************************************************
	here sc is the variable of the type Scanner (actually it is the reference variable 
	which stores the reference to the Scanner object 
	
	--------------------------------------------------------
	new Scanner(System.in) 
	here we create the object using parameterised constructor 
	--------------------------------------------------------
	
	*****************************************************************************************************
	Import 
	:- 
	to use the inBuilt functions in the java we need to import the package and class name
	so 
	import java.util.Scanner 
	------------------------
	
	here util is the package
	     -----       ------- 
	     
	------------------------------------------------------
	the default package imported in program is : -  lang |
	java.lang                                            |
	------------------------------------------------------
	and 
	System.out  System.in are the objects of the class input stream and print stream 
	
	which are defind in stream.io package which is not imported but the System class in defined in
	lang package which is deault imported 
	
	will import the class scanner only not other
	
	-----------------------------------------------------------------------------
	import java.util.* 
	
	will import all the classes and packages available int the util package 
	
	------------------------------------------------------------------------------
	
	******************************************************************************************************
	Scanning charactor 
	
	we cant scan a charactor in the java we can scan the string directly
	         ===================================================================================
	function - - next() is used in java to scan the string
			    it scans the string only till space is not given
			    space ,tab ,/n are the terminating for next()  
			    
	         - - nextLine() will scan whole string with space to terminate enter key is pressed 
	         ===================================================================================
	both the functions returns the string type values 
	
				    
 	in String class we have 
 	charAt(int) 
 	-----------
 	function  which returns the char at the index int 
 	
 	this is non static memebr function of the  String class
 	--------------------------------------------------------
 	String str
 	------
 	str = sc.nextLine();
 	
 	here str is the object of the class String  .. .   . . . 
 	
 	to get char 
 	-----------
 	char ch  =  str.charAt(int) ; will return the char at the index int 
 	----------------------------
 	----------------------------
 	// while scanning char we use the int  = 0;
 	----------------------------------------------
 	thats we sacn the char in java    
				 
	System class is defined in java.lang package which is imported by default 
	


*/




class Input
{
	public static void main(String xyz[])
	{       // the class Scanner is imported to take input in java 
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Enter the number :");
		x = sc.nextInt();
		System.out.println("The number entered is : "+x);
		
		// scaning string in java
		
		String str;
		System.out.println("Enter the string :");
		
		
		// because of the buffer containg /n will terminate the nextLine() function 
		// before intering the string so to remove it we use one more nextLine() function 
		// theis should be done if we are scanning the string after scanning any primitive data type
		
		
		sc.nextLine(); 
		str = sc.nextLine();
		
		System.out.println("String entered is : " + str);
		
		/*
		 	to scan char actually we scan the string and usign charAt(int) function 
		 	we return the char 
		 	next() is enought for scanning char
		 	
		 	charAt(index) is the member function of the class String   
		*/
		
		char ch;
		String chr;
		chr = sc.next();
		ch  = chr.charAt(0);
		
		System.out.println("enterd char is : " + ch);
		
		
	
	}

}
