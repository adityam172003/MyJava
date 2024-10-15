// first program about classes and objects in java


// 1 ]  Defining the class 

// reference : https://www.tutorialspoint.com/java/java_object_classes.htm

/*	

	some rules you should know about the oop in java 

	1 ] There can be only one public class per source file.

	2 ] A source file can have multiple non-public classes.

	3 ] If the class is defined inside a package, then the package statement should be the first statement in the source file.
	
	accessModifier class className  [extends / implements ] [parent class name / Interface name ] 
	{

		// static data member  

		// non-static data members  - instance variable 

		// blocks

		// constructors 

		// static methods 

		// non-static methods 

		// distructor  finalize() method ;

	}


	private classes are not possible but inner private classes are possible 
	static classes are not possible but inner static classes are possible 


 */

 




/*


class Class_Name
{

	// data members  static /non-static
	

		Access_specifiers [static] data_type variable_name;
		.
		.
		.
		.

	
	//memeber functions  static /non-static
	

		Access_specifiers [static] return_type function_name(parameters)
		{
			body of the function
			
			// we should define function where it is decleared 
			====================================================
			
		}

	
}

*/

import java.util.Scanner;
class Student
{

	public int age;
	public int roll;
	private static Scanner sc = new Scanner(System.in);
	public void get_Data()
	{	
		System.out.println("Enter the age and roll of the student");
		age  = Student.sc.nextInt();
		roll = Student.sc.nextInt();
	}	
	
	public void show_Data()
	{
		System.out.println("age : "+ age + " roll : " + roll );
	}

	// here you can observe that we can write public static or static public 
	// but we cant change the position of return  type from function name 
	
	static public void myfun(){

	}
}



public 	class file_1_Program_1
{

	public static void main(String...xyz)
	{
		Student  s1 = new Student();
		s1.get_Data();
		s1.show_Data();
	
	}
}	


/*
	we create an object in two steps 
	
	1  ] decleare the reference variable of the class;
	2  ] create an object using new keyWord and assign it to the reference variable
	
	
	// always prefer the factory method to create the object of the class 
	// which make it more secure and effective also reduces the code length 

	// because if we want to apply some conditions on the process of creating the object then 
	// it is very useful we just change the function definition here thats it 

	-----------------------------------------------------------------------------------------
	
	Various ways to create object of the class 

	1 ] using new keyword 
	2 ] using newInstance() method in reflect package 
	3 ] clone method provided cloneable interface should be implemented 
 

	when jvm loads the class file into the main memory 
	it creats the object of the class 
	we can get that object using 
	Class.forName("class name") method 

*/






