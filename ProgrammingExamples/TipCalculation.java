import java.util.Scanner;
class TipCalculation

{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The bill:-");
		float bill= sc.nextFloat();
		System.out.print("Tip Rate:");
		float tipRate=sc.nextFloat();

		float tipAmount = (tipRate*bill)/100;
		float totalBill = bill+tipAmount;
		System.out.println("totalBill is:"+totalBill);
		System.out.println("Tip added is:"+ tipAmount);
	}


}