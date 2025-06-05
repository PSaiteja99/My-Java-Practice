import java.util.Scanner;
class Automorphic1To1000

 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int x= sc.nextInt();
		for(int num=1;num<=x;num++)
		{
			int temp=num;
			int square=temp*temp;
			boolean isAutomorphic=true;
			while(temp!=0)
			{
				if(temp%10!=square%10)
				{
					isAutomorphic=false;
					break;
				}
				temp=temp/10;
				square=square/10;
			}
			if(isAutomorphic)
			{
				System.out.println(num);
			}
			
		}
		}
		
	
}
