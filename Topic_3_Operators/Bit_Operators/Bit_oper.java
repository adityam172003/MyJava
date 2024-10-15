class Bit_oper
{
	public static void main(String args[])
	{
		System.out.println("Bitwise Operators in the java");
		
		
		// the result of the bit-wise operators is always an integer 
		// it  returns only int value
		
		
		short x =10;
		//short res = x>>1;
		
		//System.out.println(res);  // it will generate error -possible losssy error
		
		short res =(short)(x>>1) ;  // is explicit conversion 
		
		System.out.println(res) ;  // will not generate error 
		
		
	        /*
	         some of the bitwise operators in java 
	         <<   left shift -(*2^n)
	              this formula will only give correct solution when the ans is in range 
	              else it will overflow 
	         
	         >>   right shift -(/2^n)
	              this formula will only give correct solution when the ans is in range 
	              else it will overflow 
	         
	         &    bitwise and 
	         
	         |    bitwise or
	         
	         ^    XOR 
	         ~    complement
	         
	         >>>  tripple right shift - unsigned right shift return always +ve value except 
	                                    datatype lower than int 
	         
	        
	        */
	
		
	        short x1 = 32767;                // this is the last max number stored in short 
	        // short = 2 byte ie 16 bit .. 
	        /*
	           32768 = 1000 0000 0000 0000 
	           32767 = 0111 1111 1111 1111 
	           after shifting 1 bit left 
	           x<<1  = 1111 1111 1111 1110
	           this is an negative number as its sign bit is negative 
	           .. after 2 s complement 
	           we will get 
	           ans of - ve sign 
	           0000 0000 0000 0010
	           ie final result is -2
	           
	           while doing left shift we should be aware  about the range of the datatype 
	        */
	       short f_res = (short)(x1<<1);
 	       System.out.println(f_res);    // -2 is the ans 
	       
	       
	       // bitwise right shift 
	       
	       /*
	         here we no need to consider the ranges of the data type 
	         
	         just need to consider sign bit while shifting the bit to the right
	         
	         the sign bit is shifted and same sign bit is given to the result number 
	         
	         the max right bit ans is -1 
	         
	         the right shift  ans of -ve numbers  is not ahead of the -1 
	         
	         
	         ex 
	         
	         -1>> n is always equal to = -1;
	         
	         
	       */
	       
	       short x2    = -2 ;  // 1111 1111 1111 1110;
	                           // after right shift -2>>1 = 1111 1111 1111 1111
	                            // this is the bit representation of -1
	                               
	       short r_res = (short)(x2>>1);   
	       
	       System.out.println(r_res); // -1
	       
	       
	       short x3 = -45;
	       
	       short x3_res = (short)(x3>>16);
	       
	       System.out.println(x3_res); // -1 
	       
	       // unsigned right shift 
	       
	       
	
	}
	




}
