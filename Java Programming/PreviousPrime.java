import java.util.Scanner;
class PreviousPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int x = sc.nextInt();
		for(int n=(x-1);true;n--)
		{
			int count=0;
			for (int i =1;i<=n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println("previous prime number"+n);
				break;
			}
		}
	}
}
