


/*
        try-catch-finally with resource 
        ================================

        Also known as Automatice resource management 
        ============================================

        The Java try-with-resources statement is a try statement that is   used
        for declaring one or more resources such as streams, sockets, databases,
        connections, etc. These resources must be closed while the   program is
        being finished.The try-with-resources statement closes the resources at 
        the end of the statement.
        


        Introduced in Java-7 version 
        ============================


        for autoclosable it is necessary for the class to implements the AutoClosable interface 
        with close() method inside it 

        when resource is released the close() method gets invoked 


 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Try_WithResource implements AutoCloseable {
    int x =10;

    public void close(){

        System.out.println("Resource released ");
    }


    public static void main(String[] args) {
        System.out.println("Main in try with resource concept ");


        // syntax 
        // last resource in try paranthesis has no semi colon at the end of line  
        //===================================================

        try(Try_WithResource tr = new Try_WithResource();
            Try_WithResource tr2= new Try_WithResource()
        
        ){

            System.out.println(tr.x);
        }
        catch(Exception e){

            System.out.println(e);
        }
        


        
        try(Connection con = DriverManager.getConnection(null, null, null))
        {

        }catch(SQLException sq){
            System.out.println(sq);
        }
    }
}