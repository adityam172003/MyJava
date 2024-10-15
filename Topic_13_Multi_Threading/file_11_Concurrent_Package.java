

/*
    
    Lock :- 


    


    Problems faced by synchronized keyword 

    1 ] untill getting lock wait for the infinite time dont do anything 
    2 ] fairlness poicy is not there 
    3 ] there is no way to specify maximum waiting time for a thread 
        to get a lock so that thread will wait until getting the lock 
        which may creates performance problem which may cause deadlock 
    4 ] if a thread release the lock then which waiting thread will get that lock 
        we are not any control on this situating 

    5 ] there is no api to list out all waiting threads for a lock 
    6 ] we cant use synchronized block within multiple methods we cant use it across the 
        multiple methods 

    
    
   java.util.Concurrent.lock package 
    
   it provides more flexibility to the programmers and controll on thread 


   Lock interface 
    |
    |
    |
    |--------> Lock object is similar to implicit lock applied by a thread to execure 
               synchronized method or block
    ----------> lock implementation provides more extensive operations than traditional implicit locks 



    Important methods of lock interface 

    1 ] lock()
        to get the lock thread need to call this method (to aquire the lock )
        if lock is already available then immediately current thread will get the lock 
        if the lock is not available then it will wait until getting the lock 
        it is exactly same behaviour of synchronized keyword 

 ------------------------------------------------------------------------------------------
   
    2 ] tryLock()


        it will return the true or false depending on lock is available or not 
        if lock is available then thread aquire the lock and method returns true 
        else it continue its execution without waiting 
        here if lock is not available then thread will not wait it will continue the 
        execution 
        
        if we have to wait for particular time period to wait for getting the lock 
        then we can use tryLock(time,TimeUnit.---) is available we can use it
        TimeUnit is the enum present in the java.lang.concurrent package   

        if(t.tryLock)
        {
            safe operation 
        }
        else{

        }
    
------------------------------------------------------------------------------------------

    3 ] unlock()
        used to release the lock()
        current thread should contains the lock to release the lock 
        otherwise it will throws IllegalMonitorStateException 
                                 ----------------------------


------------------------------------------------------------------------------------------

        Implementation class for the Lock interface is ReentrantLock class 

        Lock 
         |
         |
         |
     ReentrantLock ( Implementation class for Lock Interface and direct child of Object class)
     
     

 */

import java.util.concurrent.locks.ReentrantLock;

public class file_11_Concurrent_Package {
    
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        lock.lock(); // main thread gets the lock 
        lock.lock(); // main thread will get multiple locks for it jvm maintains the counter

        lock.unlock(); // still lock will not release 
        lock.unlock(); // thread release the lock as count =0

        // as single thread can get multiple locks at a time 

        // Reentrant mean a thread can aquire same lock multiple lock without any issue 
        // internaly it increment threadPersonal lock counter and decrement 
        // whenever thread thred unlocks it 

    }
}
