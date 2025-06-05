import java.util.Scanner;
class AutomorphicAftrerNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int x=sc.nextInt();
		for(int num=(x+1);true;num++)
		{
			int temp=num;
			int square=temp*temp;
			boolean isAutomorphic=true;
			while(temp!=0)
			{
				if((temp%10)!=(square%10))
				{
					isAutomorphic=false;
					break;
				}
				temp=temp/10;
				square=square/10;
			}

		
			}
	
	}
}
