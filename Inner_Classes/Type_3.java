// accessing inner class outside the outer class 

class Outer3
{
	int out;
	class Inner3
	{
		int in;
		static int stat;
		
		public void show()
		{
			System.out.println("inside show() in    = "+in);
			System.out.println("Static memeber stat = "+stat);
		}	
	}	
}

class Type_3
{
	public static void main(String [] args)
	{
	
		Outer3 obj        = new Outer3();
		
		Outer3.Inner3 var = obj.new Inner3();
		var.in     = 24;
		Outer3.Inner3.stat = 48; 
		var.show();
		
	}
}
