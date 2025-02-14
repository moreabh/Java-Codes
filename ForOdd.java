class ForOdd
{
	public static void main(String[]args)
	{
		System.out.println("Odd no. from 100 to 0");
		for (int i=100;i>=0 ;i--)
		{
			if (i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
}