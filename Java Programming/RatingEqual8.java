import java.util.Scanner;
class  RatingEqual8
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the value a:");
		int a = sc .nextInt();
		System.out.print(" Enter the value b:");
		int b = sc .nextInt();
		if((a>=8)||(b>=8))
		{
			System.out.print("two");
		}
		else if((a<=2)||(b<=2))
		{
			System.out.print("zero");
		}
		else
		{
			System.out.print("one");
		}
	}
}
		
		
