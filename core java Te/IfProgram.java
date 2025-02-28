//if statement
import java.util.*;
class IfProgram
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("______________Game Starts_______________");
		System.out.println("**First Task Starts** ");
		System.out.println("Enter your luck: ");
		int num = sc.nextInt();
		if (num>=0 && num<=9)
		{
			System.out.println("Yeyyyy!!! You entered your luck");
			System.out.println("**Second Task Starts** ");
			System.out.println();
			System.out.println("Enter your luck: ");
			int num2 = sc.nextInt();

			
			if (num2==num)
			{
				System.out.println("Somthing special message for you :) ");
				System.out.println();
				System.out.println("Yeyyy!! have a happy life you have");
			}
			else
			{
				System.out.println("ohhh! you enterd wrong no, Try Again");
			}
		System.out.println("______________Game Ends_____________");
		}
	}

}
