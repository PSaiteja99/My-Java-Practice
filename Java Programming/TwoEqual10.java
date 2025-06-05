import java.util.Scanner;
class  TwoEqual10
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the value a:");
		int a = sc .nextInt();
		System.out.print(" Enter the value b:");
		int b = sc .nextInt();
		System.out.print(" Enter the value c:");
		int c = sc .nextInt();
		if((a-b>=10)||(b-c>=10)||(c-a>=10)||(b-a>=10)||(c-b>=10)||(a-c>=10))
		{
			System.out.print("true");
		}
		else
		{
			System.out.print("false");
		}
	}
}
		
		
