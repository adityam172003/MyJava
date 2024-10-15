import java.util.*;




/*			
		
		IMPORTANT POINT TO BE NOTED HERE IS THAT THE CONDITIONAL 
		STATEMENT WHICH YOU WILL PROVIDE IN THE IF BLOCK MUST 
		RETURN THE BOOLEAN VALUE
		
		YOU CANT USE ANY OTHER DATA TYPE AS A  CONDITON IN IF 
		LIKE WHAT YOU CAN DO IN C++;
		
		
		
		
		ONLY DIFFERENCE 
		
		
		
		int 
		short 
		byte 
		long 
		char 
		String (since java 7)
		enum
		
		are only valid labels in switch case statement 
		
		case value must be the constant literal and not variable 
		---------------------------------------------------------
		case value must be unique 


*/

class Conditional

{
	/*
		CONDITIONAL STATEMENTS 
		
		---------------------------------------------------------------------------------------
		1  ] if-else 
		
			syntax 
			
			if(Boolean expression)
			{
			
				// statements 
			}
			else
			{
			
			
				// statements 
			
			
			}
	
		2 ] if - else if - else ladder 
		
			syntax
			
			if(condition_1)
			{
			
			}
			else if(condition_2)
			{
			
			
			}
			else if(condition_3)
			{
			
			
			
			}
			
			.
			
			.
			.
			.
			.
			else if(condition_n)
			{
			
			}
			else 
			{
			
			
			}
		
		3 ] nested if else 
		
			syntax
			
			if(condition 1)
			{
				if(condition 2 )
				{
					// statements 
				
				}
				else
				{
					// statements 
				
				}
			
			
			}
			else
			{
			
				if(condition 3)
				{
					// statements
				}
				else
				{
				
					// statements
				}
			
			}
			
		**********************************************************************************************
	
		CASE STATEMENETS 
		
		----------------------------------------------------------------------------------------------
		syntax 
		
		switch(integer expression)
		{
		
			case label1 : {
				     	 statemenets 
				     	 
				     	 break;
				      }
				      
			case label2 :{
					statements 
					
					break;
				     }
			case lable3 :{
				         statements 
				         
				     
				         break;
				     }
			.
			.
			.
			.
			
			case labeln : {
			  	          statements 
			  			
			  			
			  			
				      	  break;
				      }
	 		
	 		default :
	 			{
	 			
	 				statements 
	 			
	 			}
		
		
		}
	
	
	
	*/

	
	public static void main(String [] args)
	{ 
		
	
	
		// 1 ] 
		
			boolean con_1 = 2>3;
			
			if(con_1)
			{
			
				System.out.println("Two is greater then three");
	
	                }
	                else
	                {
	                	
	                	System.out.println("three is greater than two");
	                
	                
	                }
	                
	       // 2 ] 
	       		
	       		// 1 scan two numbers from user and compare them 
	       		
	       		int a1,b1;
	       		
	       		Scanner sc = new Scanner(System.in);
	       		
	       		System.out.println("Enter the first number " ) ;
	       		a1= sc.nextInt();
	       		
	       		System.out.println("Enter the second number " );
	       		b1= sc.nextInt();
	       		
	       		if(a1>b1)
	       		{
	       			System.out.println("first numebr is greater than second number ");
	       			
	       		}
	       		else if(a1<b1)
	       		{
	       		 	System.out.println("Second numebr is greater than first number");
	       		}
	       		else
	       		{
	       			System.out.println("Both numbers are the same");
	       		
	       		}
	       		
	       		
	       		// 2 scan the gender from the user in m | f and print the male or female 
	       		
	       		
	       		String s1;
	       		
	       		sc.nextLine();   // to clear the buffer 
	       		
	       		
	       		System.out.println("Enter the gender ");
	       		
	       		s1 = sc.next();  // as we are taking char from the string 
	       		
	       		char s1_  = s1.charAt(0);
	       		
	       		if(s1_=='m' || s1_ == 'M')
	       		{
	       			System.out.println("male");
	       			
	       		}
	       		else if (s1_=='f' || s1_ == 'F')
	       		{
	       		
	       			System.out.println("Female");
	       			
	       		}
	       		else
	       		{
	       			System.out.println("Invalid input");
	       		
	       		}	
	       			
	       		
	       	// 3 ] 
	       	
	       		// 1 scan two number just change the condition 
	       		
	       		
	       		int a12,b12;
	       		
	       		//Scanner sc = new Scanner(System.in);
	       		
	       		System.out.println("Enter the first number " ) ;
	       		a12= sc.nextInt();
	       		
	       		System.out.println("Enter the second number " );
	       		b12= sc.nextInt();
	       		
	       		if(a12!=b12)
	       		{
	       			if(a12<b12)
	       			{
	       		 		System.out.println("Second numebr is greater than first number");
	       			}
	       			else
	       			{
	       				System.out.println("first numebr is greater than second number ");
	       			}
	       			
	       			
	       		}
	       		else if(a12==b12)
	       		{
	       			System.out.println("Both numbers are the same");
	       		}
	       		else
	       		{
	       			System.out.println("Invalid input");
	       		
	       		}
	       		
	       		
	       		// 2 leap year 
	       		
	       		
	       		int y;
	       		
	       		System.out.println("Enter the year : ");
	       		y = sc.nextInt();
	       		
	       		if(y%100==0)
	       		{
	       			if(y%400==0)
	       			{
	       				System.out.println(y+ " is leap year");
	       			
	       			}
	       			else
	       			{
	       				System.out.println(y + " is not a leap year");
	       			}


	       		}
	       		else if(y%4==0)
	       		{
	       		
	       			System.out.println(y+ " is leap year");
	       		
	       		}
	       		else
	       		{
	       			System.out.println(y + " is not a leap year");
	       		
	       		}

	       		

				String str = "Aditya";

				switch (str) {
					case "Aditya":
						
						System.out.println("Block 1 ");
						break;
					case "Mahajan":
						System.out.println("Block2");
						break;
					default:
						break;
				}
	       		


	
	
	}





}
