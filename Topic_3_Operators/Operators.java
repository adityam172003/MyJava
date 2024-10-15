

/*


		Operators in Java 
		
		1] Unary Operator ++ , -- 

		2] Arithmetic Operator + -  * /  

		3] Shift Operator >> << >>>(unsigned right shift operator) 

		4] Relational Operator  ==  <= >=  < > !=  return boolean 

		5] Bitwise Operator & | ! ^ ~  << >> >>>  always returns int 

		6] Logical Operator || && !  return boolean values  Shot-circuit 
		
		7] Ternary Operator (Conditional operator ? :)
		
		8] Assignment Operator. = += -= *= /=  


		reference : https://www.javatpoint.com/operators-in-java



		instanceOf is also the relational operator




 */




class Operators
{
	public static void main(String a[])
	{
	   System.out.println("This is operators in java");
	   // 1 ]  arithmatic operators 
	   /*
	     here only % operator behave differently as it works with fractional values 
	     also 
	     rest all are same like c++
	   */
	                     // || bydefault the fractional valuse are of type double 
	   float b = (float)(12.5%5); // we need to typecase it explicitely 

	   
	   System.out.println("the value of b = "+b);
	   
	   
	   // 2 ] assignment operators 
	   
	   /*
	     if we decleare the x
	     int x 
	     then it is not possible to type cast the datatype of implicitly 
	     we cant chage the datatype of the decleared variale implicitly 
	     
	     x= (int) 2.5;
	     will not rais the error 
	     
	     but 
	     x=2.5;
	     will rais the error 
	     
	   */
	   
	   
	   int x = (int)2.5;
	   System.out.println("value of x  is = "+x);
	   
	   
	   // 3 ] relational operators
	   
	   /*
	   this operators return boolean value  depending on the 
	   condition
	   
	   remember that boolean is incompatible with any datatype it is not like 
	   c++;

	   **  instanceOf is a relational operator in java which returns true if the object is 
	   of that type , else return false 


	   
	   *************************************************
	   here true is not like any non zero number 
	   
	   and false is zero number .
	   
	   here true is only true 
	   
	   and false is false 
	   
	   *************************************************
	   
	   */ 
	   
	   boolean bol= 2>3;
	   System.out.println(bol);
	   
	   bol = 2<=3;
	   System.out.println(bol);
	   
	   // 4 ] Logical operators 
	   /*
		
	      The logical  operatoers only work with boolean datatypes 
	      return only true or false 
	      
	      in java we have 5 logical operators
	      
	      logical && 
	      logical ||
	      
	      logical & 
	      logical |
	      
	      logical !
	      
	      
	      there is the difference in the single & and single | operations 
	      in java 
	      
	      the concept of the short circuit 
	      
	      for && if the first exp is false then second exp is not checked;
	      for || if the frist exp is correct then second exp is not checked
	      
	      but for the single &  and single | operators both the exp are cheked 
	      compulsary 
	      
	      
	       
	   */
	   
	   boolean res_log = (2<3)&(3<5);
	   
	   System.out.println("result of the boolean expression : (2<3)&(3<5) = "+res_log);
	   
	   
	   // 5 ] Increment decrement operators  (Unary Operators )
	   
	   /*  	
	  
			we have two types of unary operators 

			1 ] prefix 
				In prefix first operation is performed and then value of the 
				variable is utilized 

			2 ] postfirx 
				here first value of operator is used and then operation is performed 

		
			this operators work on only variables not on constant values 
			ie ++X or x++ is ok 
			but ++2 or 3-- is not possible 
			because ++x is nothing but x=x+1
			and so for ++2 2=2+1 is never possible 
			
			priIncrement  = ++c;
			postIncrement = c++;
			
			
			// this will work with floating type values 
	   
	   */
	   
	   int i_d     = 10;
	   
	   int i_d_res =  i_d++;    // post increment    -- first use the original value and then increment 
	                            // therefor i_d_res == 10 and i_d = 11;
	                            
	  System.out.println("after post increment i_d_result = " + i_d_res + " and i_d = " + i_d);
	  
	  i_d = 10;
	  i_d_res = ++i_d;          // pre increment -- first increment the value and then use it ;
	                            // therefor the value of i_d_res = 11 and i_d =11;
	  
	  System.out.println("after pre increment i_d_result = " +i_d_res + " and i_d = " + i_d);
	  
	  //i_d_res  = i_d+++++i_d;   // it will rais the error  - unexpected type ......
	  
	  // checking for float values 
	  
	  float f_id  = (float)2.5;  // the 2.5 bydefault is double in java so need to convert explicitly
	  
	  float rf_id = ++f_id;      // pre increment 
	  
	  System.out.println("pre incrememnt result rf_id  = " + rf_id ); // rf_id == 3.5
	  
	  
	  
	  // 6 ] conditional operators  (Ternery Operator)
	  
	  
	  /*
	     it is the turnary operator  exp = exp1 ? exp2:exp3;
	     
	     // dependint the boolean result of exp1 the value in exp2 or exp3 is given to the exp
	  */
	  
	  int turn_op= (3>4)?3 : 4;
	  
	  System.out.println(turn_op);    // res = 4 ;
	    
	


	 
	}

}
