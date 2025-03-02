//Check Palidromic prime
import java.util.*;
class ChecPalindromicPrime
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();

		if (isPrime(num) && num==rev(num))
		{
			System.out.println("Palindromic Prime");
		}else{
			System.out.println("Not palindromic prime");
		}
	}

	public static int rev(int num)
	{
		int dup = num;
		int rev = 0;
		while (dup>0)
		{
			rev = rev *10 + (dup%10);
			dup/=10;
		}
		return rev;
	}
	
	public static boolean isPrime(int num)
	{
		int den =2;
		for (;den<num;den++)
		{
			if (num%den ==0)
			{
				break;
			}
			
		}
		return num==den;
	}
	
}
/*
Enter a Number:
101
Palindromic Prime
*/