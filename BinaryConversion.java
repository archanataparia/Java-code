import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class BinaryConversion {
	static boolean CompareBinToHex (String b, String h)
	{
		boolean flag = false;
		
		return flag;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String b= in.nextLine();
		String h= in.nextLine();
			CompareBinToHex(b,h);
	}
}
	/*
	public static void binaryConversion(int num)
	{
		int rem=0;
		Stack<Integer> s = new Stack<Integer>();
		int div = num;
		while (div>0)
		{
			rem = div % 2;
			div = div /2;
			s.push(new Integer(rem));
		}
		while (!s.isEmpty())
		{
			int number = s.pop();
			System.out.print(number);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T= in.nextInt();
		for (int i=0;i<T;i++)
		{
			int n=in.nextInt();
			binaryConversion(n);
		}

	}

}*/
