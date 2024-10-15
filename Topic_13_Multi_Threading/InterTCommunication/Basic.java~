
/*

                             *******   Inter Thread Communication   *******
                             
                             
             1 ] We communicate between two thread using 3 keyWords
             
            		1 ] notify()
            		2 ] wait()
            		3 ] notifyAll()
            		
            		
            2 ] When two or multiple threads are working on same object and their 
            	work is depends on each other then at that time to avoid polling 
            	we required the commnication between them
           
            
            
            
             wait()      |   This methods belongs to class Object
                         |   
             notify()    |   They are implemented as final so all the classes have these methods
                         |   but no one can override them
             notifyall() |   
             
             
             1 ] wait()
             	tells the calling thread to giveup the monitor and go to sleep.until other will notify
             	
             	we can use the other version of wait function 
             	
             		wait(time_in_miliseconds)
             	
             	to wait for specific preiod of time 
             	
             	
             	
             2 ] notify()
             	wake up the thread that called wait on same object
             	
             	
             	
             	
             
             3 ] notifyAll()
             	wake up all the threads that are called wait ()
             	
             		
             to use this methods the object's methods must be synchronized 
             other wise it will throws 
             
             Exception in thread "two" Resuming from wait state
	     . java.lang.IllegalMonitorStateException: current thread is not owner

				
*/

class Mythread implements Runnable
{
	synchronized public void run()
	{
		
			Thread t = Thread.currentThread();
			
			if(t.getName().equals("one"))
			{
				System.out.println("Thread "+t.getName() +" Going to wait state");
				for(int i =0;i<20;i++)
				{
					System.out.print(". ");
					try
					{
						Thread.sleep((20-i)*500);
					}
					catch(Exception w)
					{
						
					}
					
				}
				System.out.println();
				
				
				try
				{
					wait();
					
					/*
						after resuming from other notification 
						the excution starts from the next statement
						of wait i.e from this line 
					*/
				}
				catch(Exception a)
				{
				
				}
				System.out.println(t.getName() +" Resuming from wait state");
				for(int i =0;i<10;i++)
				{
					System.out.print(". ");
					try
					{
						Thread.sleep(i*500);
					}
					catch(Exception w)
					{
						
					}
					
				}
				System.out.println();
				System.out.println("Resumed from wait state");
				
			}
			
			if((t.getName().equals("two")))
			{
				System.out.println(t.getName() +" Resuming threads ");
				for(int i =0;i<10;i++)
				{
					System.out.print(". ");
					try
					{
						Thread.sleep(i*100);
					}
					catch(Exception w)
					{
						
					}
					
				}
				notify();
				System.out.println();
				System.out.println(t.getName() +" Notified");
				
			}			
	}
}


class Basic
{
	public static void main(String args[])
	{
		Thread t1,t2;
		Mythread m1 = new Mythread();
			 t1 = new Thread(m1,"one");
			 t2 = new Thread(m1,"two");
		
		t1.start();
		t2.start();
		
	}
}





