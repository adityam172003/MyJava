import java.util.*;

class Wrapper_class

{	
	/*
		Wrapper classes 

		all wrapper classes are final we cant override them 
		all the wrapper classes are present in java.lang package 

		reference : https://www.tutorialspoint.com/java/java_wrapper_classes.htm

		yt reference : https://www.youtube.com/watch?v=dkSk7ImnGKs&list=PLKkXFKhlvyUrkgefi2m163Fg6uDjCyiY1&index=3
		java is not completely Object Oriented Programming language 
		
		because of the some primitive data type 
		exa. : - int ,char ,float ,double, byte 
		
		so java has made some classes based on this data type 
		
		sometime we create the object of such classes to fulfil our 
		requrinments 
		
		int     - Integer 
		short   - Short
		byte    - Byte 
		long    - Long 
		float   - Float 
		double  - Double 
		boolean - Boolean
		char    - Character 
		
		to chack the size of each data type there is the static data 
	        member  defined in each 
		wrapper class except
		Boolean 
		
		: - BYTES
		-----------
		------------
		
		BOXING IN WRAPPER CLASSSES 

		Auto boxing (valueOf method is used )
		Converting primitive data types into object is called boxing
		
		un boxing  (parsePrimitive() method is used here just replace Primitive to Respective primitive data type )
		And the Wrapper object will be converted back to a primitive data type, 
		and this process is called unboxing
		


		Parent class of all the Numeric wrapper classes is Number(Abstract) class which is the 
		part of java.lang package 



		What are the different ways to get the number in octal , decimal, hex and binary format 
		1 ] static methods present in Integer class
		2 ] static method toString(int , radix) which return the required string in format 



					+<------------------ String ---------------------->+
					|					|	    |					   |
					|					|		|    				   |
					|					|		|   				   |
					|					|		|   				   |
					|					|		|					   |
				valueOf()(static)   toString()  toString()(static)	parsePrimitive() (static)
					|					|		|					   |
					|					|		|					   |
					|					|		|					   |
					|					|	 	|		               |
				Wrapper---------------->+		+<------------------Primitive
				 Object 											   |
					|-->------------->primitiveValue()---------------->|
					|												   |
					|												   |
					|<----------------valueOf()<-----------------------|






	
	*/	
	public static void main(String [] args)
	{
	
	    System.out.println("size if byte   data type : " + Byte.BYTES      +" byte");
	    System.out.println("size if short  data type : " + Short.BYTES     +" byte");
	    System.out.println("size if int    data type : " + Integer.BYTES   +" byte");
	    System.out.println("size if float  data type : " + Float.BYTES     +" byte");
	    System.out.println("size if double data type : " + Double.BYTES    +" byte");
	    System.out.println("size if char   data type : " + Character.BYTES +" byte");
	
	   //------------------------------------------------------------------------------------
	
	    
	    
	    
	    // Integer 
	    //        fin =20;  -- it generates an error 
	    Integer i = Integer.valueOf(10);
		
        System.out.println(Integer.toBinaryString(135)+ " "+Integer.toBinaryString(Integer.reverseBytes(135))); 
        System.out.println(Integer.reverse(135)>>>(int)(Math.log(Integer.lowestOneBit(Integer.reverse(135)))/Math.log(2)));
        

        System.out.println("i = " + i.getClass().getName() );
		// here the given string is in the form of the number base radix 
		// and it will return its decimal format of base 10 

		// max radix is =36 only 



		System.out.println(Integer.valueOf("10001",2));

		// some common methods in wrapper classes 

		// 1 ]  valueOf    ------ non-static method 
			// ---------
		// this method is used for auto-boxing or boxing 

		// valueOf method is used to get wrapper class object 
		/*
		 * Now constructors are also used for that purpose but in valueOf 
		 * 
		 * it uese the immutability property which utilizes the existing object to reuse 
		 * or to reassigne which makes it fast and less time consume 
		 * 
		 * this is the main difference between valueOf method and constructors 
		 */


		// Integer integer = new Integer(null);
		// both throws NumberFormatException cannot parse null string 
		// System.out.println(integer);

		Integer in  = new Integer(10); // new object gets created in heap and pool 

		Integer nin = Integer.valueOf(10); // check if object is already present in  pool or not 
		// depeinding on the presency it creates the new object 
		Integer nnin = Integer.valueOf(10);	// now here 10 is already present in the pool 
		// so no new object is created therefore the hashcode of nnin and nin are same here 
		System.out.println(System.identityHashCode(nnin) + " " + System.identityHashCode(nin));
		System.out.println(nin.hashCode() + " " + nnin.hashCode() );
		System.out.println(nnin==nin);
		/*
		 * There are three types of valueOf methods 
		 * 1 ] parameter is string 
		 * 2 ] parameter is string and int radix 
		 * 3 ] parameter is respective primitive value
		 */


		 // 2 ] ---Value()
		 //    ------------
		 // to find the premitive value we go for this method 

		 // these methods are used for un-boxing 

		 int a 		= in.intValue();
		 byte aa 	= in.byteValue();
		 short sh	= in.shortValue();
		 double dd  = in.doubleValue();
		 float ff   = in.floatValue();
		 long ll    = in.longValue();


		 // all wraper class contains these 6 methods 


		 System.out.println(in.toBinaryString(a));
		

		 // 3 ] parsePrimitive(stirng );
		 
		 int parsedInt = Integer.parseInt("10");
		 System.out.println(parsedInt);

		 // 4 ]  toString(primitive );
			//  valueOf method in String class internally calls toString method 
			// implemented in Object class 
		//every wrapper class contains the static toString method 
		String staticToString = Integer.toString(100);

		// this is non-static member function overriden from Object class 
		 System.out.println(in.toString());



		 Boolean bool = Boolean.valueOf(null); // this is false for boolean wrapper class 
		 // keep it in mind this is different for other 
		 bool = Boolean.valueOf("anything else"); // except true,True,TRue or other combination 
		 //  value of bool will be false 

		 System.out.println(bool);






		// work with Boolean wrapper class 

			
	}


	Boolean bool1=  new Boolean("Depricated");
	Boolean bool = Boolean.parseBoolean("Content dosent matter ");
	Boolean bool2 = new Boolean(true);




}
