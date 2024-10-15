


/*
    String concatination 
        reference : https://www.javatpoint.com/string-concatenation-in-java

        There are multiple ways to concat the string 

        1] +sign 
        2] append(string)
        3] concat(string)
        4] format("%s%s",s1,s2) 
        5] join("seperator",[strings]) since 1.8 v
        6] StringJoiner class 
        7] Collector.joining() since 1.8 v

        All above methods create strings in heap section independent on pool 

        
        Efficiency of the functions 

        For simple concatenations or small numbers of concatenations, 
        the + operator or concat() method may be sufficient and easy
        to read.

        For more complex concatenations, especially in loops or when dealing
        with larger amounts of data, StringBuilder or String.join()  tend to 
        be more efficient due to   their ability   to efficiently modify and 
        concatenate strings without creating unnecessary intermediate objects.

 */

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class file_5_String_Concatination {
    public static void main(String[] args) {
        
        // 1] + sign 

        // individuals are stored in pool 
        String ms = "Aditya Mahajan";
        String s1 = "Aditya";
        String s2 = " Mahajana"; 

        /*
            in the statement String s3 = s1 + s2;, a new string object is created in
            the heap to hold the concatenated value of s1 and s2. This new object is
            not added to the string pool because it's created dynamically at runtime. 
        */ 

        String s3 = s1+s2; // new string gets created in pool

        System.out.println(s3);

        // one thing is clear that inbuilt methods always creates the string 
        // in heap and independent on the pool wheather modified string present in pool or not 
        System.out.println(System.identityHashCode(s3)+" "+ System.identityHashCode(ms));



        // 2]  append()  this method is meant for StringBuilder and not for String class 
         String s4 = (new StringBuilder(s1)).append(s2).toString();
         System.out.println(s4);



        // 3 ] concat 
        
        String s33 = s1.concat(s2);
        System.out.println(s33);


        // 4] format 

         String s5  = String.format("%s,%s",s1,s2);
         System.out.println(s5);


        // 5 ] Join method 
        String jon = "Join method ";
        String s6  = s1.join(":",s1,s2,jon);

        System.out.println(s6); 


        // 6] StringJoiner class 
        // this is something extra in StringJoiner class than join method 
        // rest is same here 
        StringJoiner Stj  = new StringJoiner("::","Start "," End");
        
        Stj.add(s1);
        Stj.add(s2);

        System.out.println(Stj.toString());
        

        // 7 ] Collectors.joining method 

        List<String>lst  = Arrays.asList("a1","a2","a3");

        String str1 = lst.stream().collect(Collectors.joining("?"));
        System.out.println(str1);


    }
}
