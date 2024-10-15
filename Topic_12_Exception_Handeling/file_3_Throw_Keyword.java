

/*
    Throw  KeyWord   
    
    Reference :-
    
    : https://www.javatpoint.com/throw-keyword    \
    : https://www.tutorialspoint.com/java/java_throw_exception.htm



    The Java throw keyword is used to throw an exception explicitly.

    ** We can throw only those object of only Throwable class or object of those 
    classes dervied from Throwable **

    we can use throw keyword to rethrow an exception
     




 */ 


 class myclass extends Throwable
 {
    
    public myclass()
    {

    }

    public myclass(String mes)
    {
        super(mes);
    }


    // public String toString()
    // {
    //     return "This is custom error message from myclass class";
    // }
 }


public class file_3_Throw_Keyword {
    
    public static void main(String[] args) throws Throwable {
        // we will see about throws in upcoming files 


        // this throw the object of myclass which is an exception class with Throwable as parent 
        // class 

        // the point which is here to note it down is that message which is going to be shown 
        // after throwing the exception 

        // we have multiple ways to do it so 
        
        // one is to override the toString method which is done here with myclass
        // priority is given to this way if both are used 

// ->>>>>>>> //throw new myclass(); 

        // make parameterised constructor to call parent constructor and pass the message from 
        // constructor itself using super keyword 
        // after then dont override the toString method if you are using this way to 
        // pass the message 

        // if we dont pass anything then class name  will be printed insted of 
        // message 



// ->>>>>>>>> //throw new myclass("This is explicit message passed from constructor ");


        /*
            If we extends the Exception class to create our own exception then it will be checked exception 
            Eles if we extends the RuntimeException then it will be unchecked exception 


            rules are followed the same for builtin and user defined exceptions 
            -------------------------------------------------------------------
          
         */

    }
}

