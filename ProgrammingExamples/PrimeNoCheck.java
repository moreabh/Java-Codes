import java.util.*;
class PrimeNoCheck
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt(); //numerator
		int den=2; //denomenator prime no starts from 2

		while (den<num)
		{
			if (num%den == 0)
			{
				break; 
			}
			den++;
		}
		if (num==den)
		{
			System.out.println(num+"  is Prime");
		}
		else 
		{	
			System.out.println(num+"  is not prime");
		}
	}
}