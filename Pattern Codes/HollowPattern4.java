//18/2
class HollowPattern4
{
	public static void main(String[]args)
	{           //BD
		int n=4;
		for (int i = 1; i < n; i++) /* B */
		{
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = n; i >= 1; i--) /* D */
		{
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
/*

      *
    * *
  * * *
* * * *
  * * *
    * *
      *
*/