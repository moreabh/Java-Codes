import java.util.*;
class LowerCase
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch= sc.next().charAt(0);
		String cha=(ch>=97 && ch<=122)? ("Lower case"):("not Lower case");
		System.out.println(cha);
		
		   
	}

}