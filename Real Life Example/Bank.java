import java.util.*;
class Bank
{

public static void main(String[]args)
	{
	Scanner sc = new Scanner(System.in);
	String username1 = null;
	String passward1 = null;
	String address = null;
	long contact = 0;
	double balance = 0.0;

	for (; ; )
	{
	
		
		System.out.println();
		System.out.println("*********WELCOME*********");
		System.out.println();
		System.out.println("        GANESHA BANK    ");
		System.out.println("1.EXISTING ACCOUNT");
		System.out.println("2.CREATE NEW ACCOUNT");
		System.out.println();
		System.out.println("Enter a Option: ");
		int opt = sc.nextInt();
	
		if (username==null)
		{
			System.out.println("CREATE ACCOUNT FIRST");
			continue;
		}
		
		System.out.println("LOGIN");
		System.out.println();



		for (int i=3;i<=1 ;i++ )
		{
		
	
			System.out.println("USERNAME");
			String username = sc.next();
			System.out.println("PASSWARD");
			String passward = sc.next();
			if (username.equals(username1) && passward.equals(passward1))
			{
				home;
				for ( ; ; )
				{
					System.out.println();
					System.out.println("HOME PAGE");
					System.out.println();
					System.out.println("1.DEPOSIT");
					System.out.println("2.WITHDRAW");
					System.out.println("3.CHECK BALANCE");
					System.out.println("4.MINI STATEMENT");
					System.out.println("5.LOGOUT");
					System.out.println();
					System.out.println("Enter an option: ");
					int opt2 = sc.nextInt();
					System.out.println();
					break;
				}
			}
		}

	}


		         
	}
}
/*option 1/2
create account 
username
welcome
login
x 3 pass
exit
deposit withdraw*/