package file_3_Program2;


class Program
{

	public static void main(String mn[])throws Exception
	{
		Mythread t = new Mythread();
		Thread   m1= new Thread(t,"one");
		Thread   m2= new Thread(t,"two");
		
		m1.start();
		m2.start();
		Thread.sleep(1000);
		System.out.println(m1.getState()+" " +m2.getState());
	}
}
