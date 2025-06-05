import java.util.Scanner;
class CountOFFactorss 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the number:");
		int n= sc.nextInt();
		int x=0;
		for (int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
			 x++;
			}
			
		}
			
		if(x==2)
			{
			System.out.println("it is a prime numbrer:");
			}
		else
			{
			System.out.println("it is not a prime number:");
			}
		

		}
	
}
