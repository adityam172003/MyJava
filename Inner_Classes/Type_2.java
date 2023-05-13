// accessing inner class in static area of outer class 
class Outer2
{
	int out;
	class Inner2
	{
		int in;
		static int stat;
		public void show()
		{
			System.out.println("inside show() in    = "+in);
			System.out.println("Static memeber stat = "+stat);
		}	
		
	}
	public static void disp()
	{
		Outer2 obj  = new Outer2();
		Inner2 var  = obj.new Inner2();  // something different 
		var.in      = 20;
		Inner2.stat = 30;		
		var.show();
	}
}

class Type_2
{
	public static void main(String [] args)
	{
	
		Outer2 obj  = new Outer2();
		obj.disp();
	}
}
