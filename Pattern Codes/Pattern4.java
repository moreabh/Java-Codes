//not for interview
class Pattern4
{
 public static void main(String[]args)
 {
	 int n=7;
	for (int i=0;i<n ;i++ )
	{
		for (int j=0;j<n ;j++ )
		{
			if (j==n/4 || j==n/2+n/4 ||i==n/4 || i=3*n/4 ||
				i==0 && j>3*n/4 ||j==n-1 && i>=3*n/4 || i==n-1 
				&& j>=3*n/4 || i==n)
			{ 
				System.out.print("*"+" ");
			}
			else 
			{
				System.out.print(" "+" ");
			}
		}
		System.out.println();
	}
 }
}