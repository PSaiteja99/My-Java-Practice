import java.util.Scanner;
class PrimeNumbersFrom1To100 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  the number:");
		int a = sc.nextInt();
		
		for(int n=2;n<=a;n++)
		{
			int count=0;
			for (int i=1;i<=n;i++ )
				{
				if (n%i==0)
					{
				     count++;
					}
				}
				if (count==2)
				{
					System.out.println(n);
				}
			
				
		}
			
		
	}
}
