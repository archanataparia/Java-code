package StringNArraysCTC;

/*CTC 1.1-pg-73 Implement an algorithm to determine if a string has all unique characters. */

import java.util.*;
public class Unique_char_String_check {
	//if other ds use is allowed we can use hash set
	boolean checkString(String s)
	{
		boolean result;
		HashSet<String> set = new HashSet<String>();//set is useful for eliminate duplicate
		for(char ch: s.toCharArray())
		{
			if(!(set.add(String.valueOf(ch))) ) return false;
		}
		result=true;
		return result;
			
		}
	//if you cannot use additional data structures-book solution

	 boolean checkString2(String str) 
	 {
		 if (str.length() > 256) return false;
		 boolean[] char_set = new boolean[256];
		 for (int i = 0; i < str.length(); i++) 
		 {
			 int val = str.charAt(i);
			 //System.out.println(str.charAt(i));
			 if (char_set[val]) { // Already found this char in string
				 return false;}
			 char_set[val] = true;
		 }
		return true;
	 }
	 
	
	public static void main(String[] args)
	{
		Unique_char_String_check obj=new Unique_char_String_check();
		Scanner sc = new Scanner(System.in);
		String s =sc.nextLine();
		boolean result=obj.checkString2(s);
		System.out.println(result);
		sc.close();
	}
}



