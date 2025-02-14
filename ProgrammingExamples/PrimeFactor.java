import java.util.Scanner;

class PrimeFactor
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int num = sc.nextInt();
		System.out.println("Prime Factors:");
		for(int i=2;i<=num;i++)//3,4,5,6
		{
			if(num%i == 0)
			{
			
				int cnt = 0;// 
				
				for (int j = 2;j<i ;j++ )//
				{
					if(i%j == 0)
					{
						cnt++;
					}
				}
				if(cnt == 0)
					{
					System.out.println(i);//2,3
					}			
			}	                               
		}
		
	}
}

