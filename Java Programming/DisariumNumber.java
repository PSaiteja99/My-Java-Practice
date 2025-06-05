class DisariumNumber 
{
	public static void main(String[] args) 
	{
		int num=135;
		int temp=num;
		int count=0;
		while(temp>0)
		{
			count++;
			temp=temp/10;
		}
		int temp1=num;
		int sum=0;
		while(temp1>0)
		{
			int ld=temp1%10;
			int pro=1;
			for (int i=count;i>0;i--)
			{
				pro=pro*ld;

			}
			count--;
			temp1=temp1/10;
		}
		if (sum==num)
		{
			System.out.println("it is a disariumnumvber");
		}
		else
		{
			System.out.println("it is not a disariumnumvber");
		}
	}
}
