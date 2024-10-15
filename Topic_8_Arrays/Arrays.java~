
/*
		COLLECTIO OF ELEMENTS HAVING SAME DATA TYPES
		
		
		ARRAY IN THE JAVA IS CREATE ONLY AT RUNTIME SO IT IS A 2 STEP PROCESS
		
		1 ] DECLARE REFERENCE VARIABLE 
		
		2 ] CREATE THE REFERENCE
		
		
		EX:
		 int[] arr = null; 		1 ] creating the referene variable 
		 
		 arr = new int[10]		2] creating the array at runtime it returns the refernce variable
		 
		 
		 that is why the array created in heap and refence is returned 
		 
		 
		 
		 general 
		 
		 data_type[] variable_name = new data_type[size];
		 
		 if ve provide -ve size then jvm will generate the exception : NegativeSizeException
		 
		 


*/




public class Arrays
{
	
	public static void main(String [] args)
	{
		System.out.println("Arrays in Java");
		
		// array declaration 
		
		int[] x = new int[10]; // this declaration is good practice  because name is clearly seperated from declaration 
		// every element is initialized with default value 0;
		
		int[] p=null; // should be initialized as null if not declared 
		// at the time of array creation specify size other wise it will generate compiletime error 
		// data type of size can be 
		// 1 ] int 
		// 2 ] short 
		// 3 ] byte 
		
		// only no other data types are allowed other wise we will get compile-time error
		
		
		// it is a liggle to have an array of size 0 ;
		 int[] zero = new int[0];
		 zero.length = 10;
		 /*
		 compiletime error 
		 	Arrays.java:26: error: cannot assign a value to final variable length
			 zero.length = 10;
		 */
		
		try
		{
			p = new int[-2]; 
			// it will not generate compiletime error it will genetate runtime exception
			
		
		//	Exception in thread "main" java.lang.NegativeArraySizeException: -2
		//	at Arrays.main(Arrays.java:22)

			System.out.println(p[0]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		try
		{
			p = new int[10]; 
			// it will not generate compiletime error it will genetate runtime exception
			
		
		

			System.out.println(p[11]);
			
			/*
				java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 10
			*/
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		// two-three dimentional array declaration 
		
		int[]  []a,b[] = null;
		
		int[][][] three_d=null;
		int[] three_d1[][] = null;
		
		// every array in the java is a object of class 
		
		 int[][][] a1=null;
		a1 = new int[2][3][3];
		System.out.println(a1.getClass().getName()); // class name = [[[I 
		
		int[][] a2=null;
		a2 = new int[2][3];
		System.out.println(a2.getClass().getName()); // class name =[[I
		
		// this java classes are part of java language and not avaiable for programmer leve 
		// similarlly we have [D,[S,[B,[C like that I FOR INT C FOR CHAR D FOR DOUBLE so on ..
		
		//================================================================================
		
		// 2 - D array 
		
		
		int[][]  arr2D=null;
		
		
		// this is called jagged array in java 
			arr2D =new int[10][];
		
		       // int[][] arr2D =new int[10][]; 
        
			for(int i=0;i<arr2D.length;i++)
			{
			   arr2D[i]=new int[i+1];
			   for(int k=0;k<arr2D[i].length;k++)
			   {
			       arr2D[i][k]=k;
			   }
			}
			
			
			for(int[] b1: arr2D)
			{
			    for(int c :b1)
			    {
				System.out.print(c+" ");
			    }
			    System.out.println("");
       		       }
			
		
		
		
		// when we print the arary like 
		
		System.out.println(arr2D);  //  [[I@18b4aac2

		// it will call toString() method internally which prints 
		
		// className@Hashcode 
		// like for above 2D array : -  [[I@{systemgenerated hash code}
		
		//====================================================================================
		
		
		// while solving the questions based on multidimentional array then convert the array declaration in memory 
		// declaration 
		
		
		
		// length 
		
		/*
			in the concept of array length is a property it is not method 
			
			therefor :    arr.length      is valid but not arr.length() 
		
			length is final variable applicable for array 
			
			
			arr.length() will generate compiletime error 
			
			 	
		*/
		
		
		//-------------------------------------------------------------------------------------------------------------------------------
		
		// ANONYMOUS ARRAYS 
		
		/*
			the array created for the instant purpose only which has no any name is called anonymous array 
			
		*/
		sum(new int[]{10,20,30,40}); 
		// this is called anonymour array . Here we cant specify the size other wise it will generate c
		// compiletime error 
		
	arr2D =	new int[][]{{10,20,30},{10,20}}; 
		// we  can create multidimentional anonymous array also 
			//= ===========================================================================
	
	
	// char array cant be converted to int array 
	// element level conversion cant be possible in array 
	
	
	// child type array can be converted to parent type array 
	
	// when we assign one array to another array actually references are assigned 
	
	// while assigning one array to another array we should consider the dimentions of  the array
	
	// we cant assign 1D array to 2D array it will generate compiletime error 
	
	// data types also should be matched 
	
	
	String[] argh = {"aditya"};
	args = argh; // we can assign it
	
	for(String str:args)
	{
		System.out.print(str+" ");
	}
	System.out.println(" ");
		

		
	}

	
	public static void sum(int[] arr)
	{
		for(int a: arr)
		{
			System.out.println(a);
		}
	}
	
	

}




/*
	Exceptions in the program
	
	1 ] NullPointerExcaption
	2 ] NegativeArraySizeException
	3 ] ArrayIndexOutOfBoundsException  
	

*/
