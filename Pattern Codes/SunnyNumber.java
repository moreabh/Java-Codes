//Sunny Number 
import java.util.*;
class SunnyNumber
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();

		int sum_Of_Digit =0;
		int sum_Of_Square_of_Digit = 0;
		int dup = num;

		while (dup>0)
		{
			int rem = dup % 10;
			sum_Of_Digit = sum_Of_Digit + rem;
			sum_Of_Square_of_Digit = sum_Of_Square_of_Digit + (rem*rem);
			dup /=10;
		}
			
			int sum2 = 0;
			while (sum_Of_Square_of_Digit > 0)
			{
				int  rem = sum_Of_Square_of_Digit % 10;
				 sum2 = sum2 + rem ;
				 sum_Of_Square_of_Digit = sum_Of_Square_of_Digit/10;

			}

			if (sum_Of_Digit == sum2)
			{
				System.out.println(num+" is Sunny Number");
			}
			else 
			{
				System.out.println(num+" is Not Sunny Number");
			}
		

	}
}