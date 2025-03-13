// Recursion Count Number 
class RecCount
{
	public static void main(String[]args)
	{
		System.out.println(count(1234,0));
	}
	public static int count(int num,int cnt)
	{
		if (num==0)
		{
			return cnt;
		}
		return count(num/10,++cnt);
	}
}