import java.util.Scanner;
class ProductOf
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int pro=1;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				pro=pro*i;
			}
		}
		System.out.println(pro);
	}
}
