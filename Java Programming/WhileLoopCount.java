import java.util.Scanner;
class WhileLoopCount
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer the numbrer:");
		int num =sc.nextInt();
		int count=0;
		while(num!=0)
		{
			count++;
		
			num=num/10;
		}
			System.out.println(count);
	}
	
}
