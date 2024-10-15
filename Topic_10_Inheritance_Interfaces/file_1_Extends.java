// program 1 ] 


import java.util.*;


/*
	Java has removed multiple inheritance to avoid ambugity problem
	
	It implements multiple inheritance using Interface 
						----------
						
	To inherite one class in another we use extends keyword |				
						-------
	To inherite members from parent class become available for child class also |
	
	
*/



class Parent  
{
	public int    a;
	public String s;
	
	
	 void getData()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		a =sc.nextInt();
		System.out.println("Enter the name")  ;
		
		sc.nextLine();
		s = sc.nextLine();
	}
	
	
	void showData()
	{
		System.out.println("Name = "+s);
		System.out.println("a    = "+a);
	}
	
}


class Child extends Parent
{
	int p;
	
	public void getData()
	{
		super.getData();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		p =sc.nextInt();
		
	}
	
	public void showData()
	{
	
		super.showData();
		System.out.println("a    = "+p);
	}
	
	
}


/*
	only 	
		1 ] public 
		2 ] protected
		3 ] default 
		
	members  from the parent class becomes available for the child class
	private members does not get inherited but 
	Yes, memory does get allocated for private members of the superclass
	in the subclass object, even though those private members are not directly
	accessible from the subclass.

	here remember that we can access those private methods and member function using the 
	subclass object inside the super class 

	// but memory is allocated to each and every non-static data memebre inspite 
		of access specifiers 
	// refer Memory.java for more information 


	


	if we make getData() private 
	
		error will be like 
		
		==>
		
		
		Extends.java:54: error: getData() has private access in Parent
		super.getData();
		
		
		==>
		
		
	

*/

class file_1_Extends
{
	public static void main(String []args)
	{
		Child c = new Child();
		
		c.getData();
		c.showData();
	}
		
}



