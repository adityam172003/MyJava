// Accessing inner class from non-static area of outer class
class Outer
{	int out;

	class Inner
	{	
		int in;
		static int stat;
		public void show()
		{
			System.out.println("inside show() in = "+in);
			
		}	
	}
	
	public void disp()
	{	
		Inner obj = new Inner();
		obj.in    = 10;
		Inner.stat= 20;
		obj.show();
	}
}

class file_1_Type_1
{
	public static void main(String [] args)
	{
		Outer var = new Outer();
		
		var.disp();
	
	}
}
