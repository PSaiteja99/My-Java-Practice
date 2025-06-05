import java.util.Scanner;
class Bill
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bill amount:");
		double bill =sc.nextDouble();
		if(bill>=5000)
		{
			System.out.println("You got 18% discount:");
			System.out.println("you are final bill:"+0.82*bill);
		}
		else
		{
			System.out.println("You got 8% discount:");
			System.out.println("you are final bill:"+0.92*bill);
		}
	}
}
