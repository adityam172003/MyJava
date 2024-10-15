// program 5 ]

import java.util.*;
// overring static members 

/*
 static methods in Java cannot be overridden.
 ============================================ 
 However, they can be hidden. Static methods belong to the class itself, 
 not to instances of the class, so the concept of overriding
 (which is tied to polymorphism and runtime behavior) does not apply to static methods.

Static Methods are Class-Level:
==============================
Static methods are associated with the class rather than the instances (objects) of the class.
Since they are not tied to a particular object, they do not participate in runtime polymorphism 
(the mechanism that allows method overriding).


Static Method Hiding:
====================
If a subclass defines a static method with the same signature as a static method in the superclass,
the subclass’s method hides the superclass’s static method. This is called method hiding, 
not overriding.

Unlike instance methods, the version of the static method that is executed depends on the reference
type, not the object type.

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
