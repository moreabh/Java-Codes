import java.util.*;
class PalindromeString
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = sc.next();
		String rev="";

		for (int i=0;i<str.length() ;i++ )
		{
			rev = str.charAt(i)+rev;

		}
		System.out.println("Checking Palindrome: ");
		
		if (str.equals(rev))
		{
			System.out.println(str+":"+rev+" is palindrome");
		}
		else
		{
			System.out.println(str+":"+rev+" is not palindrome");
		}
	}
}