//Recursion Fabinacci 
class RecFabbinacci
{
	public static void main(String[]args)
	{
		recFibo(5,0,1);
		
	}
	public static void recFibo(int n, int n1, int n2)
	{
	
		if (n>0)
		{
			int n3 = n1+n2;
			System.out.println(n1);

			recFibo(--n,n2,n3);
		}
		
		return ;
	}
	 
}
/*
0
1
1
2
3
*/