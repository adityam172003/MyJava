
// Access 		Class Package	Subclass 		Subclass 			 Other Classes
// Modifier						(Same Package)	(Different Package)
// public	    Yes	  Yes		Yes				Yes					 Yes
// protected	Yes	  Yes		Yes				Yes					 No
// private	    Yes	  No		No				No					 No
// default 		Yes	  Yes		Yes				No					 No



// private methods cant be overriden 
// static methods cant be overriden 







class Grand 
{
	Grand()
	{
		System.out.println("Grand constructor");          
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
		System.out.println("Child constructor");
		
	}
	
	Child(int p,int n)
	{
		super(n);
		this.p=p;
		System.out.println("Parameterised constructor of child class is called");
		
	}	
	public void show()
	{
		System.out.println("child show  p ="+p);
		super.show();
	}
}



class Costructors
{
	public static void main(String [] args)
	{	
		Child  c = new Child(24,48);
		c.show();
		/*
		System.out.println("========================");
		Parent p = new Parent();
		System.out.println("========================");
		Grand  g = new Grand()
		*/
	}
}
