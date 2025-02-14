class FrequencyOfHighestRepeatedNo1
{
	public static void main(String[]args)
	{
	long num = 122222145554444444l;
	int max=0;
	int dup=0;
	
	System.out.println(num);
	for (int i=0;i<=9 ;i++ )
	{
		
		int cnt =0;
		for (long j=num;j>0 ;j=j/10 )
		{
			long rem = j%10; 
			if (i == rem)
			{
				cnt++;
			}
		}
		   if (cnt!=0)
		   {
			System.out.println(i+":"+cnt);
			
		   }
		   if (max<cnt)
			{
				max =cnt;
				dup = i;
				
			}


	}
	System.out.println("Maximum Frequency of no "+dup+" is "+max);
	
	
	}
}