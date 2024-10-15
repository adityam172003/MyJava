
/*
    StringBuffer class 
    
        reference : https://www.javatpoint.com/StringBuffer-class

        StringBuffer objects are muitable they can be updated and modified without 
        creating new object in heap like string 


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
            StringBuffer =-------------------




            Java StringBuffer class  is thread safe 
            
            Every method in StringBuffer is Synchronized 
            ============================================

            

            Some constructors

            1 ] StringBuffer()
            2 ] StringBuffer(string)
            3 ] StringBuffer(capacity)



            initial capacity of stringBuffer is 16 

            each time capacity increaes by 2*previous +2

            capacity and length concepts are different here 

===================================================================================================


Comparison problem 

    Unlike string class 

    The equal method in StringBuffer case is not overriden by class 
    so the equal method for stringBuffer is meantt for reference comparison and 
    not for content comparison 

    same goes to == 

    we have compareTo method to compare the stringBuffer objects 

=============================================================================================


// explore various methods present in stringBuffer class and observe their signature


Difference between stringBuffer and String


-------------------------------------------------------------------------------------------

No.	        String	                         |           StringBuffer
 -----------------------------------------------------------------------------------------
1)* The String class is immutable.           |	The StringBuffer class is mutable.
                                             | 
2)	String is slow and consumes more memory  |   StringBuffer is fast and consumes less 
    when we concatenate too many    strings  |   memory when we concatenate t strings.
    because every time creates new instance. |                                           
    	                                     |  
3)* String class overrides the equals()      |  StringBuffer class doesn't override 
    compare the contents of two strings      |  the equals() method of Object class.
    method of Object class. So you can       |
    by equals() method.                      |
                                             |
4)	String class is slower while performing  |  StringBuffer class is faster while performing
    concatenation operation.	             |  concatenation operation.
                                             | 
5)* String class uses String constant pool.	 |  StringBuffer uses Heap memory
----------------------------------------------------------------------------------------------

 */


public class file_7_StringBufferClass {
    
    public static void main(String[] args) {

        // creating stringBuffer object 
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        
        StringBuffer sbt = new StringBuffer("Aditya");


        // here new capacity = strlen+16

        System.out.println(sbt.capacity());

        // it is very important to not it down it is minimum capacity 
        // but the capacity increases by  =  2*(previous capacity) +2;

        sb.ensureCapacity(19);
        System.out.println(sb.capacity()); // 16*2 +2
        sb.ensureCapacity(69);
        System.out.println(sb.capacity()); // 34*2+2 


//==========================================================================================
        // string comparison
        StringBuffer sbb = new StringBuffer("A");
        StringBuffer sb2 = new StringBuffer("A");
        System.out.println(sbb.equals(sb2));// false
        System.out.println(sbb==sb2);// false;
        System.out.println(sbb.compareTo(sb2)==0);// true 



    }
}
