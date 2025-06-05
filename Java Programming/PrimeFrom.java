import  java.util.Scanner;
class PrimeFrom
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		for(int n=2;n<=100;n++)
		{
			boolean isPrime=true;
			for(int i =1;i<n;i++)
			{
				if(n%i==0)
				{
					isPrime=false;
					break;
				}
				if(isPrime)
				{
					System.out.println(n);
				}
			}
		}


		
	}
}
