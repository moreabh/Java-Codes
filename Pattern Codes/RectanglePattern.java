//RectanglePattern
class RectanglePattern
{
	public static void main(String[]args)
	{   
		int n=4; 
		          // 3<3
		for (int i=0;i<n-1 ;i++)//1 2 3
		{
					//3<4 
			for (int j=0;j<n;j++ )//1 2 3 4 | 1 2 3 4 |1 2 3 4 |
			{
				System.out.print(" * ");
			}
			
		}
		System.out.println(" "+" ");
	}
}

/*
* * * * 
* * * *
* * * *
*/