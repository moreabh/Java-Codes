//Unique Number Logic 2 Using cnt
class UniqueNo2
{
	public static void main(String[]args)
	{
		System.out.println(isUnique(5123546));
	}
	public static int isUnique(int num)
	{
		int cnt=0;
		for (int i=num;i>0;num/=10 )
		{
			int rem1 = num%10;
			i/=10;
			System.out.println("i="+i);
			for (int j=i;j>0;j/=10)
			{
				int rem2 = j%10;
				if (rem1==rem2)
				{
					System.out.println(+rem1+":"+rem2);
					cnt++;
					System.out.println("cnt:"+cnt);
					System.out.println("Is not unique Number");
					
					return cnt;
				}	
			}
		}
		System.out.println("Is Unique Number");
		return cnt;
	}	
}
/*
i=512354
i=51235
i=5123
5:5
cnt:1
Is not unique Number
1
*/