


class Interrupt extends Thread{

    public void run()
    {
        try {
            for(int i=0;i<10;i++)
            {
                System.out.println("Leazy sleep");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("I got interrupted");
        }
    }
}



public class Interrupt_Method_0 {

    public static void main(String[] args) {
        Interrupt t = new Interrupt();

        t.start();


        // if child thread is not in waiting state then jvm wait for child to go in waiting state
        // as soon as child state is waiting jvm will interrupt the child thread 
        // till now main thread continue its execution 
        
        t.interrupt(); // main thread interrrupt child thread 

        System.out.println("Main Interrupt ");
    }
    
}
