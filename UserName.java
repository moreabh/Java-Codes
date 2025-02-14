import java.util.*;
class UserName
{
	public static void main(String[]args)
	throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String un = sc.nextLine().toUpperCase();//String un = sc.next().toUpperCase(); ->to fetch only one word
		int length = un.length();

		for (int i=0;i<length ;i++)
		{
			System.out.print(un.charAt(i));
			Thread.sleep(1000);
		}

	}
}