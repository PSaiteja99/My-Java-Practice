import java.util.Scanner;
class EvenNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		for ( int i=1;i<=10;i++)
		{
			if(n%2==0)
			{
				System.out.println(n);
			}
		}
	}
}
