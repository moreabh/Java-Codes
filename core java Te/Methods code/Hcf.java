//HCF (Highest comman Factor)
class Hcf
{
	public static void main(String[]args)
	{
		System.out.println(hcf(4,12));
	}
	public static int hcf(int n1,int n2)
	{
		int small= n1<n2 ? n1:n2;
		while (true)
		{
			if ((n1%small)==0 && (n2%small==0))
			{
				return small;
			}
			small --;
		}
	}
}
//4