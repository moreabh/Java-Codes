//Recursion Power
class RecPower
{
	public static void main(String[]args)
	{
		System.out.println("Power: "+recPower(2,2));
		
	}
	public static int recPower(int base,int raise)
	{
		if (raise==0)
		{
			return 1;
		}
		return base*recPower(base,raise-1);
	}
}