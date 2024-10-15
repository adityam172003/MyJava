// Anonymous class as an argumnet 
class Movie
{
	public void watching()
	{
		System.out.println("Watching KGF-CHAPTER 2");
	}
}

class Mythread
{
	Movie ref;
	public Mythread(Movie ref)
	{
	
		this.ref = ref;
	}
	public void watch()
	{
		ref.watching();
	}
}
class file_6_Argument_AC
{
	public static void main(String [] args)
	{
		Movie m1 ,m2 ,m3;
		Mythread t1 ,t2 ,t3;
		
		m1 = new Movie();
		t1 = new Mythread(m1);
		
		m3 = new Movie();
		t3 = new Mythread(m3);
		
		t2 = new Mythread( 
		     new Movie()  // <----- inheriting the class Movie and overriding the Watching() method 
		     {
		        public void watching()
				{
					System.out.println("Watching GEETAGOVINDAM ");
				}
		     } 
		  
		   
		);
		t1.watch();
		t2.watch();
		t3.watch();

		Thread tt = new Thread(()->{

			// actually Runnable is functional interface and we can use arrow function here 

			System.out.println("This is functional interface and we are using arrow function");

		});


		Runnable rrr = ()->{
			System.out.println("THIS IS FUNCTIONAL INTERFACE JAVA 8 VERSION ");
		};
		Thread trnn = new Thread(rrr);
		trnn.start();
		tt.start();
	}
}
