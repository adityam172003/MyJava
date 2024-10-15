class Object
{
	int x;
	
}

class ObjectAssign
{	
/*
	Assigning the objects is nothing but the assigning the reference of the objects to other
	reference variable
	
	ex
		Let  
		      in main                 in heap
			
		     o1[1000] --------------> [x[10] ]
		     
		     o2[2000]---------------> [x[20] ]
		     
		     after assigning the o1 to o2 ;
		     
		     the reference stored in o2 gets replaced by reference stored in o1;
		     
		     o2 = o1
		     
		     
		     o1[1000] --------------> [x[10] ]
		                               ^
		                               |
		     o2[1000]-------------------    [x[20] ]  <----- it will collected by garbage collector 
		     
		     hence changes made by o2 in x will get reflected by o1 also
		     as bothe references are referring to the same object 
		     
		     
		     
		     
*/


	public static void main(String[]args)
	{
	
		Object o1 = new Object();
		Object o2 = new Object();
		
		o1.x =10;
		o2.x =20;
		
		System.out.println("o1.x = " +o1.x);
		System.out.println("o2.x = " +o2.x);
		
		
		o2=o1;
		
		System.out.println("o1.x = " +o1.x);
		System.out.println("o2.x = " +o2.x);
	
	}
}
