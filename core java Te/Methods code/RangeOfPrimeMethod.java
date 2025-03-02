//Range of prime 
class RangeOfPrimeMethod
{
	public static void main(String[]args)
	{
		for (int start=1;start<=100 ;start++ )
		{
			if (isPrime(start))
		{
			System.out.println(start);
		}
		}
		
		
	}
	public static boolean isPrime(int num)
	{
		int den=2;
			if (num==1)
			{
			   return false;
			}
		for (;den<num ;den++ )
		{
		
			if (num%den==0)
			{
				return false;
			}
			
		}
		return true;
	}

}
/*
1
2
3
5
7
11
13
17
19
23
29
31
37
41
43
47
53
59
61
67
71
73
79
83
89
97
*/