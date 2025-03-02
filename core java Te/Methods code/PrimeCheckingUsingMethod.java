//Checking prime using method
import java.util.*;
class PrimeCheckingUsingMethod
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int ip = sc.nextInt();
		int rev = reverse(ip);	

		if (ip==rev && isPrime(ip))
		{
			System.out.println("Is a Palindromic prime number");
		}
		else{
			System.out.println("Not a Palindromic prime Number");
		}
	}
	public static boolean isPrime(int num)
	{
		System.out.println("Prime Start");
		int den = 2;

		for (;num>den;den++)
		{
			if (num%den == 0)
			{
				break;
			}
			return num==sum;
		}
	}
	
	
}