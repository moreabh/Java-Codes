class ISBNNumber 
{
	public static void main(String[]args)
	{
		long num = 1259060977;
		int sum = 0;
		for (long i=num,j=1;i>0 ;i /=10,j++ )
		{
			
			long rem =i%10;
			sum +=(rem*j);
			
		}
		System.out.println(sum);
		if (sum%11==0)
		{
			System.out.println(num+"is valid ISBN number");
		}
		else 
		{
			System.out.println(num+"is not valid ISBN number ");
		}
	}
}