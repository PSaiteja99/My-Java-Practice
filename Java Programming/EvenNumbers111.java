import java.util.Scanner;
class EvenNumbers111 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int x=sc.nextInt();
		for (int n =1;n<=x;n++)
		{
			for (int i =1;i<=n;i++)
			{
				if(n%2==0)
				{
					System.out.println(n+"it is an even number:");
					break;
				}
			}
		}
				
	}
			
	
}
