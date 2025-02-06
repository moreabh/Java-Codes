import java.util.*;
class PoundToKilogram
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Pounds: ");
		float pounds = sc.nextFloat();
		double kilograms = (double) pounds*(0.453592);
		System.out.println("Pounds To Kilograms: "+kilograms+"kg");

	}


}