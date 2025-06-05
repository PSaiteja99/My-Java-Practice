import javs.util.Scanner;
class SumOfTwoNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		double a= sc.nextDouble();
		System.out.print("Enter first number:");
		double b= sc.nextDouble();
		System.out.print("Enter the  second number:");
		double c= a+b;
		System.out.print("sum of two numbers:"+c);

	}
}
