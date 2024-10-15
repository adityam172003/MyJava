import javax.swing.JOptionPane;

class JoinMainThread extends Thread{

    public static Thread mt ;

    public void run()
    {
        try {
            mt.join();

            System.out.println("End of main ----");
            System.out.println("Starting child thread");
        } catch (Exception e) {
            // TODO: handle exception
        }

        System.out.println("Ending Child");
    }

}

public class Join_Method_1{
    

    public static void main(String[] args) {
        
        JoinMainThread.mt = Thread.currentThread();

        JoinMainThread t = new JoinMainThread();
        System.out.println("Starting child thread waiting for main to complete ....");
        t.start();

        
        try
        { 
            // Thread.currentThread().join();  // this line also causes the deadlock situation 
            // Here if main thread calls t.join() then it causes the dead lock situation 
            Thread.sleep(2000);
            System.out.println("End of main in main");
        }
        catch(Exception e)
        {

        }
    }
}
