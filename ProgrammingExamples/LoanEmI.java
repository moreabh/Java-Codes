import java.util.*;
class LoanEmIMonthWise
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("         ss LOAN CALCULATOR          ");
		
		System.out.println("Enter Your Amount: ");
		int amount = sc.nextInt();
		
		System.out.println("Enter Rate Of Interest: ");
		float RateOfInterest =sc.nextFloat();

		float RateOfInterestPerMonth = amount*RateOfInterest/100;
		System.out.println("Per Month Rate Of Interest: "+RateOfInterestPerMonth);

		System.out.println("Enter months you return back the money: ");
		float month = sc.nextFloat();
		float finalRoi = month*RateOfInterestPerMonth;
		System.out.println("Final Rate Of Interest "+finalRoi);

		System.out.print("Your Final Amount with rate of Interest added: ");
		
		float finalAmount = amount+finalRoi;
		System.out.println(finalAmount);

		System.out.print("EMI per month: ");
		float EmI =finalAmount/month;
		System.out.println(EmI);
		//System.out.println("check");
		//float year  = month/12f;
		//System.out.println(year);








	}
}