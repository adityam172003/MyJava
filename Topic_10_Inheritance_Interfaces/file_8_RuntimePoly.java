
/*
 
	In Java, data members (fields/attributes) are not overridden in the same way as methods.
	Instead, data members are shadowed if a subclass defines a field with the same name as 
	one in its superclass. Only methods (member functions) can be overridden in Java.

	static methods in Java cannot be overridden. However, they can be hidden. 
 */



class Grand 
{
	int p ;
	Grand()
	{
		System.out.println("Grand constructor");          
	}
	
	static
	{
	
		System.out.println("Grand Static block");  
	}
	{
		System.out.println("Anonymous block of Grand class");
	}
	
	public void show()
	{
		
	}	
		
}

class Parent extends Grand
{
	private int x;
	int p;
	
	Parent()
	{
		System.out.println("Parent constructor");
	}
	
	Parent(int x)
	{
		this.x=x;
		p=20;
		System.out.println("Parameterised constructor of parent is called ");
	}
	static
	{
	
		System.out.println("Parent Static block");  
	}
	{
		System.out.println("Anonymous block of parent class");
	}
	
	public void show()
	{
		System.out.println("parents show x = "+x);
	}
}


/*
	To pass the parameters to parent constructors from child 
	we have to use super keyword 
		      -------
	
	** here the super statement must be the first statement 
	in constructor 
	you can not write any statement before super statement 
	
			      
			    
*/

class Child extends Parent
{
	int p;

	Child()
	{
		p=30;
		// this line gives verifyError 
		//super(); PARENT CONSTURCTOR WILL BE CALLED ONLY ONCE RITHER YOU CALL IT USEING SUPER OR NOT
		
		System.out.println("Child constructor");
		
	}
	
	Child(int p,int n)
	{
		super(n);
		this.p=p;
		System.out.println("Parameterised constructor of child class is called");
		
	}
	{
		System.out.println("Anonymous block of child class");
	}
	
	static
	{
	
		System.out.println("Child Static block");  
	}
	public void show()
	{
		System.out.println("child show  p ="+p);
		super.show();
	}
}
// first all static blocks and then constructors will be calleddd


/*

	Basic requirnment for runtime polymorphism
	
	1  ] super class reference variable can refer it's derived classes reference 
	
	2  ] Function should be overrident 
		The function should be overriden in child class
		here in grand if there is no show() then
		--------------------------------------------------
		RuntimePoly.java:122: error: cannot find symbol
		p.show();
				 ^
		symbol:   method show()
		location: variable p of type Grand
		RuntimePoly.java:123: error: cannot find symbol
				c.show();
				 ^
		symbol:   method show()
		location: variable c of type Grand
                ---------------------------------------------------
                error will be generated 
                
                
	
	3  ] function will be called according to the content in the reference variable 
	
	
	
*/


class file_8_RuntimePoly
{
	public static void main(String [] args)
	{	
		
		Grand  c = new Child();	
		Grand  p = new Parent();
		p.show();
		c.show();
		
		System.out.println(p.p +" "+ c.p);
		/*
		
		Child  c = new Child(24,48);
		c.show();
		System.out.println("========================");
		Parent p = new Parent();
		System.out.println("========================");
		Grand  g = new Grand()
		
		*/
		
	}
}
