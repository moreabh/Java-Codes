import java.util.*;
class  
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:-");
		int num=sc.nextInt();

		String op=(num%2==0 && num%5==0)?"HitwoHifive":(num%2==0)? ("hiTwo"):((num%5==0)?("Hifive"):("blank"));
		System.out.println(op);
		
	}


} 