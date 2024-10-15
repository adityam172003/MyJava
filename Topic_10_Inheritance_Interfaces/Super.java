// program 4 ]

import java.util.Scanner;

// the supre keyword



/*
	1 ] we use super keyWord to access the non-static members of the parent class
	2 ] it is non-static keyWord we can use it only inside the non-static member function 
	3 ] super can refer to the memeber function of parent class only 
		if the acccessing member is not present in the parent class
		it will generate an error
		even if the membre present in the child class..............
                       
    4 ] it can access the grand parent class data also using super but it should not be 
		present in parent class it is like hierarchy if not parent then check in grand parent  	          
	 the super statement can be first statement can be the last statement  in the program
	 but this rule will change in the contructor
	 
	 
	 we can use super inside non-static context only
	 
	 but we can access static members of parent class using super keyWord  from
	 non -static context of child class 
	 
	 

	 if we are calling parameterised constructor then only parametersized constructor 
	 of parent will be called using super and no default constructore is executed 
	 
	 only one constructor is called we cant call one constructor multiple time 
	 
*/

class grand{
	int ab=20;
	public grand(){

		System.out.println("Grand constructor is called ");
	}
}

class Parent  extends grand 
{
	public int    a;
	public String s;
	public static int st=2000;


	public Parent(){
		System.out.println("Parent constructor is called ");
	}

	public Parent(int a){
		this.a =a;
		System.out.println("Parent parameterised constructor is called ");
	}


	public static void f()
	{
		System.out.println("Static contest ");
	}
	
	 void getData()
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number in parent class");
		a =sc.nextInt();
		System.out.println("Enter the name")  ;
		
		sc.nextLine();
		s = sc.nextLine();
	}
	
	
	void showData()
	{
		System.out.println("Name = "+s);
		System.out.println("a in parent class   = "+a);
	}
	
}


class Child extends Parent
{
	int a;
	/*
		error will generate 
		
		lenovo@LENOVO-PC:~/Java_Programming/Inheritance_Interfaces$ javac Super.java 
		Super.java:63: error: non-static variable super cannot be referenced from a static context
					super.f();

		super belongs to non-static context we cant use it in static context 
		but we can access static members using super keyword 
		
	public static void static_S()
	{
		super.f();
	}
	*/
	
	public Child(){
		
		super();
		
		System.out.println("Child default constrcutor is called ");

	}

	public void getData()
	{
		super.f();   // we can access static methods 
	
		super.getData();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number in child class "); 
		super.a =sc.nextInt();  // accessing parent's   data memebr a <--------|||||||
		System.out.println("accessing static member of parent class using super = "+ super.st);
	}
	
	public void showData()
	{
		
		
		super.showData();
		System.out.println("in grand + " + super.ab);
		System.out.println("a in child class  = "+a);
	}
	
	
	
	
}


class Super
{

	public static void main(String [] args)
	{
		Child c = new Child();
		c.a = 10;
		System.out.println(c.a);
		c.getData();
		c.showData();
		System.out.println(Child.st);
	
	}
	
	


}

