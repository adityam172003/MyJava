

public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//------------------------------String literal pool -----------------------------------
		
		String s = new String("My string");
		System.out.println(s);
		StringBuffer sb1 = new StringBuffer("a");
		StringBuffer sb2 = new StringBuffer("a");
		// the equal method in StringBuffer class is not override from Object class 
		// it meant for reference comperasion only 
		System.out.println(sb1.equals(sb2));
		
		// but in string class it is meant for content comperasion only 
		
		// only one object gets created in heap this will not be combined with literals 
		String s1 = new String("A");
		System.out.println(s1.hashCode());
		// two objects get created  1 in heap and other is in string literal pool 
		String s2 = "A";
		
		// no object gets created as it is present in literal pool already so same reference
		String s3 = "A";
		System.out.println(s1==s2);
		
		String str1 = new String("ABC");
		// this method creates the object in pool 
		String str2 = str1.toUpperCase();
		
		System.out.println(str1==str2);
		//---------------------------------------------------------------------------------------
		
	}

}

