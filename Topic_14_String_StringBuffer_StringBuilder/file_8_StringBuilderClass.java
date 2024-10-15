


/*
    StringBuilder 

        reference : https://www.javatpoint.com/StringBuilder-class

        If you want to manipulate the string multiple times then go with StringBuilder class 

        StringBuilder is a muitable string and we can update it latter on 

        it has initial capacity of 16 

         AbstractStringBuilder           Appendable   Serializable Comparable  CharSequence
                |                           |              |           |            |
                |                           =---------------------------------------=
                |                           |
                |                           |
                |                      (implements)
            (extends)_                      |
                |                           |
                |                           |
                |                           |
            StringBuilder =-------------------



            The only difference in stringBuffer and StringBuilder is that 
            
            StringBuffer methods are thread safe ie synchronized 
            StringBuilder methods are not thread safe 

            StringBuffer object is muitable 
            StringBuilder object is also muitable 

            StringBuffer is from since JDK 1.0 version
            StringBuilder is from since JDK 1.5 version 


            The motive to Create stringBuilder is to improver multithreading 
            and its parallerism to run non-cooperative threads independently and
            asynchroniously 



            Rest all is same like stirngBuffer 

            mean capacity equality and comparison etc .


    
        Difference between stringBuilder and Buffer 

----------------------------------------------------------------------------------------------------
No.     	StringBuffer	                                    StringBuilder
-----------------------------------------------------------------------------------------------------
1)	StringBuffer is synchronized i.e. thread safe. |   StringBuilder is non-synchronized i.e. not 
     It means two threads can't call the methods   |   thread safe. It means two threads can call
     of StringBuffer simultaneously.               |   the methods of StringBuilder simultaneously.
    	                                           |        
2)	StringBuffer is less efficient than            |   StringBuilder is more efficient than 
    StringBuilder.                                 |   StringBuffer.
                                                   |
3)	StringBuffer was introduced in Java 1.0	       |    StringBuilder was introduced in Java 1.5

----------------------------------------------------------------------------------------------------
 */



public class file_8_StringBuilderClass {
    
}
