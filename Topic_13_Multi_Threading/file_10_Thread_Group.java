



/*
    It is a group of threads 

    ThreadGroup may contains the SubThreadGroups

    The main advantge of it is we can perform common operation easily 


    system level threads are root level threads in java 


                              SYSTEM 
                                |
                                |
                                |           == all are deamon threads except main thread 
                                |----------> Reference Handler 
                               /             Finalizer
                              /              Signal Dispatcher
                             /               Notification Thread
                            /                Common-Cleaner
                            |                main
                            |                  
                    MAIN THREAD GROUP 
                            |
                            |
                            |
                            |       
                        main thread ------  subGroups 
                                            | | | | |     
                                            sub threads


    ThreadGroup is a java class present in java.lang package and it is direct child of Object 

                    Object 
                      |
                      |
                      |
                 ThreadGroup

    methods 

    1] getThreadGroup() 
        get thread group in which the thread belongs 

    
 */

public class file_10_Thread_Group {
    

    public static void main(String[] args) {
        // get the group of main thread and the parent of main thread 

        // system group acts are root for all threads in java 
        System.out.println(Thread.currentThread().getThreadGroup().getName()); // main 
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName()); 


        ThreadGroup tg = new ThreadGroup("group name");
        System.out.println(tg.getParent().getName());// parent of this group is main 
        // as main thread creats the group it is nothing but a child thread group 
        
        ThreadGroup tg2 = new ThreadGroup(tg,"parent of this group is tg");

        System.out.println(tg2.getParent().getName());

        ThreadGroup tgs = Thread.currentThread().getThreadGroup().getParent();

        Thread[] tarr = new Thread[tgs.activeCount()];

        tgs.enumerate(tarr);

        for(var tt : tarr )
        {
            System.out.println(tt.getName());
        }
    }
}
