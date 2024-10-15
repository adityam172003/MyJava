

/*
    Java String 

    it is wrapper class and it is final 
        reference : https://www.javatpoint.com/java-string


    Java String is one of the most important topic to understand 

    we have various classes for string 

    1 ] String 
    2 ] StringBuffer
    3 ] StringBuilder 

    we will see one by one here 

    String is inbuilt class Present in  java.lang  package 
                                       -----------
    String in java is not like in c or c++.
    Here we cant access string as a char array containing \0 at the end 
    we have to access the string as a object nothing else 

    but java provides various methods to manipulate and access the string as we want 

    String class implements three classes 

                        
                    Serializable  Comparable   CharSequence
                        |              |            |   
                        |              |            |
                        |              |            |
                        -----------------------------
                                       |
                                       |
                                       |
                                    String 



        CharSequence Interface 
            Since 1.4
            This interface works with sequence of charactors present in the string 
            
            and from 1.8 version it works with char stream api 
            IntStream interface (go to defincation for more understanding);
        

    
    
    One of the important topic about string is Immutability 
                                            -----------------
        Ones we create a string then we cant change it. when we modify 
        any string new string object gets created and its reference is 
        stored in our old variable 

        but we cant update the existing string. this thing is different with stringBuffer and stringBuilder 
        we will see it latter 

        we will have seperate topic on immutability 




        Hash code for the string is calculaed using follow formulae
        
        h(s) = s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
    

 */ 


public class file_1_IntroToString {
            
    public static void main(String[] args) {
        String s= new String("Hello , Lets start with String");
        System.out.println(s);
    }    

}
