//17/2
class Pattern19
{
	public static void main(String[]args)
	{
		int a=2;
		for (int i=1;i<=4 ;i++ )
		{
			for (int j=1;j<=i ;j++ )
			{
				System.out.print(a+" ");
				a=a+2;
			}
			System.out.println();
		}
	}
}
/*
2
4 6
8 10 12
14 16 18 20
*/