class Grand 
{
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
															
	
}

class Parent extends Grand
{
	private int x;
	
	Parent()
	{
		System.out.println("Parent constructor");
	}
	
	Parent(int x)
	{
		this.x=x;
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


class Static_Block
{
	public static void main(String [] args)
	{	
		
		Child  c = new Child();	
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
