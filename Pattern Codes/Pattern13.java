//17/2
class Pattern13
{
	public static void main(String[]args)
	{    char a = 'z';
		for (int i =1 ;i<=4 ;i++ )
		{
			for (int j=1;j<=i ;j++ )
			{
				System.out.print(a-- +" ");
			}
			System.out.println();
		}
	}
}
/*
z
y x
w v u
t s r q
*/