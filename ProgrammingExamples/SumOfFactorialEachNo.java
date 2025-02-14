import java.util.*;
class SumOfFactorialEachNo{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int factorial=1;
		int sum = 0;
		while (num>0)
		{
		int rem = num%10;
		for (int i=rem;i>=1 ;i--)
		{
			//System.out.println(i);
			factorial = factorial*i;

		}
		sum = sum+factorial;
		}
		
		
		System.out.println("Sum: "+sum);
	}
}