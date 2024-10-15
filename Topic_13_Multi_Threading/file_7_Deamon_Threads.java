

/*
        Deamon threads : Internally running threads 
        reference : https://www.javatpoint.com/daemon-thread
        ex : gc (garbage collector thread )


        1] It provides services to user threads for background supporting tasks.
             It has no role in life than to serve user threads.
        2] Its life depends on user threads.
        3] It is a low priority thread.


        Purpose of the deamon thread 
        -----------------------------
        
        A Daemon thread is created to support the user threads.
        It generallty works in background  and terminated once
        all the other   threads are closed.  Garbage collector 
        is one of the example of Daemon thread.



        As requirenment deamon thread runs on high and low priority 

        we can change the nature of the thread to deamon before start method is called 



        isDeamon() ;
        setDeamon(Boolean b)
        we can change deamon nature of the thread by using the above method 


        It is impossible to change the deamon nature of the main thread 

        ones all non-deamon thread complet their execution and get terminated 
        all deamon threads also gets terminated immediately 
        
        


 */


public class file_7_Deamon_Threads {
    
}
