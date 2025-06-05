import java.util.Scanner;
class Prime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enterv th number");
		int n = sc.nextInt();
		boolean prime=true;
		for ( int i=2;i<n ;i++ )
		{
			if (n%i==0)
			{ 
				prime=false;
				break;
			}
		}
		System.out.println(prime);	
		}
}
