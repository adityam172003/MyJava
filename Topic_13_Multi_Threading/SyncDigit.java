
class Digit 
{
	int x;
	
	Digit()
	{
		x=0;
	}
	
	synchronized public void increment()
	{
		for(int i =0;i<10;i++)
		{
			x++;
			
			System.out.println(Thread.currentThread().getName()+" x= "+x);
		}
		
	}
	
	
}



class Myclass extends Digit implements Runnable 
{

	Digit d;
	
	Myclass(Digit d)
	{
		this.d = d;
	}
	
	
	public void run()
	{
		d.increment();
	}
	

}

class thisClass extends Thread  {

	public void run()
	{
		String name = Thread.currentThread().getName();
		System.out.println("Called by "+name);
	}
}


class SyncDigit
{
	public static void main(String str[])
	{
		
			Digit   d     ;
			Myclass m1 ,m2;
			Thread  t1 ,t2;
			d  = new Digit();
			m1 = new Myclass(d);
			m2 = new Myclass(d);
			thisClass th = new thisClass();
			// t1 = new Thread(m1,"t1");
			// t2 = new Thread(m2,"t2");
			Thread t  = new Thread(th);

			// t1.start();
			// t2.start();
			t.start();			
			th.start();
			
			Thread t22 = new Thread(()->{

				System.out.println("Functional Run Method");
			});
			
			t22.start();
			
		
		
	}
}
