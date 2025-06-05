import java.util.Scanner;
class AutomorphicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Ente the number:");
		int num=sc.nextInt();
		int square=num*num;
		boolean isAutomorphic=true;
		while(num!=0)
		{
			if((num%10)!=(square%10))
			{
				isAutomorphic=false;
				break;
			}
			num=num/10;
			square=square/10;
		}
		if(isAutomorphic)
		{
			System.out.println("it is an autmorphic number");
		}
		else
		{
			System.out.println("it is not an autmorphic number");
		}
	}
}
