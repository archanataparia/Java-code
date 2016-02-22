/*1.7 Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
column are set to 0.*/
package StringNArraysCTC;

import java.util.Scanner;

public class FIndZeroInMatrix {
	static void findZeroInMatrix(int[][] a, int m, int n)
	{
		for (int i=0;i<m;i++){
			for (int j=0;j<n;j++)
			{
				if(a[i][j]==0)
				{
					
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] a = new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				a[i][j]=sc.nextInt();
		}
		
		findZeroInMatrix(a,m,n);
		sc.close();

	}

}
