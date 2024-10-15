

/*
    String Immutability 

    reference : https://www.javatpoint.com/immutable-string

    we will see Why strins are immutable ????? (fameous interview question);


    This is one of the most important concept in string 

    Immutable mean cant be changed 

    here if we create string ones we cant update it 
============================================================================================
    The main reason behind the immutability of the string is that 

    ==> String uses the concept of literal pool which hepls JVM for \
        1] performance improvement 
        2] effective memory utilization 

        now two veriables are referring same string present in pool 
        if one changes the string then those changes will be reflected in other variable also
        if there is no immutability concept which causes data inconsisteny and causes unknow error
        
        so to implement the strin literal pool concept it necessary to string to be immutable 


    1 ]  ClassLoader:

        A ClassLoader in Java uses a String object as an argument. 
        Consider, if the String object is modifiable, the   value
        might be changed and the class that is supposed to be loaded
        might be different.
        To avoid this kind of misinterpretation, String is immutable.

        it makes java program more secure 

    2 ] The username and password cannot be modified by any intruder because String
        objects are immutable


    


 */


public class file_3_Immutability {
    

    public static void main(String[] args) {
        
        String s = "aditya";
        s.concat(" mahajan");
        System.out.println(s);
        // here aditya will be printed because string cant be modified 
        // concat function returns the new reference which contains the required string 

        String modified = s.concat(" mahajan");
        System.out.println(modified); // this is actual answer we want 
        
        
    }
}
