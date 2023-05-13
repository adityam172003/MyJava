// accessing the memebrs 

class Outer4
{
	int out;
	int same;
	class Inner4
	{
		int in;
		Outer4 innerVar = Outer4.this; // assigning 
		static int stat;
		int same;
		public void show()
		{                                                          //--------------//
			System.out.println("Inside show() same of Outer = "+Outer4.this.same);
			System.out.println(this.hashCode());          // object of Inner class or Inner4.this
			System.out.println(Outer4.this.hashCode());   // object of outer class or Outer4.this
			System.out.println("Inside show() same of Inner = "+same);
			System.out.println("inside show() out   = "+out);
			System.out.println("inside show() in    = "+in);
			System.out.println("Static memeber stat = "+stat);
		}	
	}
}

class Member_Access
{
	public static void main(String [] args)
	{
		Outer4 obj         = new Outer4();	
		Outer4.Inner4 var  = obj.new Inner4();
		System.out.println(var.hashCode()+"/ /"+obj.hashCode());
		obj.out            =22;
		var.in             =33;
		Outer4.Inner4.stat =44;   // accessing Inner class 
		var.same           =66;
		var.show();
		System.out.println("==============================");
		
		// here var.innerVar stores the address of Outer class object obj 
		var.innerVar.same  =55;  
		var.show();
	}
}
