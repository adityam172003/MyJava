class Sblock
{
	public int x;
	static int y;
	
	static
	{	
		// Main purpose of the static block is to initialize the static variables 
		//--------------------------------------------------------------------------
		// we can access static data member s and member functions directly 
		y =10;
		
		System.out.println("In the static block of sub class");
		System.out.println("Accessing static data members = "+y);
	}
	
	
}


class file_3_StaticBlock
{		/*
			
			
			Static block gets excuted at the time of class file loading into the 
			jvm memory ,hence 
			
			static blockes gets excuted before the main function

			duing loading  in perparation phase 
			all the static data members are initialized by their default values given by jvm
			and during inititialization stage of class loder subsystem  all static blocks are executed ant at that time 
			static variables are initialized by their actual values 
			
			
		*/
		
		// atleast one Action should be performed to excute satic block
	
		// 1 ] accessing static data members 
	
		//StaticBlock.y=12;
		
		// 2 ] accessing static memebre function
		
		//StaticBlock.Show();
		
		// 3 ] creating the object of the class
	        //     if we decleare only reference variable then static bock will not being excuted
		
		//StaticBlock st = new StaticBlock();
		
		
		
		//  if there ara multiple static blocks then the will excute sequentially
		//  StaticBlock.Show();
		
		// first all static blocks get excuted 
		// they will excute only once in the program
		
		
		// can access Static data members directy only
		//StaticBlock.Show();
		
		// cant access non-static data members directly
		// can create locally ... and access using object name and (.) operator
		
		private  int p =  Sblock.y;
		
		// first memory is allocated and then execution is started 
		// thats why in this case first static block of sub class will run and then
		// main class 
		
		// if we make p as non static then it will not happen like this 
		
		
		static
		{
			System.out.println("in to the main class static block");
		}
		
		
		public static void main(String [] args)
		{
			
			
			System.out.println("In the main function");
			
			
			file_3_StaticBlock b = new file_3_StaticBlock();
			
			//System.out.println("y = " + Sblock.y);
		}
		
		
		
		/*
			from the above exprinments we have learnt lots of things 
		*/



}
