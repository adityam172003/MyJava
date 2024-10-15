/*

=========================== THE JVM ARCHITECTURE===============================


JVM - : JAVA VIRTUAL MACHINE 

	id abstract machine because it dosnt exists physically.It is the software 
	iterpreter which provides the runtime environment in which java bytecode 
	can be excuited 
	
	
	JVM is a Software it is written in C
	
	
	JVM architecture : - 
	
	
	after compiling  the code :====:
	
	.class file 
	
	
	                         CLASS LOADER SUB-SYSTEM 
	                         	 -----				   
					   |----------- 1 ] METHOD AREA
					   |
					   |----------- 2 ] HEAP AREA             
					   |					   
					   |----------- 3 ] STACK AREA
					   |
					   |----------- 4 ] PC RESISTOR          
					   |
					   |----------- 5 ] NATIVE METHOD STACK            
                                                       
                                                        
        EXCEPTION ENGINE --------->[ NATIVE METHOD INTERFACE ]
        
        				|
        				|
        				|
        				v
        		       NATIVE METHOD STACK                                        
                                                        
                                             
                                             
      When we run the .class file using 
      					java class_name
      					
      		1 ] class loader subsystem reads .class file of your class 
      		 
      		|
      		|
      		
      		2 ] store necessary binary information of the class in the method area
      		
      		|
      		|
      		|
      		
      		for each class the JVM stores information like
      		
      				1 ] Fully qualified class name
      				2 ] fully qualified parent class name
      				3 ] methods information
      				4 ] variables
      				
      				
      		|
      		|
      		|
      		
      		3 ] after storing the information in method area
      		
      		-------> JVM CREATES THE OBJECT FOR THE LOADED CLASS
      		-------> THIS OBJECT HAS DATA TYPE 
      				==> > java.lang.Class
      		-------> here -- Class -- is an built in class in the package lang 	        
                                                        

                                                        
                                                        
                                                  
                                                        
                                           





























*/
