//79 108 139 176 217
class Series3
{
	public static void main(String[]args)
	{
		int num = 79;
		boolean isPrime=true;
		for (int i=29;i<217;i++)
		{
		
		for (int j=2;j<i;j++)
		{
			if (i%j==0)
			{
			 isPrime = false;
				break;
			}
		}
		
		if (isPrime)
		{
			System.out.println(num+" ");
			num = num +i;
		}
	   }
	}
}