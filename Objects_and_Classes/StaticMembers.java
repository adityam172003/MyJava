class Static
{

	int x;
	static int y;
	
	
	public Static()
	{
		y++;
	}
	public void Show()
	{
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		

	}
	
	
	public void set()
	{
	
		x +=10;
		y +=20;
	}
	
	



}


class StaticAccessSpecifiers
{
	private static int y;
	
	public static void set()
	{
		y=10;
	}
	
	public static void Access()
	{
		System.out.println("Static Mamber as private := " +y);
	
	}

}



class StaticMembers
{
	
	public static void main(String[]args)
	{
		Static s =new Static();
		
		
		System.out.println("Static memebre = "+Static.y);
		
		System.out.println("Static using object = " +s.y);
		
		s.set();
		
		// changing the static member using s
		
		
		// acccessign using new object;
		
		
		Static n = new Static();
		
		System.out.println("Static memebre = "+Static.y);
		
		System.out.println("Static using new object = "+ n.y);
		
		
		/*
		
			as chages done by one object in y gets reflected by ALL other objects 
			
			that means all objects has only on static data members 
			
			infact static data memebres belongs to class and work for the class 
			and not for prticular object 
			
			static data members and and access specifiers does not change the meaning
			or working of each other
			
			
		*/
	
		
		// accessing private static datamemeber 
		
		System.out.println("accessing private static data members");
		StaticAccessSpecifiers.set();
		
		StaticAccessSpecifiers.Access();
		
		
		
		/*
			Static memebre function
			
			
			here Access() is the static memebre function
			
			req class name and (.) dot operator for accessing or calling
			
			
			they work for class only 
			
			
			we cant access non static data members directly in the static functions
			
			
			
		
		*/
	
	
	
	}




}
