//CoPrime Number (The no whoes HCF becomes 1 they are coPrime)
class coPrime
{
	public static void main(String[]args)
	{
		System.out.println("hcf :"+hcf(10,7));
		System.out.println(isCoPrime(7,3));
	}
	public static int hcf(int n1,int n2)
	{
		int small = n1<n2 ? n1 : n2;
		while (true)
		{
			if (n1%small==0 && n2%small==0)
			{
				return small;
			}
			small--;
		}
	}
	public static boolean isCoPrime(int n1,int n2)
	{
		return hcf(n1,n2)==1;
	}
}
/*
hcf :1
true
*/