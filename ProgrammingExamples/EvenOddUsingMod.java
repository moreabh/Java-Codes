import java.util.Scanner;
class EvenOddUsingMod
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a num:-");
		int num = sc.nextInt();
		System.out.println(num%2==0);
		//System.out.println((num/2)==(num/2.0));
		//System.out.println((num/2)*2==num);
	}
}