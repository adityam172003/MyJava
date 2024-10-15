

/*
 
        Thread synchronization in JAVA 

        reference : https://www.tutorialspoint.com/java/java_thread_synchronization.htm
                  : https://www.javatpoint.com/synchronization-in-java


        Multiple co-operative threads causes the problems like 

        1 ] Race condition 
        2 ] Critical section problem 
        3 ] Shared memory problem 


        There are multiple solution to achieve synchronization 
        1 ] Semaphores 
        2 ] Mutex (Locks)
        3 ] Monitors 

        In Java it is implemented using Monitors 

        Monitors is the collection of the variables and the functions used to achieve 
        Synchronization problem properly 


        So there is a need to synchronize the action of multiple threads and make sure
        that only one thread can access the resource at a given point in time. This is
        implemented using a concept called monitors
                                        -----------

        Basically Monitor is the collection of required classes and objects to achieve 
        Concept like synchroinzation in java 

        It is the software approach to handle the multiple threads and their execution 

        As Threads in java is the Kernel level threads 
        which relay on underlying operating system for 
            scheduled 
            controlled 
            executed    

            exact implementation of java threads depends on the JVM and operating system 
            ============================================================================
    





        There are two types of thread synchronization mutual exclusive and inter-thread communication.

        Mutual Exclusive :
                Synchronized method.
                Synchronized block.
                Static synchronization.
        Cooperation :(Inter-thread communication in java)
                Threads which are dependent on each other (ex : producer consumer threads )

        
                
        Mutual Exclusive:
        ==================
        1 ] Synchronized block  (Java synchronized block is more efficient than Java synchronized method.)
        2 ] Synchronized Method 
        3 ] Static Synchronization (If you make any static method as synchronized, the lock will be on the class not on object.)
           ---------------------------------------------------------------------------------------------------------------------
 
        concept of lock 
        ===============
            From Java 5 the package java.util.concurrent.locks contains several 
            lock implementations.
        
        


    When one method is working for same object but executed by different threads 
    then only synchronization is applied and only one thread is able to  execute
    the method due to synchronization 




    Problem with static synchronization 

    if two threads running for same object of same class 
    then there is no any locking for that object threads despite of synchronization of 
    static method both threads will execute the method 

    but if two threads are working for different objects then synchronization
    is applied there as they belongs to same class and different objects 

    refer for more info : https://www.javatpoint.com/static-synchronization-example




    Java Reentrant class 
      refere https://www.tutorialspoint.com/java/java_reentrant_monitor.htm

      This is fameous lock based synchroniazation class present in java.util.concurrent.locks
    




      // the lock concept is based on object and not on method 

      // blocked state (synchronized) <=====> 




      synchronized block 

      there are three ways to lock the block 

      1 ] this object 

      synchronized(this)
      {

      }


      2 ] particular object o

      synchronized(o)
      {

      }

      3 ] class level synchroniazed block 

      synchronized(CLASSNAME.class)
      {

      }






     *************** Deadlock ***************


     There are no resolution techniques for deadlock 
     but we can avoid the deadlock 


     









     */

import java.util.concurrent.locks.ReentrantLock;

class Synchr{
    // remove synchronized and observe and then use synchronization

    // 1 ] Synchronized Method 
   public synchronized void printit(int a)
    {
        for(int i =1;i<=a;i++)
        {
            System.out.println(i);
        }

        System.out.println("----");
    }

    public void cantSynchronize()
    {
        // this function cant be synchronized so alternative for it is to make block
        // synchronize
        for(int i =1;i<=10;i++){
            System.out.println(i);
        }
        System.err.println("-----");
    }

    public  synchronized void m1(){
        
        System.out.println("Method m1");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
    
    // as lock concept is based on object and not one specific method 
    // keep in this mind this is very important to understand 


    public  synchronized void m2(){
        
        System.out.println("Method m2");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
 }

 class MythreadBlock implements Runnable{

    Synchr s;

    public MythreadBlock(Synchr s){
        this.s = s;
    }


    public void run()
    {
        

        // Block synchronized 
        // comment and uncomment for more observation the changes 


        // System.out.println("This function is not synchronized ");
        // synchronized(s)
        // {
        //     s.cantSynchronize();
        // }
         
        synchronized(Synchr.class)
        {
            // class level synchronized 
        }
        
            String name = Thread.currentThread().getName();

            if(name.equals("ONE"))
            {
                s.m1();
            }
            else{
                s.m2();
            }
        
        
    }
 }
 



public class file_9_Thread_Synchronization {
    
    public static void main(String[] args) {
        
         Synchr c1 = new Synchr();

        // Thread t1 = new Thread(()->{c1.printit(20);});
        // Thread t2 = new Thread(()->{c1.printit(20);});
        // t1.start();
        // t2.start();

        MythreadBlock t11 , t22;
        t11 = new MythreadBlock(c1);
        t22 = new MythreadBlock(c1);
        Thread t1 = new Thread(t11,"ONE");
        Thread t2 = new Thread(t22);
        t1.start();
        t2.start();

        try{
            Thread.sleep(1000);
        }
        catch(Exception e)
        {

        }
        System.out.println(t2.getState());
        
        // we can pass true or can leave it 
        /*
         ReetrantLock tries to provide locks in a fair manner. We can set for how 
         long a thread can acquire lock and also, it ensures that a thread   with 
         the longest wait time may get access to lock first. By default the locks 
         are unfair, to make it fair we need to pass Boolean value   true  in its 
         constructor.
         */
        // This is example of Monitor way to achieve synchronization 
        ReentrantLock lock = new ReentrantLock(true);

        // A single thread can ask for the lock multiple times that's the reason the name of lock is Reentran



    }
}
