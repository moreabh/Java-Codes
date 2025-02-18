//17/2
class Pattern17
{
	public static void main(String[]args)
	{
		
		for (char i ='a';i<='d' ;i++ )
		{
			for (char j='a';j<=i ;j++ )
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
/*
a
a b
a b c
a b c d
*/