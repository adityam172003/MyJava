

/*  

    Creating our own string object 

    there are various methods ie constructors present in String class we can create string 
    using this constructors but there are 2 common ways to create string 


    1 ] By string literal 
    2 ] By New keyword (creatring string object at runtime );
    

  *  1 ] String literal 

       In Java, the concept of the string literal pool, also known as the string 
       constant pool, refers to a special area in the Java heap memory     where
       strings created using string literals are stored.
    ==============================================================================  
       
       we can create string literal using double quots ("string content")
    ==============================================================================

        Now the interesing point about process that JVM do to create string 
        When we create string using literal pool JVM do following things 


        1 ] It checks the STRING CONSTAND POOL ( string literal pool) 
                          ====================
        2 ] If string already present in the pool then the same reference is returned and 
            no new object gets created 
        3 ] If not then new object is created placed in literal pool and reference is 
            returned 

============================================================================================
        
        You can check it using identityHashCode function present in System class as 
        static method  it returns the hash of the reference
        (This is native method)
        IdentityHashCode function is a part of the java.lang package and is used to 
        generate a hash code for an object based on its memory address.
                                    ----------------------------------
        
        hashCode( ) function returns the same but in context of string 
        it has been overriden by string class it has its own implementation
        and so hashCode value in string is depends on string content and not 
        memory address 

        this is main difference in identityHashCode and hashCode in context of java string 

============================================================================================



        1 ] Why Java uses the concept of String literal?
            To make Java more memory efficient


        2 ] Is it availabe for garbage collection 
            It's important to note that the string literal pool is part of the overall
            heap memory managed by the Java Virtual Machine (JVM), and it's subject to
            garbage collection like other objects in Java.
        

=================================================================================================

    *    2 ] new Keyword

            we have 4 main constructors of class String to create the string 

            When we create string using new then it will create at max 2 object 
            1 ] in heap section 
            2 ] in literal pool is not present 


            constructors in string 
            0 ] String()
            1 ] String(Literal) 
            2 ] String(char[] arr)
            3 ] String (char [] arr, start_index,offset)
            4 ] String (byte [] arr)

            except this constructors there are many more go to defination of the class
            for more information 

            



 */


public class file_2_Creating_String {
    

    public static void main(String[] args) {


        // String literal pool concept 
        String sLiteral = "String using Literal";
        
        // Here no new object gets created when we create string s2 
        String s1 = "String 1";

        // s1 and s2 refering same instance 
        String s2 = "String 1";

        System.out.println("Identity hash code s1 = "+System.identityHashCode(s1) + " ");

        System.out.println("Identity hash code s2 = "+System.identityHashCode(s2) + " ");

        System.out.println(sLiteral);

        
        // string using new keyword 

        String str = new String("String using new keyword");
        
        // now here two objects are created keep in mind 

        System.out.println(str);

        // Anonymous array 
        String strChar = new String(new char[] {'a','d','i','t','y','a'});

        // similarly you can have byte array and practice the other constructors 
        

    }   
}
