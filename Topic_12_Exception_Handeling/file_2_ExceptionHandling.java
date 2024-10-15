

/*
        Exception catch block is called universal catch block 
        ------------------------------------------------------

        We can handle exception by using try-catch-finally block 

        try-finally

        try-catch-finally

        try-catch -->catch---- (No one except last should have the Object of Exception or Throwable handler catch block)


        try-->{try-catch-finlly}->catch  (inner try-catch block)

        // this are the varius try catch blocks present 
        // try without (finally and catch ) is not possible there should be eithor of two is required



 */

import java.util.Scanner;

public class file_2_ExceptionHandling {
    public static void main(String[] args) {

        
        // Simple try -catch block
        try{
             
            int a = Integer.parseInt("1a");
        }
        catch(NumberFormatException NFE)
        {
            System.err.println("eROR");
            System.out.println(System.err);
            System.out.println(NFE); //java.lang.NumberFormatException: For input string: "1a"
            NFE.printStackTrace();  // Print the stackTrace of the statement 
           System.out.println(NFE.getMessage());
        }


        // single try block and multiple catch block 

        try{
            // statement which can cause the exception 
        }
        catch(ArrayIndexOutOfBoundsException AE)
        {
            // handler 1 
        }
        catch(NumberFormatException NFE)
        {
            // handler 2 
            // child of IllegalArgumentException 

        }
        catch(IllegalArgumentException ES)
        {
            // handler 3
            // Parent of IllegelThreadStateException 
            // this block handles all the exceptions of its type and also its child classes 
            // exception 

        }
        catch(IllegalThreadStateException ETH)
        {
            // Thats why if parent class is present in upper ladder then we cant 
            // handle child class exception below it 

            // one type of exception can be handled only ones 
            // it will clear the condition why we cant use RuntimeExceptoin , Exception, Throwable 
            // classes in try-catch ladder 



            
            // Unreachable catch block for IllegalThreadStateException. 
           //  It is already handled by the catch block for IllegalArgumentException

           //  at file_2_ExceptionHandling.main(file_2_ExceptionHandling.java:60)
        }



        try{

        }
        catch(Throwable th)
        {
            System.out.println(th.getMessage());
            // this block is called universal catch block 
            // no other catch block will be reachable from here 
            // all type of exceptions can be handled here because all has its parent class Throwable
        
        }


        // If no matching catch block is found then exception is handled by jvm and 
        // it will terminate the program 


        // Explore the nested try-catch block
        // Explore try-catch inside the function and observe the stack trace 



        //===============================================================================



         // Final block 

         // it should be the last block after all catch block or after try block if there is no catch block

         /*
                    1 ] try---finally block 
                    2 ] try---catch--finally block
                    3 ] try---catch--catch--finally block 

            This block is executed compulsary idependent of wheather exception is occured 
            or not 

            There is a specific purpose of this block 
            To release the resources that program has occupied it is 
            necessary to release them 

            The finally block in Java is used to execute important code, such as cleanup 
            activities, that should run regardless of whether an exception is  thrown or
            not. The key  purpose of the    finally block is  to ensure    that  certain
            operations are always executed,no matter how the try-catch mechanism behaves.
            
            if jvm terminates or System.exit() called in either try or catch block 
            then only finally will not be executed 

          */

          try{
            
          }
          catch(Throwable err)
          {

          }
          finally{

            // finally block 
          }


          try{
            // Only try is not possible 
            // it either want finally or catch block 
            
          }
          finally{


          }



          // we cant write try--finally -- catch 


          
    }
}
