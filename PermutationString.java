package StringNArraysCTC;
/*Given two strings, write a method to decide if one is a permutation of the other*/
import java.util.*;
public class PermutationString {
static boolean strCheck(String str1,String str2)
	{
		if(str1.length()!=str2.length()) return false;//check length of two strings
		//string to char array
		char[] chArr1=str1.toCharArray();
		char[] chArr2=str2.toCharArray();
		
		//sort two char arrays
		Arrays.sort(chArr1);
		Arrays.sort(chArr2);
		//compare two char values
		return Arrays.equals(chArr1, chArr2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1=  sc.nextLine();
		String str2=  sc.nextLine();
		Boolean result = strCheck(str1, str2);
		System.out.println(result);
		sc.close();

	}

}
