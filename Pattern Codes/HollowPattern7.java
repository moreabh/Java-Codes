//18/2
class HollowPattern7
{
	public static void main(String[]args)
	{
		int n=5;

        for (int i =n;i>=1 ;i--)    //C
		{
			for (int j=1; j<=n-i;j++ )
			{
				System.out.print("  ");
			}
			for (int j=1;j<=i ;j++ )
			{
				if (j==1 || i==5 || i==j)
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
* * * * *
  *     *
    *   *
      * *
        *
*/