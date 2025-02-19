import java.util.*;
class AutomorphicNumber
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num= sc.nextInt();
		int length = 0;
		int div =1;

		for (int i= num;i>0 ;i/=10) 
		{
			length++;

		}
		for (int i=1;i<=length ;i++ )
		{
			div = div*10;

		}
		if (num == (num*num)%div)
		{
			System.out.println(num+" is a Automorphic Number ");
		}
		else 
		{
			System.out.println(num+ " is not a Automorphic number ");
		}
	}
}
/*Automorphic no :- when we take a squar of a number and the sqr contains 
the same no at last then it is AUTOMORPHIC NO.
EX:- num =5;
    sqr of 5 is 25 and 25 contain 5 at last*/ 