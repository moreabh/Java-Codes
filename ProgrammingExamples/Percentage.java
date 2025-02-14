import java.util.*;
class Percentage
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks:-");
		int marks= sc.nextInt();

		float per=(marks*100)/600;
		System.out.println(per);

		String op=(per>=75)?("A grade pass"):((per<75 && per>=60)?("B grade Pass"):((per<60&&per>=35)?("C grade pass"):((per<35&&per>=1)?("fail"):("Enter Valid Marks"))));
		System.out.println(per+ "%"+op);
	}


}