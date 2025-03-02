//Rane of Armstrong
class RangeOfArmstrongMethod
{
	public static void main(String[]args)
	{
		for (int start=1;start<=100000 ;start++ )
		{
			if (isArmstrong(start))
			{
				System.out.println(start);
			}
		}
		
	}
	public static boolean isArmstrong(int num)
	{
		int ct = count(num);
		int sum = 0;

		for (int i=num;i!=0 ;i/=10 )
		{
			sum = sum  + power(i%10,ct);
		}
		return num==sum;
	}
	public static int count(int num)
	{
		int ct = 0;
		while (num!=0)
		{
			num=num/10;
			ct++;
		}
		return ct;
	}
	public static int power(int digit,int ct)
	{
		int pow =1;
		for (int i=0;i<ct;i++ )
		{
			pow = pow*digit;
		}
		return pow;
	}
}
/*
1
2
3
4
5
6
7
8
9
153
370
371
407
1634
8208
9474
54748
92727
93084
*/