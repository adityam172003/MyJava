

public class Join_Method_0{

    public static void main(String[] args) {
        

        Thread t  = new Thread(()->{
            try {
                System.out.println("Thread is sleeping "+Thread.currentThread().getName());
                Thread.sleep(3000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        });

    
        t.start();

        System.out.println("Executed join method waiting ....");

        try {
            // main has to wait until thread-0 complets its execution 
          
            t.join(1000); 
            System.out.println(t.getState());
        } catch (Exception e) {
          
        }

        System.out.println("Executed main method ....");
    


    }


}