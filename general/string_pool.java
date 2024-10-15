

class Tanmay
{
	public static void main(String...args)
	{
		String s = new String ("Aditya");
		String s2 = "Aditya";
		String s3 = "Aditya"; // here s3 == s2  :- 
		if(s==s2)
		{
			System.out.println("Equal");

		}
		else{
			// because the s is created in heap and s2 contains the reference of
			// object present in string literal pool 	
			
			System.out.println("Not equal");
		}

	}

}
