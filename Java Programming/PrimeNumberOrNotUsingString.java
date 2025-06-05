import java.util.Scanner;
class  PrimeNumberOrNotUsingString
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);

		System.out.println("Enter a number");
		int n =sc.nextInt();
		String ans="prime numbrer";
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				ans=" not aprime number";
				break;
			}
		}
		System.out.println(ans);
	}
}
