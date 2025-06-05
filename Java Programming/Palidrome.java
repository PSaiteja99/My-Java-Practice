import java.util.Scanner;
class Palidrome
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		
		int num =sc.nextInt();
		int temp=num;
		int rev=0;
		while(temp!=0)
		{
			int ld=temp%10;
			rev = rev*10+ld;
			temp=temp/10;
		}
	
		if(num==rev)
		{
		System.out.println("palidrome");
		}
		else
		{
			System.out.println(" it is not a palidrome");
		}

	}
}
