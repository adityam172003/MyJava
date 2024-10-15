

/*
    Why the concept of checked and unchecked exceptions in java 


    Separation of Different Types of Errors:

        Checked Exceptions represent recoverable conditions that are expected to occur under normal circumstances.
        These are usually external problems that can be anticipated, such as file I/O issues or network connectivity problems.
        Unchecked Exceptions represent programming errors that are often the result of bugs, such as logic errors 
        (e.g., NullPointerException, ArrayIndexOutOfBoundsException). These are not expected to be recovered from at runtime, 
        and trying to handle them explicitly in the code is often unnecessary and counterproductive.
        
        
        
        Compile-Time Safety (Checked Exceptions):

        Checked exceptions force developers to handle potential error conditions during compile-time
        .This improves code reliability by ensuring that the developer either handles the exception 
        using a try-catch block or declares it using throws. This prevents unexpected failures at 
        runtime and makes it clear that certain operations (like file I/O, network access, etc.) can fail.
        The Java compiler enforces this mechanism, ensuring that any checked exception must be caught
        or declared, which leads to fewer unnoticed bugs related to recoverable errors.
       
       
       
        Runtime Flexibility (Unchecked Exceptions):

        Unchecked exceptions represent errors that are usually the result of programming mistakes
        or conditions that are outside the program's control (e.g., dividing by zero, accessing 
        an invalid array index). These exceptions are not required to be caught or declared, which 
        reduces unnecessary code clutter and keeps the code more readable and maintainable.
        This also gives developers flexibility because they don’t need to explicitly handle every
        possible runtime error that could occur (especially ones that are less likely to occur or
        can be corrected in future versions of the program).



 */




public class Cheched_Unchecked_Exceptions {
    
}
