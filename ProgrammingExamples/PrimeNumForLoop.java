import java.util.*;
class PrimeNumForLoop
{
public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int num = sc.nextInt();
		int count = 0;
	
		for (int i=2;i<num;i++)
		{
			
			if (num%i==0)
			{
				System.out.println(num+" is not prime number ");
				count++;
				break;
	
			}

		}
		System.out.println((count==0)?(num+" is a prime number"):(""));
		
		
	}
}