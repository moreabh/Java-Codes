import java.util.*;
class ReverseString
{
	public static void main(String[]args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String: ");
	String str = sc.next();
	String rev="";

	for (int i=0;i<str.length();i++)
	{
		//for reverse string

		rev = str.charAt(i)+rev;
		
	}
	System.out.println(str+":"+rev);


	
	}
}

//Second logic
	/*for (int i=str.length()-1;i>=0 ;i--)
	{
		rev = rev +str.charAt(i);
		System.out.println("rev"+rev);
	}*/
//For as it is string:  rev = rev+str.charAt(i);