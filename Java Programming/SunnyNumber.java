import java.util.Scanner;
class SunnyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		num++;
		boolean isSunny=false;
		for(int i=1;i*i<=num;i++)
		{
			if(i*i==num)
			{
				isSunny=true;
			}
		}
		if(isSunny)
		{
			System.out.println("it is a sunny number:");
		}
		else
		{
			System.out.println("it not a sunny number:");
		}

	}
}
