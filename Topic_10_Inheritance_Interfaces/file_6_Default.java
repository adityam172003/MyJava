

/*
	Default methods have body 
	It is not necessary to override them 
	they are not abstract
	------------------------------------
	
	they are defined using default 
	
	-----------------------------------
	
	but we can override them in implementation class 
	
	
	
*/



interface Itr
{

	default void disp()
	{
		System.out.println("default in interface");
	
	}
	
	void show();
}



class Myclass implements Itr
{

	public void show()
	{
		System.out.println("Show in Myclass");
	}	
}


class Myclass2 implements Itr
{
	public void disp()
	{
		
		System.out.println("In the default of Myclass2");
	}

	public void show()
	{
		System.out.println("Show in Myclass2");
	}	
}

class file_6_Default
{
	public static void main(String [] args)
	{
		Myclass m = new Myclass();
		m.show();
		
		//--------------------------------
		Myclass m2 = new Myclass();
		// if we call disp using object of Myclass then disp of interface will be called
		m2.disp();
		
		//--------------------------------
		
		Myclass2 m3 = new Myclass2();
		m3.disp();
	}


}
