// creating first thread 


/*
	Multi-Threading ::: 
	
	reference : https://www.javatpoint.com/multithreading-in-java
			  : https://www.tutorialspoint.com/java/java_multithreading.html


	What is the thread ?
	->  Thread is nothing but an object of class Thread 
	    we can also call it as excuter.
	
	All the threads which we are going to create are called child threads
	of main thread 
	
	whenever we create a thread we have to mention the object name for which  
	our child thread is going to work in his whole journey
	


	it uses round robbin process/thread scheduling algorithm which feels like 
	multiple threads are running at  a time 

	

	we can use multithreading where there are the independent jobs are present and 
	they can be executed simultaneously 


	=======================================================================================
	|	Java threads are kernel-level threads in most modern JVM implementations.		  |
	|	The JVM relies on the operating system's native threading   capabilities 		  |
	|	to manage and schedule Java threads, which allows Java programs to  take 		  |
	|	full advantage of  multicore processors    and modern   operating system 		  |
	|	features for concurrency and parallelism.										  |
	=======================================================================================
	
	
*/


class MyClass extends Thread 
{
	static int a;
	boolean b;
    char ch;

	public MyClass(){
		super("MY-Thread-24");


	}
	{
		// initial value is false 
		// if we use non-primitive then it is null here 
		/// rest all are initialized to zero 
		System.out.println(b);
	}
	static {

		System.out.println("Static block");

	}
	public static void set()
	{
		a=10;
		System.out.println("set function "+a);
		
	}
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println("Run method in MyClass");
		MyClass.a =20;
	}	
	
}	

class file_1_Creating_thread
{
	
	public static void main(String[]args)
	{
		// 1 ] Create an object of class for which your object is going to work 
		
		MyClass obj = new MyClass();
		
	

		
		// 2 ] Create an object of class Thread and pass the object of MyClass as a parameter to the 
		//     parameterised constructor 
		
		
		/*
		    ======================================================================================
		      *] Why we have to inherite the Thread class in our MyClass 

				It is necessary to assing the task to the created thread

				we have two type to do it 
				
				1 ]Either we can decouple the task and thread execution  by implementating 
				runnable interface and defining the run() method which containts the task 


				2 ] Extending the Thread class which takes the responsibilities of both 
				thread execution and the task allocation 


			=====================================================================================


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
			 	
			 	thats why we inherite Thread class and also to overried the run method 
				  
			
		*/
		
		Thread t = new Thread(obj);
		
		
		// 3 ] start the thread 
		
		//t.start();
		obj.start();
		// obj.start(); illegalThreasStateException 
		
		// this is the limitation of extending Thread class 
		// we cant assign the same task to multiple threads here or we cant use the 
		// multiple threads to do same task or work for same object 

		// so here we can create multiple threads and pass same object to work on 
		// gives more flexibility and decoupling task and thread execution 





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
