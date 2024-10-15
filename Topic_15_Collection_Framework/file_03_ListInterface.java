


/*
        List Interface :


        --------------------------------------------------------
        we can preserve insertion order via index              |
        we can differentiate duplicate objects by using index  |
        hence index will play very imp role in List interface  |
        --------------------------------------------------------

        Interfaces 
        
        1 ] List 
        2 ] AbstractCollection 
        3 ] AbstractList 
        4 ] SequencedCollection  
        5 ] AbstractSequencialList
       


        Implementation classe 

        1 ] ArrayList 
        2 ] LinkedList
        3 ] Vector 
        4 ] Stack 

        ===============================================================================|
        If you want to make unmodifiable list then how can you do it                   |
        : we can extends the AbstractList class and just change the implementation of  |
          get and size methods. rest throws UnsupportedOperationException              |
        ===============================================================================|
     



        Nearly All methods in Vector class are synchronized mean they are thread safe 
        =============================================================================





        ArrayList
        ==========
            ArrayList is Underlined data Structure Resizable Array or Growable Array.
            ArrayList Duplicates Are Allowed.
            Insertion Order is Preserved.
            Heterogeneous objects are allowed.
            Null insertion is possible.
            Initial capacity : 10 
            Not thread safe 
            Beneficial when our frequent operation is reterival 

        LinkedList:
            Doubly Linked List is used as underlined data structure 
            AbstractSequencialList 
            no random access 
            Beneficial when our frequent operation is insertion and deletion 




        The main difference between ArrayList and Vector is that all the methods in Vector 
        are thread safe and Vector is legecy class since java-1.0 version ArrayLIst is 
        from since java-1.2 verion. Increment size  of vector is 100%  








 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;



public class file_03_ListInterface {


    public static void main(String[] args) {

       
        // declaring the list object 
        // concrete class ArrayList 



        ArrayList<Integer> lis = new ArrayList<>();
        

        // add elements 
        for(int i =0;i<10;i++){
            lis.add(i+1);
        }


        // removing 

        lis.remove((Integer)80); // this is object so it removes the value 80 
        lis.remove(2); // this is index  so it remove the object present at index 2 

        
        // update 

        lis.set(0, 1000);


        // searching elements or 
        // accessing elements 
        
        System.out.println(lis.get(1) + " " + lis.indexOf(1000));
      

        //The list must be sorted into ascending order 
        System.out.println(Collections.binarySearch(lis,3));
        Collections.sort(lis); // internallly calls the lis.sort() only 
        // lis.sort();
        // her we can use both sorting functions 
        // lis.sort(<>) takes comparator functional interface with compare method implementation
        // used for our own sorting algorithm and order 


    
        System.out.println(lis.removeIf((Integer a)->{
            
            return a%2==0;
        }));


        System.out.println(lis);



        // check the element present
        System.out.println(lis.contains((Integer)5));
        // get index of that element 
        System.out.println(lis.indexOf(7));




        Stack<Integer>st = new Stack();
        
        st.add(10);
        st.add(20);
        System.out.println(st.pop()); // return and delete 
        System.out.println(st.peek()); // return 
            
        System.out.println(st.firstElement());
        










        LinkedList<Integer> lst = new LinkedList<>();

        lst.add(20);
        for(int i =0;i<10;i++){
            lst.add(20+i);
        }

       System.out.println(lst);

       // abstractsequentialList 
       
       System.out.println(lst.getFirst());
       System.out.println(lst.getLast());

       System.out.println(lst.get(8));





    }


}




























