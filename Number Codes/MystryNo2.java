//Mystry Number
class MystryNo2
{
	public static void main(String[]args)
	{
		System.out.println(isMystry(121));
	}
	public static boolean isMystry(int num)//121
	{
		for (int i=1;i<num ;i++ )
		{
			for (int j=i;j>0;j/=10 )
			{
				int rev=0;
				int rem = j%10;//1 
				rev = rev*10+rem;//1

				int add =j+rev; //1+1=2 
				if (add==num)
				{
					return true;
				}
			}
	}
	return false;
}
}