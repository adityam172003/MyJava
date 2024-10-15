// program 2 ]

import java.util.*;
/*
	Memory allocation 
		
		1 ] In inheritance access specifiers does not interfare in the memeory allocation
		
		2 ] All the data memebres of all the parent classes gets memory inside child class memory
		
		3 ] But private data memebres are not accessable inside the child class
		    they can be accessable only parent class member function 
		    
	Ptivate is not inherited 	    
		    
*/


class Parent  
{
	public int    a;	   // here d can be accessed only from member function of parent 
						  // class
	public String s;
	private int d;
	public static Parent prt;
	
	
	 void getData()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		a =sc.nextInt();
		System.out.println("Enter the name")  ;
		
		sc.nextLine();
		s = sc.nextLine();
		d =20;
		System.out.println(this.hashCode());
		System.out.println(prt.hashCode());
		
	}
	
	
	void showData()
	{
		System.out.println("Name = "+s);
		System.out.println("a    = "+a);
		System.out.println("d    = "+d);
		System.out.println(this.hashCode());
	}
	
}


class Child extends Parent
{
	int p;
	
	public void getData()
	{
		System.out.println(this.hashCode());
		super.getData();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		p =sc.nextInt();
		
	}
	
	public void showData()
	{
	
		super.showData();
		System.out.println("p    = "+p);
	}
	
	
}


class file_2_Memory
{
	public static void main(String []args)
	{
		Child c    = new Child();
		Parent.prt = (Parent)c;
		c.getData();
		c.showData();
	}
}
