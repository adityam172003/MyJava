



class MyThread1 implements Runnable
{
    

    public void run()
    {
        System.out.println("The reference of the calling object  = " +this.hashCode());
    }
    
}



public class MultiThreadingAndAnonymous {
    
    public static void main(String[] args) {
       
        // anonymous class   
        
        Runnable rn = new Thread() {
               
                public void run() {
                    System.out.println("This is the anonymous class hash code = "+this.hashCode());
                    System.out.println(this.getClass().getName());
                }
        };
        
        Thread r = new Thread(){
            
            public void run(){
                System.out.println("Inner of anonymous class");
            }
            
        };

       r.start();
        System.out.println(rn.hashCode());
       
         Thread t =  new Thread(rn);
         t.start();
    }

}
