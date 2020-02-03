import java.util.Scanner;

//multiple program in a single file
public class Test_Empty_Triangle {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		/*
		// Print First letter of Name
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==i||j==1||j==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}*/
		/*
		// print empty triangle
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==i||j==1||i==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}*/
		/*
		//Print second type empty triangle
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==i||i==1||j==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}*/
		/*
		//Print Empty rectangle
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1||i==1||j==n||i==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}*/
		
		/*
		//Print empty triangle
		int j;
		for(int i=1;i<=n;i++)
		{
			for(int k=i;k<n;k++)
			{
				System.out.print(" ");
			}
			for(j=0;j!=(2*i-1);j++)
			{
				if(j == 0 || j == 2 * i - 2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=(2*n-1);i++)
		{
			System.out.print("*");
		}
		*/
	}
}
