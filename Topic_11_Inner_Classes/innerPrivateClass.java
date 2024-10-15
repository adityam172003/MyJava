

// reference : https://www.tutorialspoint.com/java/java_innerclasses.htm



class OuterClass
{

    public InnerClass inc;
    private int oa;
    public int ob;
   private  class InnerClass {
        
        private int a ;
        public int b ;
        
        public void print()
        {

            // we can access the private and public data members of the outer class     
            oa = 10;
            ob = 30;
            System.out.println("Inside  the innner class");
        }

         
    }

    {
        inc = new InnerClass();
    }

    public void print()
    {
            inc.print();
            inc.a = 100;
            System.out.println(oa+ " " + ob+" inner data member ="+ inc.a );
            System.out.println("Insider the outer class ");

    }

}


public class innerPrivateClass {

    public static void main(String[] args) {
        System.out.println("we can declare class as private when it is inner class");


        /*
                    OuterClass.InnerClass oc =  new OuterClass().new InnerClass();
                  ^
                    innerPrivateClass.java:26: error: OuterClass.InnerClass has private access in OuterClass
                            OuterClass.InnerClass oc =  new OuterClass().new InnerClass();
                                                                            ^
                    2 errors 


         */


     //   OuterClass.InnerClass oc =  new OuterClass().new InnerClass(); // we cant create the 
     // private class initialization in out of outer class 

        OuterClass os  = new OuterClass();

        os.print();

        // as method inside is public but still class is private we cant access the public data
        // members and member functions 

        /*
            innerPrivateClass.java:60: error: OuterClass.InnerClass.print() is defined in an inaccessible class or interface
             os.inc.print();
         
         */

       // os.inc.print();

    }
}