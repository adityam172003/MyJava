
/*

	here bothe interfaces has same memeber n 
	so it will generate Ambiguity error
	
	lenovo@LENOVO-PC:~/Java_Programming/Inheritance_Interfaces$ javac Ambiguity.java 
	Ambiguity.java:21: error: reference to n is ambiguous
		System.out.println(n);
		                   ^
 	both variable n in Itr1 and variable n in Itr2 match
	1 error

*/




interface Itr1
{
	int n=20;
	
	void Show();
}

interface Itr2
{
	int n=30;
	void Show();
	
}	

class Myclass implements Itr1,Itr2
{
	public void Show()
	{	
		System.out.println(Itr1.n+" ||| "+Itr2.n);
	}	
}


class Ambiguity
{
	public static void main(String p[])
	{
		Myclass m = new Myclass();
		
		m.Show();
	}	
}
