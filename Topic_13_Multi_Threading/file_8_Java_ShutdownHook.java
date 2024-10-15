

/*
    reference : https://www.javatpoint.com/ShutdownHook-thread    

    A special construct that facilitates the developers to add some code
    that has to be run when the Java Virtual Machine   (JVM) is shutting 
    down is known as the Java shutdown hook. 

 */

 class ShutDownHookDemo implements Runnable{


    public void run(){

        System.out.println("Running in run method while shuttingDown");
    }

 }



public class file_8_Java_ShutdownHook {
    public static void main(String[] args) throws Exception{
        

        Runtime.getRuntime().addShutdownHook(new Thread(new ShutDownHookDemo()));

        System.out.println("IN SHUTDOWN HOOK DEMO ");

        Thread.sleep(2000);
        System.out.println("Shutting down the JVM");


    }
}
