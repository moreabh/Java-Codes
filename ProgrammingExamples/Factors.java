import java.util.*;
class Factors
{
public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int cnt = 0;
	
		for (int i=2;i<=num-1;i++)
		{
			//System.out.println(i);
			if (num%i==0)
			{
				System.out.println(i);
				cnt++;
			}
		}
		System.out.println("Count: "+cnt);
		
		
		
	}
}