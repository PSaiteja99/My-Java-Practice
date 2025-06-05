import java.util.Scanner;
class  AreaOfThePAralleogram
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Area of the pallelogram:");
		System.out.println("=======================");
		System.out.print("Enter the base of the parlleogram:");
		int b = sc.nextInt();
		System.out.print("Enter the height of the paralloegram:");
		int h =sc.nextInt();
		int a =b*h;
		System.out.print(a);
	}
}
