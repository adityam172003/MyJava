/*
	Abstract classes
	
	
     1]	To declare the function as abstract we have to use abstract keyWord
     							  -------          
     2] Absract function does not have body
     
     3] class containing abstract function must be declared as abstract
     
     4] class can be declared as abstract wuthout containing abstrace function
     
     5] abstract class may contain normal member functions and data members 
     
     6] abstract class can have constructors also
     
     * We can not create the object of abstract class but we can create its reference 
       variable (Necessary for runtime polymorphism)
       
     abstract class can not be instantated so we can only use it as super classs
     or base class for implementation of other child classes 
     
     
     class inherite abstract class called implementation class
     
     
     when implelentation class inherite abstract class it has to override all
     the abstract method 
     
     if not the class must be declared as abstract
      	
*/



abstract class Grand
{
	int a;
	
	public Grand()
	{
		
	}
	
	public Grand(int a)
	{
		this.a = a;
	}	
	abstract public void show();
	
	public void disp()
	{
		System.out.println("In the disp function "+a);
	}
}

/*
	if we do not override show() it will give error like 
	
	enovo@LENOVO-PC:~/Java_Programming/Inheritance_Interfaces$ javac Abstract.java 
	Abstract.java:58: error: Myclass is not abstract and does not override abstract method show() in Grand
	class Myclass extends Grand
	
	
	either we can make Myclass Abstract or override show() ;


	
	
	

*/

class Myclass extends Grand
{
	int p;
	Myclass(int a,int b)
	{
		super(a);
		p=b;
	}
	
	public void show()
	{
		disp();
		System.out.println(" Inside show method "+p);
	}
	

}



/*
	if we create an object of abstract class here Grand 
	
	lenovo@LENOVO-PC:~/Java_Programming/Inheritance_Interfaces$ javac Abstract.java 
	Abstract.java:93: error: Grand is abstract; cannot be instantiated
		Grand   g =new Grand();
		           ^
	1 error
	
	this error can be shown by jvm
	
	we can just create an variable of abstract class 

	
*/
	
class Program
{
	public static void main(String args[])
	{
		Myclass m =new Myclass(24,48);
		m.show();
		//Grand   g =new Grand(); will cause error 
		
	}
	
}
