//RectangleThreeByFour
class RectangleThreeByFour
{
	public static void main(String[]args)
    {
	int n = 4;
	             	// 4<4	
	     for(int i=0;i<n;i++)//1 2 3 4
	     {
		    // 3<3
	        for(int j=0;j<n-1;j++)//0 1 2 3 | 1 2 3 |1 2 3 |1 2 3
	         {
	           System.out.print(" * ");
             }
	      System.out.println();
        }
     }
}
/*
* * * 
* * *
* * *
* * *
*/