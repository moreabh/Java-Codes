//Buzz Number
import java.util.*;
class BuzzNumber
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		if (num%7==0 || num%10==7)
		{
			System.out.println(num+" Is a Buzz Number");
		}
		else 
		{
			System.out.println(num+" Is not a Buzz number");
		}
	}
}