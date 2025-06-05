import java.util.Scanner;
class ReverseNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int temp=num;
		int num =sc.nextInt();
		int rev=0;
		while(temp!=0)
		{
			int ld=temp%10;
			rev = rev*10+ld;
			temp=temp/10;
		}
		if(temp==rev)
		System.out.println("palidrome");

	}
}
