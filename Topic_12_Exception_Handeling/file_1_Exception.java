

/*
    reference : https://www.tutorialspoint.com/java/java_exceptions.html
              : https://www.javatpoint.com/exception-handling-in-java



  TO get more builtIn exception refer : https://www.tutorialspoint.com/java/java_builtin_exceptions.htm


    Exception mean      
            :Runtime Errors which can be handled by either by programmer or JVM
            :In Java, an exception is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime.
-
    Error :
            These are the errors which can not be handled at runtime eigher by programmer of JVM
    


    All exceptions belongs to class Exception  it contains 5 types of constructors 
                                    ---------
                                       
                                       Serializable 
                                             |
                                             |
                                         Throwable 
                                             |
                         ____________________|_____________________
                        |                                          |
                    Exception                                    Error
                        |                                          |
                        |                                          |
                RuntimeException                                   |
    ____________________|_______________________                   |----> VirtualMachineError 
    |       |    |                 |           |                   |            |
NullPointer | InputMismatch  IndexOutOf       Arithmatic           |            |-----> OutOfMemoryError
Exception   | Exception      BoundException   Exception            |            |-----> StackOverflowError
            |                      |                               |
            |                      |                               |----> AssertionError    
            |                      |-> ArrayIndexOutOf
 IllegalArgumentException          |   BoundsException
            |                      |
            |                      |-> StringIndexOutOf           
            |                          BoundsException   
            |
            |
            |----> NumberFormatException
            |
            |----> IllegalThreadStateException

=================================================================================================

         Exception
            |
            |
            |-----> ReflectiveOperationException
            |                 |
            |                 |---> ClassNotFoundException   
            |                 |---> NoSuchMethodException
            |
            |-----> IOException
            |             |     
            |             |-----> FileNotFoundException
            |
            |-----> InterruptedException

          

         RuntimeException
            |
            |
            |
            |------------->  NegativeArraySizeException  

   

All the classes of the RuntimeException are unchecked exceptions 
no need to declare or handle explicitly 

                ================================================================
                | The classes that directly inherit the Throwable class except |
                | RuntimeException and Error  are known as  checked exceptions.| 
                | For example, IOException,SQLException etc.Checked exceptions |
                | are checked at compile-time                                  |
                ================================================================

        
Checked Exceptions :
------------------
        A checked exception is an exception that is checked (notified) by the compiler
        at compilation-time, these are also called as compile time exceptions.   These
        exceptions cannot  simply  be  ignored,  the  programmer  should  take care of
        (handle) these exceptions.

Unchecked Exceptions :
-------------------
        An unchecked exception is an exception that occurs at the time of execution. 
        These are also called as Runtime Exceptions. These include programming bugs,
        such  as logic errors or improper use   of an API. Runtime   exceptions are
        ignored at the time of compilation.

Java Errors :
------------
        These are not exceptions at all, but problems that arise beyond the control
        of  the  user or  the programmer. Errors are typically ignored in your code
        because you can rarely do anything about an error. For example, if a  stack
        overflow occurs, an error will arise.  They are also ignored at the time of
        compilation.


Java Default handler : 
----------------------
        When a programmer does not explicitly handle an exception in Java, the Java 
        Runtime Environment (JRE) handles the exception   using a mechanism  called
        the default exception handler.
        It prints the exception details  (type, message, and stack trace)  and then
        terminates the program or the thread where the exception occurred.

 */

public class file_1_Exception {
    
        public static void main(String[] args) {
                /*
                        // Observer  what what jvm provides when exception is thrown 
                           and handled by JVM itself 



                   Exception in thread "main" java.lang.NumberFormatException: For input string: "1a"
                                at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
                                at java.base/java.lang.Integer.parseInt(Integer.java:661)
                                at java.base/java.lang.Integer.parseInt(Integer.java:777)
                                at file_1_Exception.main(file_1_Exception.java:105)     

                 */
                int a = Integer.parseInt("1a");

                
        }
}
