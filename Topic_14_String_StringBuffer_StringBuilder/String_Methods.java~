// Various string methods in java 


class Demo
{
	public int a;
	
	
}

public class String_Methods {
	
	public static void main(String[] args) {
		System.out.println("String methods");
		
		// 1  ] valueOf() static method 
		
		String s1 = String.valueOf(100);
		String s2 = String.valueOf('c');
		
		// converts the given input to string
		// it internally calls toString method
		Demo d = new Demo();
		d.a =10;
		String s3 = String.valueOf(d);
		
		System.out.println(s3);
		
		
		// 2 ]  length() non-static method
		
		System.out.println(s1.length());
		
		
		// 3 ] concat() non-static method 
		
		// 4 ] charAt(index) non-static 
		
		// 5 ] getChars( s_index, e_index, array , start_index_array) non-static method
		
		char[] ch =new char[100];
		String chh = "ABCHDFIADU";
		chh.getChars(0, chh.length(), ch, 0);
		
		for(char c:ch)
		{
			System.out.print(c+" :: ");
		}
		System.out.println("-----");
		
		// 6 ] getBytes();
		
		byte[] v1=  chh.getBytes();
		System.out.println(v1);
		
		// 7 ] toCharArray() return char [] 
		
		// identityHashCode();
		
		System.out.println(s1.equals(s2));
		StringBuffer sb1 = new StringBuffer(s1);
		StringBuffer sb2 = new StringBuffer(s2);
		System.out.println(sb1.equals(sb2));
		System.out.println(System.identityHashCode(sb2));
		
		
		
		// 8 ] Comparison methods 
		
		
		 // 1 ] equals equalsIgnoreCase() non-static data members 
		
		
		// 2 ] regionMatches(true/false,index,string,index,characters)
		
			   s1 = "efghiabcdjklmnop";
			   s2 = "abcd";
			   System.out.println(s1.regionMatches(5, s2, 0, s2.length()));
		// 3] startsWith(string,indexfrom) non static
			   
	    // 4] endsWith(string); non-static 
			   
		// 5 ] compareTo(string) non-static
			   
			   
	     // 9 ] searching functions 
			   
			   // 1 ] indexOf(char)
			   
			   // 2 ] lastIndexOf(char,till index (from zero)) 
			   
	   // 10 ] string modification function 
			   
			   // 1 ] substring();
			   
			   String strsub = s1.substring(5); // it returns the substring from 5 to last index 
			   System.out.println(strsub);
			   strsub = s1.substring(2,12); // it returns the substring from 2 to 12
			   System.out.println(strsub);
			   
			   
			   // 2 ] replace 
			   
			   s1 = "aaabcd";
			   s2 = s1.replace('a','c');
			   System.out.println(s2);
			   s2 = s1.replace("aa", "--");
			   System.out.println(s2);
 			   
	}
	

}
