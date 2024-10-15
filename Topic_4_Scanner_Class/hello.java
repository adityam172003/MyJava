class HelloWord
{

	// we cant create the object of class system as its constructor is private 

	// system class present in java.lang package 

	// -- remember 

	
	public static void main(String args[])
	{
	  System.out.println("running the first java program on ubunto linux operating system");
	  System.out.println(System.out);
	
	  HelloWord h = new HelloWord();
	 
	  // both are equal 

	  System.out.println(System.identityHashCode(h)+" == "+h.hashCode());

	// for objects other than string has hashCOde and identityHashCode is same 
	  String str=  "aditya";
	  String str2=  new String("aditya");
	  System.out.println(System.identityHashCode(str)+" == "+str.hashCode());
	  System.out.println(System.identityHashCode(str2)+" == "+str2.hashCode());
	}
 
}
