import java.util.*;
class SumOfFactors
{
public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int cnt = 0;
		int sum = 0;
			
		System.out.println("Factors: ");
		for (int i=1;i<=num;i++)
		{
		//System.out.println(i);
			if (num%i==0)
			{
				System.out.println(i);
				cnt++;
				sum += i;
			}
			
		}
		System.out.println("Sum Of Factors: "+sum);
		System.out.println("Count: "+cnt);
		
		
		
	}
}