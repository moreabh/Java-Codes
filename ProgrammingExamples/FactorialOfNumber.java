import java.util.*;
class  FactorialOfNumber
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int factorial=1;
		
		
		for (int i=num;i>=1 ;i--)
		{
			//System.out.println(i);
			factorial = factorial*i;
		}
		System.out.println("Factorial: "+factorial);
	}
}