import java.util.*;
class Loan
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr Months:");
		float month=sc.nextFloat();
		double years = Math.round((month / 12.0) * 10) / 10.0;
		System.out.println(years);
		


	}
	

}