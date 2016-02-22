package StringNArraysCTC;
import java.util.*;
public class ReverseString {

	//without stack
	public static String reverse1(String s)
	{
		char[] cArr= s.toCharArray();
		char[] rev= new char[cArr.length];
		for(int i=cArr.length-1,j=0; i>=0;i--,j++)
		{
			rev[j] = cArr[i];
		}
		return String.valueOf(rev);
	}
	//with stack
	public static String reverse2(String s)
	{
		
		Stack<String> stack=new Stack<String>();
		char[] cArr= s.toCharArray();
		StringBuilder strb=new StringBuilder();
		String str="";
		for(char ch:cArr)
		{
			stack.push(String.valueOf(ch));
		}
		while(!stack.isEmpty())
		{
			str = str.concat(stack.pop());
		}
		return str;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=  sc.nextLine();
		String revStr = reverse2(str);
		System.out.println(revStr);
	}

}
