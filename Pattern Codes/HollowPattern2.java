//18/2
class HollowPattern2
{
	public static void main(String[]args)
	{
		int n= 4;
		for (int i = n; i >= 1; i--) /* CD */
		{
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			for (int j = 2; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
/*
* * * * * * *
  * * * * *
    * * *
      *
*/