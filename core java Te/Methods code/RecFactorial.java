//Recursion Factorial
class RecFactorial
{
	public static void main(String[]args)
	{
		System.out.println(recFact(5));
		
	}
	public static int recFact(int num)
	{
		if (num==0)
		{
			return 1;

		}
		return num*recFact(num-1);  
	}
}