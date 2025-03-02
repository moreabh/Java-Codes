//Factorial using method
class FactorislUsingMethod
{
	public static void main(String[]args)
	{
		System.out.println(isString(145));
	}
	//checking is String 
	public static boolean isString(int num)
	{
		int sum=0;//145
		for (int i=num;i!=0 ;i/=10 )//145 14 1 0
		{
			int last = i%10;
			sum = sum+factorial(last);//0+120+24+1
		}
		return num==sum;
		
	}
	public static int factorial(int digit)
	{ 
		int fact = 1;//5 20 60 120 120 | 4 12 24 24 | 1
		for (int i=digit;i>0 ;i-- )//4 3 2 1 | 3 2  1 
		{
			fact = fact*i;//
		}
		return fact;
		
	}
}