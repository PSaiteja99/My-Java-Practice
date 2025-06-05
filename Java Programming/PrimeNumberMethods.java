import java.util.Scanner;
class PrimeNumberMethods
{
	public static int countoffactors(int n)
	{
				
		int count=0;
		for (int i=1;i<=n;i++)
			{
			if(n%i==0)
			count++;
			}
			return count;
	
			
	}
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the number:");
		int n= sc.nextInt();
		if(countoffactors(n)==2)
		{
			System.out.println("it is a prime number");
		}
		else
		{
			System.out.println("it is  not a prime number");
		}
	}

		
}
