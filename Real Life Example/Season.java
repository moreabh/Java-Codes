import java.util.*;
class Season
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a month:- ");
		String month=sc.next().toUpperCase();
		
		String op=
			(month.equals("FEB"))||(month.equals("MARCH"))||
			(month.equals("APR"))||(month.equals("MAY"))?     ("SUMMER"):
			(month.equals("JUNE"))||(month.equals("JULY"))||
			(month.equals("AUGUST"))||(month.equals("SEP"))?  ("MANSOON"):
			(month.equals("OCT"))||(month.equals("NOV"))||
			(month.equals("DIC"))||(month.equals("JAN"))?     ("WINTER"):
			("INVALID MONTH");
		System.out.println(op);
	}
}