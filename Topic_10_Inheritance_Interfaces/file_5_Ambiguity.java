
/*

	here bothe interfaces has same memeber n 
	so it will generate Ambiguity error
	
	lenovo@LENOVO-PC:~/Java_Programming/Inheritance_Interfaces$ javac Ambiguity.java 
	Ambiguity.java:21: error: reference to n is ambiguous
		System.out.println(n);
		                   ^
 	both variable n in Itr1 and variable n in Itr2 match
	1 error


	and other one is : 
	xception in thread "main" java.lang.NoSuchMethodError: 'void Myclass.Show()'
        at Ambiguity.main(Ambiguity.java:48)



		That's why there is no any multiple inheritance is available in java 

	
*/




interface Itr1
{
	int n=20;
	
	void Show();

	default void myfun()
	{
		System.out.println("In Itr 1 ");
	}
}

interface Itr2
{
	int n=30;//  changing to n1 for testing purpose you can change it to n and observe the error 
	void Show();

	default void myfun()
	{
		System.out.println("In Itr 2 ");
	}
	
}	

class Myclass implements Itr1,Itr2
{
	public void Show()
	{	
		System.out.println(Itr1.n+" ||| "+Itr2.n);
	}	

	public void myfun()
	{
		System.out.println("In Myclass ");
	}

	/*
		ile_5_Ambiguity.java:53: error: types Itr1 and Itr2 are incompatible;
		class Myclass implements Itr1,Itr2
		^
		class Myclass inherits unrelated defaults for myfun() from types Itr1 and Itr2
		1 error	

		if you dont comment the above function it will not give the error 

	 */
}


class file_5_Ambiguity
{
	public static void main(String p[])
	{
		Myclass m = new Myclass();
		
		m.Show();
		m.myfun();
	}	
}
