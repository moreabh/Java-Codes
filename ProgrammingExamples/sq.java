// series :- 144  2197  196  3375  256  4913
//           12^2 13^3  14^2 15^2  16^3 17^2 
class sq 
{
	public static void main(String[] args)
	{

		for (int i=12;i<=17 ;i++ )
		{
		int sum = 1;
		if (i%2 ==0)
		{
			for (int j=1;j<=2 ; j++)
			{
				sum=sum*i;
			}
			System.out.print(sum+ " ");
			
		}
			else
				{
				for (int k=1;k<=3 ;k++ )
				{
					sum=sum*i;//13*1 13*13 13*13*13
					
				}
				System.out.print(sum+" ");
				
			}
		


		}
			
			
	}
}
