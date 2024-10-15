// creating first thread 


/*
	
	What is the thread ?
	->  Thread is nothing but an object of class Thread 
	    we can also call it as excuter.
	
	All the threads which we are going to create are called child threads
	of main thread 
	
	whenever we create a thread we have to mention the object name for which  
	our child thread is going to work in his whole journey
	
*/


class MyClass extends Thread 
{
	static int a;
	public static void set()
	{
		a=10;
		System.out.println("set function "+a);
		
	}
	
	public void run()
	{
		System.out.println("Run method in MyClass");
		MyClass.a =20;
	}	
	
}	

class Creating_thread
{
	public static void main(String[]args)
	{
		// 1 ] Create an object of class for which your object is going to work 
		
		MyClass obj = new MyClass();
		
		// 2 ] Create an object of class Thread and pass the object of MyClass as a parameter to the 
		//     parameterised constructor 
		
		
		/*
		      *] Why we have to inherite the Thread class in our MyClass 
			 or any other class for which the thred is going to work ???
			 
			 To work the thread we have create for the object of particular class (here MyClass)
			 we have to pass the object of that class Type to the parameterised constructor 
			 
			 but the data type of the formal parater(Local variable parameterised constructor of Thread 
			 class)  is not matching with our object parameter, the structure of parameterised 
			 constructor of Thread class 
			 
			 
			 class Thread
			 {
			 	public Thread(Thread temp)
			 	{
			 		// body
			 	}
			 
			 }
			 
			 so the data type of temp is Thread 
			 and our object Data type is MyClass 
			 
			 here we use the concept of Runtime Polymorphism 
			 
			 that reference of child class can be stored in Parent class reference variable 
			 
			 ------------------------------------------------------------------------------
			 
			 So we derive the MyClass form Thread class so that 
			 	
			 	Thread class will become parent of our MyClass 
			 	therefor reference of our MyClass object can be stored in 
			 	referenc of Thread class object 
			 	
			 	thats why we inherite Thread clas  
			
		*/
		
		Thread t = new Thread(obj);
		
		
		// 3 ] start the thread 
		
		t.start();
		
		/*
			when we start the thread it will always go to the run() method 
			of the respective class (here MyClass)
			
			
			This run method belongs to class Thread 
				whose implementation is blank
			we have to override the run() method in our own class 
		
		*/
		obj.set();
		
		
		System.out.println("Main ends "+obj.a);
		      
	}

}
