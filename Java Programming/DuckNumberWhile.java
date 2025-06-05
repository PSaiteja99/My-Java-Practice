import java.util.Scanner;
class DuckNumberWhile
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int pro=1;
		while(num!=0)
		{
			int ld=num%10;
			pro=pro*ld;
			num=num/10;
		}
		System.out.println(pro);
		{
		if(pro==0)
		{
			System.out.println("it is a duck number:");
		}
		else
		{
			System.out.println("it is not a duck number:");
		}
		}
	}
}
