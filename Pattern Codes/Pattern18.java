//17/2
class Pattern18
{
	public static void main(String[]args)
	{
		int a=0;
		int b=1;
		for (int i=1;i<=4 ;i++ )
		{
			for (int j=1;j<=i;j++ )
			{
				if ((i+j)%2!=0)
				{
					System.out.print(a+ " ");
				}
				else 
				{
					System.out.print(b+" ");
				}
			}
			System.out.println();
		}
	}

}
/*
1
0 1
1 0 1
0 1 0 1
*/