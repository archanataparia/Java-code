import java.util.Scanner;

public class Staircase {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		for (int i = N; i>=0; i--)
		{	
			for (int j =1; j<=N;j++)
			{
				if((i/j)>0)
				{
					System.out.print(" ");
				}
				else
				{	
					System.out.print("#");
				}
			}
			System.out.println();
			//System.out.println("i"+i);
		}
		
	}
}
