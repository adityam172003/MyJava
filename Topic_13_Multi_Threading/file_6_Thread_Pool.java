


/*
  
    Thread Pool : 

    It is the collection of pre-initialized threads 

    used in JSP and Servlets for performance improvement 

    reference : https://www.tutorialspoint.com/java/java_thread_pool.htm

    This is very very important concept used in most of the backend technologies 

    NodeJS is one of the best example for it 
        Asynchronous thread pooling 
        Event loop you can say thread pool concept 



    java 1.5 version introduced the threadPool to imporve performance 


    present in java.util.concurrent package     

    Callable and Future   introduced in 1.5 version 

    in the case of runnable job thread wont return any thing after execution 
    if thread want to return something then we should go with callable interface 
    it contains only one method call 

    public Object call() throws Exception 
    after compliting the job thread returns the object of the type 
    Future that is Future object can be used to get result from the callable job 






    



        
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;


class Task implements Runnable{

    public void run()
    {

        System.out.println("Task to be done "+Thread.currentThread().getName());
    }
}

public class file_6_Thread_Pool {
    
    public static void main(String[] args) {
        
        // creating the thread pool of 2 threads 
        ExecutorService executor = Executors.newFixedThreadPool(2); // creates the pool of max 2 threads active at a time 

        ThreadPoolExecutor pool =  (ThreadPoolExecutor) executor;

        executor.submit(new Task());

        executor.submit(new Task());

        executor.submit(new Task());

        executor.shutdown();
    }

}


/*
    About the newCacheThreadPool() 

        ExecutorService  executorService = Executors.newCachedThreadPool();

        This line is enough we need not to handle the thread pool creation and management 
        in this case jvm handles the creation and execiution 

        we dont need to start and assign the task.

        depending on load and requests it creates the multiple threads and utilize it 
        but it creates threads up to limited numbers 

        A cached thread pool dynamically manages the creation and destruction of threads
        based on the workload. Threads that have been idle for some time are   terminated
        and removed from the pool,    while new threads are    created as needed, up to a
        certain maximum limit. It's often used for scenarios where you have  large number
        of short-lived asynchronous tasks to execute.

 */