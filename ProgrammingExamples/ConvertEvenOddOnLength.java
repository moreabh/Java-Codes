import java.util.Scanner;
class ConvertEvenOddOnLength 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int dup = 0;
		int rem = 0;
		int cnt=0;
		while(num>0)
		{
			cnt++;
			rem=num%10;
			dup=dup*10+rem;
			num/=10;
		}

		if(cnt%2==0)
		{
			rem=0;
			while(dup>0)
			{	
				rem=dup%10;

				if(rem%2==0)
				{

				}
				else if(rem ==9)
				{

				}
				else
				{
					rem=rem+1;
				}
				num=num*10+rem;
				dup/=10;
			}	
		}
		else
		{
			rem=0;
			while(dup>0)
			{	
				rem=dup%10;

				if(rem%2==0)
				{
					rem=rem+1;
				}
				num=num*10+rem;
				dup/=10;
			}	
		}
		System.out.println(num);

	
		
	}
}