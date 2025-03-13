//lazy no
class LazyNo2
{
	public static void main(String[]args)
	{
		System.out.println(lazyNo(0,10));
	}
	
	public static int lazyNo(int start,int end)
	{
		int sum = 0 + 1;
		for (int j=1;j<=end;j++ )
		{              
			int ans = sum + j;
			System.out.println(sum);
			sum = ans;			
		
		}
		return sum ;
	}	
}
/*Lazy Numbers
1
2
4
7
11
16
22
29
37
46
56
*/