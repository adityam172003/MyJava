
/*
		
			Interface 
			
		
		1 ] we use interface keyWord
		
		
		All the methods inside interface are public and abstract by default 
		

		java interfaces has private and default methods since java 8 


		ex 
		
		interface MyInterface
		{
			void show();
			public void show();
			abstract void show();
			abstract public void show();
		}
		
		all the above four decearation has same meaning
		== abstract public void show()
		
		
		
		
		2 ] Interface can contain data memebers also 
		
			those data members are static and final 


			
			but as they are final one rule is different that is 
			they must be initialized at the time of declaration only 



			============================================================================

			Java introduced the ability to include private methods
			in interfaces starting with Java 9.

			Interfaces cannot have private instance fields or data members.
			They can only have public static final fields.
			----------------------------------------------

			still interfaces does not have private date members onlly has private member functions 

			
			
		to inherite interface we use 
			implements  keyWord
		 	-----------
		 	
	
*/

interface itr
{
	int n=20;
	
	
	void show();
	void disp();

	// interface can contains the private methods but we have to provide the method body 
	private void play(){
		System.out.println("Player plays itr in play function which  is private inside the interface ");
	}

	// we have default method here which is public and can have method body 
	
	/*
	 * 
	 * The primary purpose of default methods in Java interfaces is to provide a way to add new methods 
	 * to interfaces without breaking existing implementations. Default methods allow interfaces to
	 * evolve by adding new functionality without forcing all implementing classes to provide their
	 * own implementations of the new methods.
	 * 
	 * 
	 * since java 8
	 */



	default public void playPrivate(){

			play();
	}
	// this static is not inherited in child we have to use interface name and dot operator
	// to access it we cant used implemented class name or object also 
	static void getStatic()
	{
		System.out.println("This is static in itr");
	}
}


/*
      As myclass is implementing interface itr
      we have to override all the methods from itr in Myclass
      
      other wise it will generate an error 
      
      	Interface.java:61: error: Myclass is not abstract and does not override abstract method disp() in itr
	class Myclass implements itr

	Interface.java:64: error: Myclass is not abstract and does not override abstract method show() in itr
	class Myclass implements itr

      
*/

class Myclass implements itr
{
	public void disp()
	{
		System.out.println("Overriding disp method ");
	}
	
	public void show()
	{
		System.out.println("Overriding show method ");
	}
}

class file_4_Interface
{

	public static void main(String p[])
	{
		
		itr.getStatic();
		itr m = new Myclass();   // implementing runtime Polymorphism 
		m.show();
		m.playPrivate();					
		
		itr.getStatic();	
	}
	


}



