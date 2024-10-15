



/*
 
    * Collection Framework : 
    ========================


    What is java Collection :   
        Representing the group of individual object as single entity is known as 
        collection of objects in java 
    
    
    What is framework : 
        a set of classes and interfaces which provides ready-made architecture 

    
    ------------------------------------------------------------------------------------
    Which is better collections or arrays :                                             |
        depends on application and requirement                                          |
        if we want performance and we know the memory required then go for arrays       |
        if we want easy programming and variable elements records and no any problem    |
        about performance then go for collections                                       |
                                                                                        |
    ------------------------------------------------------------------------------------


   Important points related with collection framewrok 

        The java Collection framework is introduced in JDK 1.2 Version 

        present in java.util package 

        we cant store the premitive members in collection we can only store the objects in collection 
        for that purpose we have wrapper classes concept to store premitive 

        every datastructure is built on top of some internal data structure such as 
        arrays, linked list , trees , hash tables etc 

        collections are growable in nature , we can increas or decreas the size of collection 

        collections provide less perfomance and proper memory utilization

        

        Legacy classes are : vectors  and hashTables 


        The basic root interfaces in collection framework are 
        :   Collection and Map  (both are interfaces )



        what is Collection and Collections 

        :   Collection is an Interface :- 
        :   Collections is a class which defines utility methods for working with collections 
            all methods in Collections class are static 





        What is collection framework : 
            It contains the several classes and interfaces used to represent a group of objects 
            as a single entity 

        =========================================================================================
        

        Hierarchy of collection framework 
        =================================



        Key Interfaces in Collection framework 

      * 1 ] Collection 
        2 ] List 
        3 ] Set 
      * 4 ] Map 
        5 ] SortedMap
        6 ] NevigableMap 
        7 ] SortedSet
        8 ] Queue 
        9 ] NevigableSet 

        Collection and Map are the root interfaces in Collection framework 

                                            Iterable(I)
                                                |
                                                |
                                                |
                                                |
                                            Collection(I)
                                                |
                                                |
                                                |
    ------------------------------------------------------------------------------------------------------------
    |                           |                                    |                                         |
    |                           |                                    |                                         |
    |                           |                                    |                                         |                     
   AbstractCollection(A)     SequencedCollection(I)(21)              |                                         |               ( Set is just a name internaly it uses the map concept completely )                                  
    |                           |            |                       |                                         |                                                     
    |                           |            |                       |                                        Set(I)+------------------------------------------------------>+                                    
    |                           |            |                       |                                         |                                                            |
    |                           |            |                     Queue(I)1.5                                 |                                                            |
    |                           |            |                       |                                         |                                                            |
    -------------               |            |                       |                                         |                                                            |
                |               |            |                       |              (AbstractCollection)       |                  (SequencedCollection)              (AbstractCollection)
                |               |            |                       |-------------> AbstractQueue()           +---------->+-----> SequencedSet(I)                    AbstractSet(A)                       
    AbstractList(A)<----------List(I)        |                       |                  |                                  |             |                                  |  
        |                       |            |                       |                  |                                  |             |                                  |
        |                       |            |------------------> Deque(I)1.6           |                                  |             |                                  |             
        |                       |                                    |                  |                                  |             +-----+                            |                       
        |                       |                                    |                  +----> PriorityQueue(C)            |                   +------> SortedSet(I)        |                         
        |                       |                                    |                                                     +-------------------+            |               |                                        
        |                       |                                    |                                                     |                                |               |   
        |---------------------->+--> ArrayList(C)                    |                                                     |                                |               |                                              
    Abstract                    |                                    |                        (AbstractCollection)         |                        NavigableSet(I)1.6      |                    
    SequencedList               +--> Vector(C)1.0                    +-----------------------> ArrayDeque(C)               |                                |               |               
        |                             |                              |                                                     |                                |               |                    
        |                             +--> Stack(C)1.0               |                                                     |                                +------>+<------+                                 
        >-------+                                                    |                                                     |                                        |       |
                |                                                    |                                                     |                                   TreeSet(C)   |
                |                       +<---------------------------+                                                     |                                                |       
                |                       |                                                                                  +---------------------->+<-----------------------+        
                |                       |                                                                                                          |                                         
                +---------------> LinkedList(C)                                                                                                    |                     
                                                                                                                                               HashSet(C)   (actually HashMap ) 
                                                                                                                     (SequencedSet)                |
                                                                                                                           |                       |
                                                                                                                           +---------->+<----------+                       
                                                                                                                                       |
                                                                                                                                       |
                                                                                                                                       |
                                                                                                                                       |
                                                                                                                                LinkedHashSet(C)
              
                                                                                                                                

                                               Map(I)
 Dictionary(C)                                   |
    |                                            |
    |                                            |
    |           +------------------+-------------+------------+-----------------+
    |           |                  |                          |                 |
    |           |                  |                          |                 |   
    |           |                  |                          |                 |
    |           |                  |                          |                 |
    |           |                  |                          |                 |    
    |-------->| |                  |                     AbstractMap(A)     SequencedMap(I)
              | |                  |                          |                 |
            Hashtable(C)           |                          |                 |
                                   |                          |                 |
                                   |                          |                 |
                                   +----------->|<------------+             SortedMap(I)
                                                |             |                 |
                                                |             |                 |
                                                |             |                 |
                                            HashMap(c)        |             NavigableMap(I)
                                                |             |                 |
                                                |             |                 |
                                                |             |                 |
                                                |             |                 |
                                                |             +-------->|<------+
                                                |             |         |
                                                |             |         |
                                                |             |         |
                                                |             |         |
                                        (SequencedMap)        |         |
                                        LinkedHashMap(C)      |      TreeMap(C)
                                                              |
                                                              |
                                                              |
                                                            (Map)
                                                        IdentityHashMap



=========================================
AbstractList : random access 
AbstractSequentialList: sequenced access 
=========================================





HashMap internally uses the array of trees since java 8 version
to avoid collisions before java 8 linked list was used 




















        Collections
        ===========
                It is utility class which defines the methods required to manipulate the 
                set of objects 

                All methods in Collections are static 
                -------------------------------------
        
                * we cant create the object of Collections class because its default constructor is 
                private *
                
             
                

    


    The sorting alogrithm used in the Arrays Class is legacyMergeSort ie merge sort algorithm 




 */

import java.util.ArrayDeque;
import java.util.Map;

public class file_01_Introduction {


    public static void main(String[] args) {
        System.out.println("Collection Framework");
        System.out.println("====================");
        
    
    }


}