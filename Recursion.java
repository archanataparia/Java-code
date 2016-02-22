import java.io.*;
import java.util.*;
public class Recursion {
	public int find_gcd(int x, int y)
	{
		//int gcd=0;
		if(x == y)
		{
			return x;
		}
		else
		{
			int max= Math.max(x, y);
			int min = Math.min(x, y);
			return find_gcd(max-min, min);
		}
	}
	public static void main(String[] args) {
		Recursion r= new Recursion();
        Scanner sc=new Scanner(System.in);
        //Take Input
        int a= sc.nextInt();
        int b = sc.nextInt();
        int gcd=r.find_gcd(a,b);
        System.out.println(gcd);
        
    }
 
}
