//18/2
class HollowPattern11
{
	public static void main(String[]args)
	{
		int n=5;
		for (int i =1;i<=n ;i++ )    //AB
		{
			for (int j=1; j<=n-i;j++ )
			{
				System.out.print("  ");
			}
			for (int j=1;j<=i ;j++ )
			{
				if (j==1 )
				{
			      System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			for (int j=2;j<=i ;j++ )
			{
				if (j==1 || i==j)
				{
			      System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for (int i =n;i>=1 ;i--)    //CD
		{
			for (int j=1; j<=n-i;j++ )
			{
				System.out.print("  ");
			}
			for (int j=1;j<=i ;j++ )
			{
				if (j==1 )
				{
			      System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			for (int j=2;j<=i ;j++ )
			{
				if (j==1 || i==j)
				{
			      System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
/*
        *
      *   *
    *       *
  *           *
*               *
*               *
  *           *
    *       *
      *   *
        *

*/