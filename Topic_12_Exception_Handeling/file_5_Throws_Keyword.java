
/*
  Throws keyword 

  This is different than throw keyword


  reference : https://www.javatpoint.com/throws-keyword-and-difference-between-throw-and-throws

 
 
  The Java throws keyword is used to  declare  an exception. 
  It gives an information to the programmer that  there may 
  occur an exception. So, it is better  for the  programmer
  to provide the exception handling code so that the normal 
  flow of the program can be maintained.


  We have to declare the checked exceptions only 

  Now Checked Exception can be propagated (forwarded in call stack).
    It provides information to the caller of the method about the exception.
 */


/*
    
Some important differences between throws and throw keyword 

refer : https://www.javatpoint.com/difference-between-throw-and-throws-in-java

throw:
=====
1]  Type of exception Using throw keyword, we can only propagate unchecked exception i.e., 
    the checked exception cannot be propagated using throw only.
2]  throw is used within the method. 

3]  We are allowed to throw only one exception at a time i.e. we cannot throw multiple 
    exceptions.
 
==========================================================================================
==========================================================================================

throws:
=======
1]  Using throws keyword, we can declare both checked and unchecked exceptions. However,
    the throws keyword can be used to propagate checked exceptions only.
2]  throws is used with the method signature

3]  We can declare multiple exceptions using throws keyword that can be thrown by the
     method. For example, main() throws IOException, SQLException.

 */

 /*
  The `throws` keyword in Java serves two main purposes:

    1. **Documentation:** It indicates to other developers using the method that  it may 
    throw certain types of exceptions. This helps in understanding the potential failure 
    scenarios and handling them appropriately in the caller code.

    2. **Propagation of Exceptions:** When a method declares that it throws a particular
    type of checked exception, it shifts the  responsibility of  handling that exception
    to the calling code. If  the exception occurs within  the method and is  not  caught
    and  handled within the method itself, it will be propagated up the call stack until 
    it is caught and handled, or until it reaches the top level of the program where  it
    may result in program termination.

    Behind the scenes, when a method throws a checked exception using the 
   `throws` keyword:

    - If the exception is not caught and handled within the method, it's propagated  to 
      the calling method.
    - If the calling method also does not catch and handle the exception,  it's further
      propagated up the call stack.
    - This propagation continues until either the exception  is caught  and  handled or
      until it reaches the top level of the program (such as the main method), where it
      may result in termination of the program if not handled.

    So, the `throws` keyword essentially delegates the responsibility of handling exceptions 
    to the calling code, allowing for better separation of concerns and more flexible error 
    handling strategies.

===========================================================================================
JVM DOES NOT HAVE ANY MECHANISM TO HANDLE THE EXCEPTION IT DIRECTLY TERMINATE THE 
PROGRAM AND PRINT THE MESSAGE AND STACKTRACE OF THE EXCEPTION CAUGHT DONE BY DEFAULT HANDLER 

IF MAIN THROWS THE CHECKED EXCEPTION WE NEED TO PROPAGET IT TO THE CALLING JVM 
SO WE NEED TO USD THROWS KEYWORD THERE 

THROWS HAS ONLY TWO PURPOSE 
----------------------------
1 ]  IMFORM PROGRAMMER THAT THIS FUNCTION CAN THROW THE EXCEPTION 
2 ]  TO PROPAGATE THE EXCEPTION 

==========================================================================================



When you declare that the main method throws an exception using the  throws keyword, 
you are essentially informing the compiler that the main method may throw a checked
exception but that it will not be handled within the main method itself.

In this case, it becomes the responsibility of the caller of the main method, which
is typically the Java Virtual Machine (JVM), to handle the exception.  However, the
JVM doesn't provide a mechanism  to catch and   handle exceptions   thrown from the 
main method. Instead, it usually results in   termination of the program and prints 
the exception stack trace to the console.



*/


public class file_5_Throws_Keyword {
    // checked exceptions can be propagated usign throws keyword 

    public static void main(String[] args) throws Throwable {
        
        throw new Throwable("Checked exception handled by jvm");
    }
}

