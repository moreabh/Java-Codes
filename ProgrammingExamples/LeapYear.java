import java.util.*;
class LeapYear
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Year: ");

		int year = sc.nextInt();
		if((year%4==0  && year%100!=0) || (year%400==0))
		{
			System.out.println("This is Leap year ");
		}
		else 
			{
				System.out.println("This Is Not Leap Year");
			}
	}
}