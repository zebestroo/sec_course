import java.util.Scanner;

public class second_a
{
	public static void main(String[] args)
	{
		System.out.println("Zabolotskii Andrew, February 27, 01:39 a.m.");
		Scanner stp = new Scanner(System.in);
		System.out.println("Number of elements?: ");
		int a = stp.nextInt();
		System.out.println("Write your massive: ");
		int b;
		for(int i = 0; i < a; i++)
		{
			b = stp.nextInt();
			int t = 0;
			double k = b;
			while(k % 10 >= 1)
			{
				t++;
				k /= 10;
			}
			int w = 0;
			int p = b;
			for(int j = 1; j <= t; j++)
			{
				w += Math.pow(10,t-j)*(p%10);
				p /= 10;
			}
			if(w == b)
				System.out.println(b + " - Polyndrom");
		}
	}
}
