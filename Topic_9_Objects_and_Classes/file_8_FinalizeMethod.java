

/*
    
    The finalize method is deprecated in recent versions of Java. 
    It is recommended to use other resource management techniques, 
    such as the try-with-resources statement with AutoCloseable or 
    Closeable interfaces for managing resources like files and network connections.



 */



public class file_8_FinalizeMethod {
            
    


    // when exception occurs then there are two cases 
    
    /*
        1 ] when we explicitly call the finalize method then 
            | --- > exception is generated and if not handled then program will terminate 
        
        2 ] when garbage collector calls the finalize 
            | --- > dosnt matter exception is generated or not program will run as it is 
                    mean here jvm ignores the exception 
        

        finalize method is called exactly ones for an object by garbage collector 
        =========================================================================

        we can call it explicitly any number of time :
        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
     
     */

    
    
     // access type is protected in Object class 
     
    @Override
    public void finalize() throws Exception{


        System.out.println("This is like distructor");
        
    }






}
