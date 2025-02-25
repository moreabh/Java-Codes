import java.util.*;
class KrishnamurtiNumber
{
    public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Starting number: ");
		int num = sc.nextInt();
		System.out.println("Enter Ending number: ");
		int end = sc.nextInt();
		for (int j=num;j<=end ;j++ )
		{
		
		int sum = 0;
		int dup = num;
		while (num>0)
		{
			int rem = num%10;
			int fact = 1;
			for (int i=1;i<=rem ;i++ )
			{
				fact*=i;
			}
			sum+=fact;
			num/=10;
		}
		if (sum == dup)
		{
			System.out.println("Krish");
		}
	}
	}

}                                                        