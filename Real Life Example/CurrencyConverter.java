import java.util.*;
class CurrencyConverter
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("*****Currency Converter*********");
		System.out.println();
		System.out.println("Enter the amount(INR)");
		float inr=sc.nextFloat();
		System.out.println();

		System.out.println("List Of Currency");
		System.out.println("1.USD");
		System.out.println("2.EUR");
        System.out.println("3.NEPALI");
		System.out.println("4.PAK");
		System.out.println();
		System.out.println("Enter the currency:");
		String curr= sc.next().toUpperCase();

		float conCurr = 0;
		if (curr.equals("USD"))
		{
			conCurr = inr/86.56f;
			System.out.println(inr+"INR= "+conCurr+" USD");
		}
		else if(curr.equals("EUR"))
		{
			conCurr = inr/90.25f;
			System.out.println(inr+"INR= "+conCurr+" EUR");
		}
		else if(curr.equals("NEPALI"))
		{
			conCurr = inr*1.61f;
			System.out.println(inr+"INR= "+conCurr+" NEPALI");
		}
		else if(curr.equals("PAK"))
		{
			conCurr = inr*3.23f;
			System.out.println(inr+"INR= "+conCurr+" PAK");
		}
		else
		{
			System.out.println("INVALID OPTION");

		}


	}


}