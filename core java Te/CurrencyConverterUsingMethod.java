import java.util.*;
class CurrencyConverterUsingMethod
{
	public static void main(String[]args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Main Starts");
		System.out.println("Enter the rupee value: ");
		double rupee = sc.nextDouble();
	
		rupeeToDollar(rupee);
		System.out.println("Main Ends");

	}

	public static void rupeeToDollar(double rupee)
	{
		System.out.println();
		System.out.println("rupee Starts");

		double dollar = rupee/87.15;
		System.out.println("rupee to Dollar: "+dollar);
		dollarToEuro(dollar);

		System.out.println("rupee Ends");

	}
	public static void dollarToEuro(double dollar)
	{
		System.out.println();
		System.out.println("dollar Starts");

		double euro = dollar * 0.95;
		System.out.println("dollar to euro : "+euro);
		euroToDirhams(euro);

		System.out.println("dollar ends");
	}
	public static void euroToDirhams(double euro)
	{
		System.out.println();
		System.out.println("dirhams Starts");
		
		double dirhams = euro * 3.85;
		System.out.println("euro to dirhams: "+dirhams);
		System.out.println();

		System.out.println("dirhams Ends");
	}



}