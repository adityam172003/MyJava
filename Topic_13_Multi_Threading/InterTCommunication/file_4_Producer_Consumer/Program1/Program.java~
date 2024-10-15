

class Program
{
	public static void main(String str[])
	{
		Number n    = new Number();
		
		Mythread m1 = new Mythread(n);
		Mythread m2 = new Mythread(n);
		
		Thread   t1 = new Thread(m1,"prod");
		Thread   t2 = new Thread(m2,"cons");
		
		t1.start();
		t2.start();					
	}
}
