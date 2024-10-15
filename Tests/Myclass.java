

import java.io.*;
 public class Myclass{

    int a=10;

    final static short x = 2;
   final public static int y = 0;

    void Myclass()
    {

    }

    public static void main(String[] args) {
        System.out.println((int)(char)(65536));
        float f =19;

        
        int I = 0;
        double value = -9.0;
        System.out.println(" Value == "+ Math.sqrt(value));

        class Foo 
        {
            public int i = 3;
        } 
        Object o = (Object)new Foo();
        Foo foo = (Foo)o;
        System.out.println("i = " + foo.i);


        //  FileOutputStream out = null;
        // try 
        // {
        //     out = new FileOutputStream("test.txt");
        //     out.write(122);
        // }
        // catch(IOException io) 
        // {
        //     System.out.println("IO Error.");
        // }
        // finally 
        // {
        //     out.close();
        // }


       
            for (int z=0; z < 3; z++) 
            {
                switch (z) 
                {
                    case y: System.out.print("0 ");   /* Line 11 */
                    case x-1: System.out.print("1 "); /* Line 12 */
                    case x: System.out.print("2 ");   /* Line 13 */
                }
            }
        

        int x = -1;  
        assert (x > 0):"Faild"; 
        System.out.println("finished"); 

    //    Boolean b = new Boolean("false");
       // System.out.println(b);

        long p = (byte)100;

        System.out.println((new RuntimeException() instanceof Exception));
      
    }
}