import java.util.Scanner;
class  VolumeOfTheCylinder
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("volume of the cylinder:");
		System.out.print("===============================");
		System.out.print("Enter the radius of the cylindere:");
		double r = sc.nextDouble();
		System.out.print("Enter the height:");
		double h = sc.nextDouble();
		System.out.print("volume of the cylinder:");
		double f = 3.14*r*r*h;
		System.out.println(f);
	}
}
