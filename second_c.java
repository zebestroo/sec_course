import java.lang.Math;
import java.util.Scanner;

public class second_c
{
	public static void main(String[] args)
	{
		Scanner stp = new Scanner(System.in);
		System.out.println("Number of elements?: ");
		int n = stp.nextInt();
		double A[][] = new double[n][n];
		double B[][] = new double[n][n];
		for(int i = 0; i < n; i++)
		{
			System.out.println();
			for(int j = 0; j < n; j++)
			{
				A[i][j] = Math.random()*(2*n+1)-n;
				System.out.print(A[i][j]+" ");
			}
		}
		System.out.println();
		for(int i = 0; i < n; i++)
			B[0][i] = A[0][i];

		for(int i = 0; i < n; i++)
		{
			double res_mat[] = new double[n-i];
			for(int s = 0; s < n-i; s++)
			{
				if(A[i][i] == 0)
					continue;
				res_mat[s] = A[i][i+s]/A[i][i];

			}
		

			for(int s = 1+i; s < n; s++)
			{
				double kof = A[s][i];
				for(int j = 0; j < n-i; j++)
					B[s][i+j] = A[s][i+j] - res_mat[j]*kof;
			}
		}
		double det = 1;
		for(int i = 0; i < n; i++)
				det *= B[i][i];
		System.out.println("Determinator of Matrix: " + det);

	}
}
