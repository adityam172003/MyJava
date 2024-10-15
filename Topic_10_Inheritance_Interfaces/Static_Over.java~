// program 5 ]

import java.util.*;
// overring static members 

/*
 	1 ] It is possible to override static member function
 	2 ] it can be overrid using static keyword only
 	3 ] Access speccifier rules are same 
 	4 ] to call  overrided static memeber function from child class use class name and (.) dot operator 
 	
 	


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
	 
	 static void disp()
	 {
	 	System.out.println("static member of parent class");
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
		System.out.println("p    = "+p);
		disp();       //this static disp will call the disp method of this child class
		super.disp(); // this static disp will call the disp method of parent class 
	}
	static void disp()
	{	// super.disp(); we can not use supre from static context  
		System.out.println("Static memeber of child class");
	}
	
}






class Static_Over
{
	public static void main(String []args)
	{
		Child c = new Child();
		
		c.getData();
		c.showData();
	}
}
