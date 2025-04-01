class StatVar2
{
	static double balance;
	public static void main(String[]args)
	{
		credit(5000.0);
		debit(500.0);
	}
	public static void debit(double amt)
	{
		if (amt>0 && balance-amt>1000)
		{
			balance = balance - amt;
			System.out.println("Amount Debited!");
			System.out.println("Your Current Balance is "+balance);
		}
		else
		{
			System.out.println("Invalid Amount");
		}
	}
	public static void credit(double amt)
	{
		if (amt>0)
		{
			balance = balance + amt;
			System.out.println("Amount Credited");
			System.out.println("Your current Balance is "+balance);
		}
		else
		{
			System.out.println("Invalid Amount");
		}
	}
}

/*
Amount Credited
Your current Balance is 5000.0
Amount Debited!
Your Current Balance is 4500.0
*/