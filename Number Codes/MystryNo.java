//Mystry Number
class MystryNo
{
	public static void main(String[]args)
	{
		System.out.println(isMystry(50));
	}
	public static boolean isMystry(int num)
	{
		for (int i=1;i<num ;i++ )
		{
			int rev=0;
			int dup = 0;
			for (int j=i;j>0;j/=10 )
			{

				int rem = j%10;
				rev= rev*10+rem;
				
				dup = rev;
			 }
			 
			 if (rev<num)
				{
				int add = i+ rev; 
				    if (add == num)
				    {
					System.out.println("Num: "+num);
					System.out.println(i+"+"+rev +"="+add);
					return true;
				    }
				
				}	
		}
	return false;
	}
}
/*
Num: 121
29+92=121
true
*/