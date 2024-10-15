

// Garbage collector 


// Deamon Thread  :- The thread which runs internally of java program 


// finalize() method gets executed when the object gets destroyed 




public class GarbageCollector {
    
    
    public static void main(String[] args) throws Throwable {
        
        System.gc();


        // here we can run the terminal linux commands using following method in Runtime class

    // Process p =   Runtime.getRuntime().exec(new String[]{"gedit","Main.java"});
   
    //   System.out.println(p.pid());
    //   System.out.println(p.toString());
    //   System.out.println(p.info());

      // current free memory available for further uses in jvm measured in bytes.
     System.out.println(Runtime.getRuntime().freeMemory());
     System.out.println(Runtime.getRuntime().availableProcessors());
     System.out.println(Runtime.getRuntime().version());

    }


}
