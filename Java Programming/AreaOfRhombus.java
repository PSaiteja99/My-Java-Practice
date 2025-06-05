import java.util.Scanner;
class  AreaOfRhombus
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the diagonal 1:");
		double d1 = sc.nextDouble();
		System.out.println("Enter the diagonal 2:");
		double d2 = sc.nextDouble();
		double t=(d1*d2)/0.5;
		System.out.println(t);
	}
}
