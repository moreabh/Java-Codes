//series 2         6          22            278               65814
//         2^2+2=6  2^4+6=22     2^8+22=278     2^16+278=65814 
class NumberSeriesPrgram2
{
	public static void main(String[]args)
	{
		int ans =0;
		
		for (int pow = 1; pow<=16;pow*=2 )
		{
			int num =1;
			for(int j=1;j<=pow;j++)
			{
				num = num*2;
			}
			ans = ans+num;
			System.out.print(ans+" ");

		}
		
	}
}
