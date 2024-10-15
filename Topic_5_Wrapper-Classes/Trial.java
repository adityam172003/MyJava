public class Trial
{
	public Trial(){
		System.out.println("called");
	}

	
	int p=0;
	public static void main(String args[])
	{

		Trial t = new Trial();
		// here changes will be reflected keep in mind because reference is passed and not value 
		swap(t);
		// t.Trial();
		System.out.println(t.p);

		System.out.println("class name and file name will be different");
	
	}

	public static void swap(Trial t){
		t.p = 20;
	}	

}
