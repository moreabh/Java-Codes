//17/2
class Pattern21
{
	public static void main(String[]args)
	{
		char a='a';
		int b=1;
		for (int i=1;i<=5;i++ )
		{
			for (int j=1;j<=i;j++ )
			{
				if (i%2==0)
				{
					System.out.print(b+" ");
					b++;
				}
				else
				{
					System.out.print(a+" ");
					a++;
				}
			}
			System.out.println();
		}
	}

}
/*
a
1 2
b c d
3 4 5 6
e f g h i
*/