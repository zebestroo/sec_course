import java.util.Scanner;

public class first
{
	public static void main(String[] args)
	{
		System.out.println("Number of elements?");
		Scanner stp = new Scanner(System.in);
		int a = stp.nextInt();
		System.out.println("Okay let's do it!");
		int A[];
		A = new int[a];
		for(int i = 0; i < a; i++)
		{
			A[i] = stp.nextInt();
			System.out.println(A[i]);
		}
		stp.close();
		for(int i = 0; i < a; i++)
		{	
			if( A[i] == 1 || A[i] == 2)
			{
				System.out.println("Simple number: ");
				System.out.println(A[i]);
			}
			else
			{
				boolean k = true;
				int t = 2;
				while(t != A[i])
				{
					if(A[i] % t == 0)
						k = false;
					t++;
				}
				if(k)
				{
					System.out.println("Simple number: ");
					System.out.println(A[i]);
				}
			}
		}
		
	}
}
