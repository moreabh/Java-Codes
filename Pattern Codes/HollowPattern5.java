//18/2
class HollowPattern5
{
	public static void main(String[]args)
	{
		int n = 5;

		for (int i =1;i<=n ;i++ )    //A
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

        *
      * *
    *   *
  *     *
* * * * *

*/