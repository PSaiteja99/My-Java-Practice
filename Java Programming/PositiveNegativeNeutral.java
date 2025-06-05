import java.util.Scanner;
class PositiveNegativeNeutral 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n =  sc.nextInt();
		if(n>0)
		{
			System.out.println(n+"given nuber is positive:");
		}
		else if(n<0)
		{
			System.out.println(n+"given  number is a negative number:");
		}
		else
			{
			System.out.println("it is a nutral number:");
			}

	}
}
