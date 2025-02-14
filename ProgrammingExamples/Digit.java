import java.util.*;
class Digit
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a digit:");
		int digit= sc.nextInt();
		String op=(digit>=0 && digit<=9)? ("is a digit"):("is not a digit");
		System.out.println(op);
		
		   
	}

} 