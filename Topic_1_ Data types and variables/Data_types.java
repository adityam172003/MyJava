// java version : openjdk 17.0.8.1 2023-08-24

import java.math.BigDecimal;

class P1
{

	/*
	  	Java has two types of data types 

		1 ] primitive  
		2 ] non-primitive 

		basic range formula =  -2^n to (2^n)-1;

		for more reference : https://www.javatpoint.com/java-data-types

		
		Primitixve data types:
		  The primitive data types include
		  boolean, char, byte, short, int, long, float and double.
		  There are total 8 types of primitive data types in java 

		Non-primitive data types: 
		  The non-primitive data types include Classes, Interfaces, and Arrays.



										Data types 
											|
											|
											|
		            -----------------------------------------------------
					|												    |
					|												    |
				Primitive 										    Non-Primitive
					|												    |
					|													|
		----------------------------									|
		|						   |									|---> Strings
		|						   |									|---> Arrays
		|						   |									|---> Classes
		|						   |
		|						   |
	Boolean  					Numeric
		|						   |
		|						   |
		|						   |
		|					-----------------
	boolean 			    |               |
					        |				|
							|				|
						Charactor		Integeral
							|				|
							|				|
							|				|
						   char				|	
											|
											|
									-----------------
									|				|
									|				|
								Integer			Floating-Point
									|				|
									|				|
									|				|
									|				|
				-------------------------		    |-------------
				|		|		|    	|				|		 |
			  byte	   short   int     long			  float     double
 


		Default values for the data members 
		
		byte     : 0
		short    : 0
		boolean  : false
		char 	 : space '\u0000'
		int      : 0
		String   : null





	 */								


		
		public static void main(String[] args)
		{
				System.out.println("Data types in java ");
				
				
				// data types 
				
				
				// 1] byte size = 1 byte 
				// range    : -128 to 127 
				
				/*
				
				
				byte b = true;
				
				
				P1.java:51: error: incompatible types: boolean cannot be converted 	
				to byte
				
					
				
				*/
				
				
				// 2 ] short size 2 byte 16 bits 
				// range :-32768 to 32767

				
					
				//short i = 327678;
				/*
				
				16 bit processors uses short datatype 
				
				
				as there are not 16 bit prcessors present nowdays 
				so short datatype is not much in use 
				
				
								
				P1.java:71: error: incompatible types: possible lossy conversion 	
				from int to short
				short i = 327678;

				*/
				
				
				// 3 ] int size 4 bytes
				// range : -2,147,483,648 to 2,147,483,647

					// int data type is uesd to represents the whole number 
					// default data type used in java every given integer is of type int 


					
					
					/*
					int z = 20000000000000;
					
					P1.java:91: error: integer number too large
					int z = 20000000000000;

					
					*/
					
					
					/*
						int nz = 12000000000l;
						long nnum = 20000000000000000; // it will reais the compile time error 
					     ----------------------------


						** it dosn't matter where you are storing the number in long or in int 
						 // the default is int and you will have to suffix it with l or L 



						there is slight change in the error when we give long value
						to int 
						
						as default value  given is int and so 
						
						
						
								
						P1.java:101: error: incompatible types: possible lossy 	
						conversion from long to int
						int nz = 12000000000l;

					
					*/
				

				
				
				// 4 ] long size 8 byte 
				// range : -2^63 to (2^63 )-1 
				 
					// length method of file system has return type long 
					
					long num = 12000000000l ; // it should be suffixed with l 
					// compile time error  
					System.out.println(num);
					
				
				
	// all the above data types are meant for integers and not for real numbers 
	// fractional numbers 
	
	
	// floating point data types 
			
				// 5 ]  float size 4 byte  6 ] double size 8 bytes 
				
			 	System.out.println((float)10/(float)3);
			 	//3.3333333

					// accuracy up to 7 decimal places 
					
				System.out.println(10.0/3.0);
				//3.3333333333333335 
				// upto 17 decimal places 
				
				// default floating number data type is double 
				//============================================

				
				
				//Java strictfp keyword ensures that you will get the 
				//same result on every platform if you perform operations
				// in the floating-point variable :https://www.javatpoint.com/strictfp-keyword
	
				// float,Double value should not be used in case of precise values such as currency 
				//-------------------------------------------------------------------------


				// for that purpose BigDecimal class is used 

				BigDecimal dc1 = new BigDecimal("10.203");
				BigDecimal dc2 = new BigDecimal("10.200");
				dc1 =dc1.add(dc2);

				double d11 = 10.203;
				double d22 = 10.200;

				System.out.println(d11+d22);

				System.out.println(dc1);

	// boolean size virtual machine dependent 
	
		// default value of boolean is = false 
		/*
			boolean b = True;
			
			
			1.java:156: error: cannot find symbol
			boolean b = True;
				        ^
			  symbol:   variable True
			  location: cl
					
		*/
		
		
		// charactor 
		
		// 1 ] char  size == 2 byte  - > 
	    //	range : 0 to 65535 unsigned 
		
			//  unicode character 	
			/*
				So to support multinational application codes, 
				some character was using single byte, some two.
				An even same code may represent a different character in 
				one language and may represent other characters in another language.
				To overcome above shortcoming, the Unicode system was developed where
				each character is represented by 2 bytes. As Java was developed for
				multilingual languages it adopted the Unicode system. 

			 */
			// There are two type we can provide unicode chars in java 
			// ============================================================
			/*


			 		1 ] escape charactors 
						ex char ch = '\u0041' 
						hexa decimal number prefix with '\u0041' representing unicode char 

					2 ] direct storing in char variable if we can able to type it using
						key board 

				for more reference 
				:https://www.tutorialspoint.com/java/java_unicode_system.htm#:~:text=An%20even%20same%20code%20may,it%20adopted%20the%20Unicode%20system.

			 */
			System.out.println((int)(char)(65536)); // overflow will say unsizned property 
			char ch11 = '\u0061'; // it takes it as hexa decimal number 
			System.out.println("ch = " +ch11+" "+Character.hashCode(ch11));
			System.out.println('\u0042'+" "+0x0042);
			System.out.println('\u0041');
			ch11 ='A';

			// this function will return the numeric value for charactors 
			// for a to z = 10 to 35 
			// for A to Z = 10 to 35 
			// irrespective the case 
			System.out.println( "Numeric value of "+ch11+" "+Character.getNumericValue(ch11));
					
//   ============================================================================================		
			
		
		// declearign the numbers in octal , hex and binary format 
			
			// 1 ] octal
			// prefix 0 (zreo) is used to declare number in octal form
			int a = 016;
			System.out.println(a);	// 14 //  8+6
			
			// 2 ] hex 
			
			// prefix 0x or 0X   is used to declare numebr in hex format 
			int hex = 0x10;
			
			System.out.println(hex);  // 16 
			
			
			// 3 ] binary 
			// prefix 0b ot 0B is used to represent numebr in binary format 
			
			int bin = 0b1001;
			
			System.out.println(bin); // 9 
			
			
			
			
			
			
		}

}








